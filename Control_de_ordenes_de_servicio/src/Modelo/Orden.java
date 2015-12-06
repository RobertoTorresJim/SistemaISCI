package Modelo;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Orden {
 private String claveO;
 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 private Date date ;
 private String tOrden;
 private Usuario usu;
 private boolean statusOrden;
 private String des;

	public Orden (Date date, String claveO, Usuario usu,String tOrden, String des, boolean statusOrden){
		this.date=date;
		this.claveO=claveO;
		this.usu=usu;
		this.tOrden=tOrden;
		this.des=des;
		this.statusOrden=statusOrden;
	}

	public boolean getStatusOren() {
		return statusOrden;
	}

	public void setStatusOren(boolean statusOren) {
		this.statusOrden = statusOren;
	}

	public Usuario getUsu() {
		return usu;
	}

	public void setUsu(Usuario usu) {
		this.usu = usu;
	}

	public String gettOrden() {
		return tOrden;
	}

	public void settOrden(String tOrden) {
		this.tOrden = tOrden;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getClaveO() {
		return claveO;
	}

	public void setClaveO(String claveO) {
		this.claveO = claveO;
	}

	
	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
	public static void main(String[] args) {

		
		
		
}

	

}
