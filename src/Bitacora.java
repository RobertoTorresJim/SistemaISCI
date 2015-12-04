import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Bitacora {
	//ArrayList de observaciones, cada seguimiento realizado por el usuario debe ser registrado en este arreglo
	public ArrayList<Seguimiento> seguimientos = new ArrayList<>();
	//Fecha con hora del seguimiento
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date UltimaFechaSeguimiento;
	//orden asignada a la que se le da seguimiento
	//LIGAR CLASE ORDEN 
	Orden orden;
	/**
	 * Constructor vacio de la clase --nada que inicializar--
	 */
	public Bitacora() {
		// TODO Auto-generated constructor stub
		System.out.println(dateFormat.format(UltimaFechaSeguimiento)); //IMPRESION DE LA FORMA: 2014/08/06 15:59:48
	}
	/**
	 * Constructor de la clase que recibe una Orden como atributo
	 * @param orden
	 */
	public Bitacora(Orden orden){
		this.orden = orden;
		//se añade la primer observacion a la lista
		Seguimiento primerSeguimiento = new Seguimiento("Se levanto la orden");
		UltimaFechaSeguimiento = primerSeguimiento.fechaSeguimiento;
		seguimientos.add(primerSeguimiento);
	}
	/**
	 * Función de tipo boolean que agrega un nuevo seguimiento a la bitacora de la orden 
	 * recibe como parametros la observacion a agregar 
	 * @param nuevoSeguimiento
	 * @return TRUE si el seguimiento fue agregado exitosamente FALSE en otro caso
	 */
		public boolean addSeguimiento(String nuevoSeguimiento){
			//Se crea un nuevo seguimiento
			Seguimiento seguimiento = new Seguimiento(nuevoSeguimiento);
			//Se actualiza la nueva fecha de seguimiento
			UltimaFechaSeguimiento = seguimiento.fechaSeguimiento;
			//Se añade una nueva observacion a la lista
			return seguimientos.add(seguimiento);
	}
		
}
