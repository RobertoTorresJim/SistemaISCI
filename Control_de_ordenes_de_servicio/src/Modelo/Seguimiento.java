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
	/**
	 * Constructor de la clase que recibe un String para asignar
	 * una observacion en el seguimiento que será asignado en la bitacora
	 * @param observacion
	 */
	public Seguimiento(String observacion){
		this.observacion = observacion;
		fechaSeguimiento = new Date();
	}
	/**
	 * Metodo set que asigna una nueva observacion
	 * NOTA: NO SE UTILIZA SE ACCEDE A OBSERVACION POR MEDIO DEL
	 * CONSTRUCTOR DE LA CLASE
	 * Recibe como parametro una cadena de caracteres
	 * @param observacion
	 */
	public void setObservacion(String observacion){
		this.observacion = observacion;
	}
	/*
	 * Metodo set que asigna una nueva fecha de seguimiento
	 * Recibe como parametro una fecha nueva
	 */
	public void setDate(Date fechaSeguimiento){
		this.fechaSeguimiento = fechaSeguimiento;
	}
	/**
	 * Función get de la observacion que regresa la cadena de la
	 * descripcion de la observacion
	 * @return observacion
	 */
	public String getObservacion(){
		return observacion;
	}
	/**
	 * Función get que regresa la fecha de creación de la observacion
	 * de la bitacora
	 * @return fechaSeguimeinto
	 */
	public Date getFechaSeguimiento(){
		return fechaSeguimiento;
	}
}
