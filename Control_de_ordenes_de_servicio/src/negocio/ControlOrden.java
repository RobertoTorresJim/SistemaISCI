package negocio;

import java.sql.Date;

import Modelo.Orden;
import Modelo.Usuario;
import Persistencia.DAOOrden;
import Presentacion.VentanaLevantamientoOrden;



public class ControlLevantarOrden {
	private DAOOrden daoOrden;
	
	public ControlLevantarOrden(DAOOrden daoOrden ){
		this.daoOrden=daoOrden;
	}
	public void inicia(){
		VentanaLevantamientoOrden ventanLO = new VentanaLevantamientoOrden(this);//Crea un objeto de la clase VentanaP 
		ventanLO.setVisible(true); // Hace Visible la Ventana
	}
	
	public boolean agregarOrden (Date date, String claveO, Usuario usu,String tOrden, String des, boolean statusOrden ){
		boolean agregado;
		Orden or= new Orden (date,claveO,usu,tOrden,des,statusOrden);
		agregado=daoOrden.agregaOrden(or);
		return agregado;
	}
}
