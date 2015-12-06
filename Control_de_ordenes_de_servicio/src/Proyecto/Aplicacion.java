package Proyecto;
import Persistencia.DAOOrden;
import Presentacion.VentanaPrincipal;
import negocio.ControlLevantarOrden;


public class Aplicacion {
	static DAOOrden daoOrden;
	static ControlLevantarOrden controlLO;
	
 
 
 //Constructor
  	public Aplicacion(){
  		
  	}
  //metodo que manda el control del levantamiento de orden
 public static void LOrden(){
	 controlLO = new ControlLevantarOrden(daoOrden);
	 controlLO.inicia();
	}
 
 
 public void inicia() {//Metodo da inicio a la aplicacion
		
		daoOrden = new DAOOrden();
		VentanaPrincipal ventana = new VentanaPrincipal(this);//Crea un objeto de la clase VentanaP 
		ventana.setVisible(true); // En este momento aparece la ventana principal

	}

 public static void main(String[] args) {

		Aplicacion app = new Aplicacion();
		app.inicia();
}
}
