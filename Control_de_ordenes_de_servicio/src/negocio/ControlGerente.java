package Control;

import presentacion.VentanaGerente;

public class ControlGerente {
	
	public ControlGerente() {
	
		}



public void iniciaMODAdminUser (){
	VentanaGerente ventana = new VentanaGerente (this);
	ventana.setVisible(true); // En este momento aparece la ventana principal
}


}