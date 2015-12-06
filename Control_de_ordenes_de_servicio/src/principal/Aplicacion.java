package principal;

import java.sql.SQLException;
import Control.ControlGerente;
import presentacion.VentanaMenu;
public class Aplicacion {

	
	public static void main(String[] args) throws SQLException { //metodo principal de la clase
		Aplicacion app = new Aplicacion();// Crea la instancia de la aplicacion
		app.inicia();// La inicia
		
	}
	public Aplicacion() {//constructor de la clase
		// No hay nada que inicializar
		}
		
	/**
	* Este metodo inicia la aplicacion
	*/
		public void inicia() {
		// Aqui ya se pueden crear y llamar a los objetos que realmente corresponden a la aplicacion
		System.out.println("La aplicacion ha iniciado...");
		VentanaMenu ventana = new VentanaMenu(this);
		ventana.setVisible(true); // En este momento aparece la ventana principal
		}
	/**
	* Este metodo inicia la aplicacion
	*/	
		public void iniciaMODGerente (){
			ControlGerente control = new ControlGerente ();
			control.iniciaMODAdminUser(); // En este momento aparece la ventana principal
		}
	/**
	* Este metodo agrega libro
	*/	
		
	/**
	* Este metodo agrega revista
	*/	
		
	/**
	* Este metodo busca material
	*/	
		
	/**
	* Este metodo elimina material
	*/	
		
	/**
	* Este metodo regresa todos los materiales
	*/	
		
		
		
		
}
