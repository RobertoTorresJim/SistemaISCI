import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Seguimiento {
	//Descripcion del seguimiento
	String observacion;
	//Fecha y hora en la que se ingreso el seguimiento
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date fechaSeguimiento;
	/**
	 * Constructor de la clase nada nada que inicializar
	 */
	public Seguimiento(){
		//Nada que inicializar
	}
	public Seguimiento(String observacion){
		this.observacion = observacion;
		fechaSeguimiento = new Date();
	}
}
