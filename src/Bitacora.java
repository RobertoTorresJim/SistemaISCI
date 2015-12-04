import java.util.ArrayList;


public class Bitacora {
	public ArrayList<String> seguimientos = new ArrayList<String>();
	
	
	public Bitacora() {
		// TODO Auto-generated constructor stub
	}
		
		
		public boolean setSeguimiento(String nuevoSeguimiento){
			return seguimientos.add(nuevoSeguimiento);
	}

}
