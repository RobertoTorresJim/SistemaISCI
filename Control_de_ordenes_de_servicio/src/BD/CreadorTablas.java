package BD;

import java.sql.Connection;
import java.sql.Statement;

public class CreadorTablas {

	public static void main(String[] args)
	{

		try
		{
			Connection connection = ConexionMySQL.conectar();
			Statement statement = connection.createStatement();
			
			String sql = "CREATE TABLE Usuarios" + 
	                   "(`IdUsuario` int(5) NOT NULL, " +
	                   " `Nombre` varchar(50) NOT NULL, " + 
	                   " `Apellidos` varchar(50) NOT NULL, " + 
	                   " `NickName` varchar (20) NOT NULL, " + 
	                   " `Pasword` varchar (20) NOT NULL, " + 
	                   " `TipoUsuario` varchar (20) NOT NULL, " + 
	                   " `StatusUsuario` int (1) NOT NULL, " + 
	                   " PRIMARY KEY (`IdUsuario`))" ; 
			statement.executeUpdate(sql);
			
			System.out.println("Tabla de usuario creada exitosamente");

			sql = "CREATE TABLE StatusOrden" + 
	                   "(`IdStatusOrden` int(5) NOT NULL, " +
	                   " `NombreStatus` varchar(50) NOT NULL, " + 
	                   " PRIMARY KEY (`IdStatusOrden`))" ; 
			statement.executeUpdate(sql);
			
			System.out.println("Tabla de Status creada exitosamente");

			sql = "CREATE TABLE Orden" + 
					   "(`IdOrden` int(5) NOT NULL, " +
					   " `IdUsuarioLevanto` int(5) NOT NULL, " + 
					   "`FechaHoraLevantamiento` DATETIME NOT NULL, " +
	                   " `IdStatusOrden` int(5) NOT NULL, " + 
	                   " `TipoOrden` int(1) NOT NULL, " + 
	                   " `Descripcion` varchar(300) NOT NULL, " + 
	                   " `IdUsuarioAsignado` int(5) NOT NULL, " + 
	                   " `FechaUltimoSeguimiento` DATETIME NOT NULL, " + 
	                   " `FechaAsignacion` DATETIME NOT NULL, " + 
	                   " `FechaCierre` DATETIME NOT NULL, " + 
	                   " PRIMARY KEY (`IdOrden`))" ; 
			statement.executeUpdate(sql);
			
			System.out.println("Tabla de Orden creada exitosamente");
			
			sql = "CREATE TABLE BitacoraOrden" + 
					   "(`IdBitacoraOrden` int(5) NOT NULL, " +
					   " `IdOrden` int(5) NOT NULL, " + 
	                   " PRIMARY KEY (`IdBitacoraOrden`))" ; 
			statement.executeUpdate(sql);
			
			System.out.println("Tabla de Bitacora creada exitosamente");
			
			sql = "CREATE TABLE Segimiento" + 
					   "(`IdSegimiento` int(5) NOT NULL, " +
					   " `FechaHoraSeguimiento` DATETIME NOT NULL, " +
	                   " `IdBitacoraOrden` int(5) NOT NULL, " + 
	                   " PRIMARY KEY (`IdSegimiento`))" ; 
			statement.executeUpdate(sql);
			
			System.out.println("Tabla de Segimiento creada exitosamente");
			
			ConexionMySQL.cerrar(statement);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

	
}
