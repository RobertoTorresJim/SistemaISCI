
public class ControlBitacora {
	
	public static Bitacora bitacora;
    public static DAOBitacora bit;
	public ControlBitacora (DAOBitacora bit) {
	this.bit = bit;
	}
	public void inicia (){
		PanelBitacora ventana = new PanelBitacora(this);
		ventana.setVisible(true); // Hace visible la ventana de agregar autor
		}

}
