
public class ControlBitacora {
	DAOBitacora bitacora;
	VentanaBitacora ventanaB;
	public ControlBitacora(DAOBitacora bitacora) {
		// TODO Auto-generated constructor stub
		this.bitacora = bitacora;
	}
	public void inicia(){
		ventanaB = new VentanaBitacora(this);
		ventanaB.setVisible(true);
	}
	public boolean agregarSeguimiento(){
		
	}
}
