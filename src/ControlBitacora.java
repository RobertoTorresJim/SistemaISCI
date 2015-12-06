
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
	//Verificar si este metodo pertenece al control o a la bitacora
	public boolean agregarSeguimiento(){
		return true;
	}
}
