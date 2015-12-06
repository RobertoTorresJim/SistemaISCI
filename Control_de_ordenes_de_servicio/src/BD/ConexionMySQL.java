package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMySQL {
	private static  Statement st ;
	
	private static Connection conexion = null;
    private static String bd = "ORDENES"; // Nombre de BD.
    private static String user = "root"; // Usuario de BD.
    private static String password = ""; // Password de BD.
    // Driver para MySQL en este caso.
    private static String driver = "com.mysql.jdbc.Driver";
    // Ruta del servidor.
    private static String server = "jdbc:mysql://127.0.0.1:3306/" + bd;
 
    public ConexionMySQL() throws SQLException{
    	System.out.println("INICIO DE EJECUCI�N.");
         conectar();
        st= conexion();
    	
    }
        
     /**
     * M�todo neecesario para conectarse al Driver y poder usar MySQL.
     * @return 
     */
    public static Connection conectar() {
        try {
            Class.forName(driver);
           conexion = DriverManager.getConnection(server, user, password);
 
        } catch (Exception e) {
            System.out.println("Error: Imposible realizar la conexion a BD.");
            e.printStackTrace();
        }
		return conexion;
    }
 
    /**
     * M�todo para establecer la conexi�n con la base de datos.
     *
     * @return
     */
    private static Statement conexion() {
        Statement st = null;
        try {
            st = conexion.createStatement();
        } catch (SQLException e) {
            System.out.println("Error: Conexi�n incorrecta.");
            e.printStackTrace();
        }
        return st;
    }
 
    /**
     * M�todo para realizar consultas del tipo: SELECT * FROM tabla WHERE..."
     *
     * @param st
     * @param cadena La consulta en concreto
     * @return
     */
    private static ResultSet consultaQuery(Statement st, String cadena) {
        ResultSet rs = null;
        try {
            rs = st.executeQuery(cadena);
        } catch (SQLException e) {
            System.out.println("Error con: " + cadena);
            System.out.println("SQLException: " + e.getMessage());
            e.printStackTrace();
        }
        return rs;
    }
 
    /**
     * M�todo para realizar consultas de actualizaci�n, creaci�n o eliminaci�n.
     *
     * @param st
     * @param cadena La consulta en concreto
     * @return
     */
    public static int consultaActualiza(Statement st, String cadena) {
        int rs = -1;
        try {
            rs = st.executeUpdate(cadena);
        } catch (SQLException e) {
            System.out.println("Error con: " + cadena);
            System.out.println("SQLException: " + e.getMessage());
            e.printStackTrace();
        }
        return rs;
    }
 
    /**
     * M�todo para cerrar la consula
     */
    private static void cerrar(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                System.out.print("Error: No es posible cerrar la consulta.");
            }
        }
    }
    
    /**
     * M�todo para cerrar la conexi�n.
     */
    public static void cerrar(java.sql.Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (Exception e) {
                System.out.print("Error: No es posible cerrar la conexi�n.");
            }
        }
    }
}
