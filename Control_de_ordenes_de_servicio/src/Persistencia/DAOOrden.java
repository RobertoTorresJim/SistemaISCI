package Persistencia;import java.util.ArrayList;

import Modelo.Orden;


	public class DAOOrden {
			private ArrayList <Orden> Ordenes;//crea la instancia a un arreglo dinamico
				private boolean respuesta=false;

	public DAOOrden() {
			Ordenes = new ArrayList <Orden> ();//crea el objeto del arreglo dinamico
	}

	public boolean  agregaOrden(Orden or) {
	
		int x=Ordenes.size();//asigna el tamaño del arreglo a una variable
		Ordenes.add(or);//agrega elementos al arreglo
		if(Ordenes.size()==(x+1)){//verifica si se agrego el material
			respuesta=true;
			System.out.println("Material agregado exitasamente : "+respuesta+"\n");
		}else {
			System.out.println("Material agregado exitasamente : "+respuesta+"\n");
		}
		return respuesta;
	}
/**
* Permite quitar un libro a la librerÃ­a
* @return true si el libro se quito exitosamente, false sino
*/
	public boolean EliminaOrden(String clave) {
	
			int x=Ordenes.size();//asigna el tamaño del arreglo a una variable
			for (int i =0; i<x;i++){
				if (clave.equals(Ordenes.get(i).getClaveO())){//compara el material buscando con los del arreglo
					Ordenes.remove(i);//quita el material del arreglo
				}	
			}

			if(Ordenes.size()==(x-1)){//verifica si fue quitado el material
				respuesta=true;
				System.out.println("Orden eliminada exitosamete : "+respuesta+"\n");
}else {
System.out.println("Orden eliminada exitosamente : "+respuesta);
System.out.println("Orden  no encontrado"+"\n");
}
return respuesta;
}

 //Regresa los libros de la libreria como un arreglo de libros
 //return el arreglo de libros

public Orden [] dameOrdenes() {
// Creamos un arreglo de las Ordenes del tamaño del arrayList
if (Ordenes.size()==0){
	System.out.println("No hay elementos ");
}
Orden ordTem[]=new Orden[Ordenes.size()];
// Se llena el arreglo a partir del arrayList
Ordenes.toArray(ordTem);
return ordTem;
}
/**
* Regresa los libros de la libreria del autor pasado como parÃ¡metro
* como un arreglo de libros
* @param Un autor
* @return un arreglo con libros de ese autor
*/
	public Orden []buscaOrdenxCve (String clave) {
		Orden ordTempo [] = new Orden [Ordenes.size()];//crea un arreglo
		ordTempo=dameOrdenes();//asigna los materiales del arreglo dinamico al arreglo normal
		ArrayList <Orden> ordAR = new ArrayList <Orden> ();//crea un arreglo dinamico
		int numOrd=0;
		for (int i =0; i<Ordenes.size();i++){	
			if(ordTempo [i].getClaveO().contains(clave)) {//compara el elemento buscando con los existentes
				ordAR.add(ordTempo[i]);//si lo encuentra lo agrega al arreglo
				numOrd++;//cuanta el numero de elementos encontrados
			}
		}
			ordTempo = new Orden [numOrd];//redefine tamaño del el arreglo
			ordAR.toArray(ordTempo);//asigna los elementos al arreglo
				return ordTempo;
	}
/**
* Regresa numero de materiales en la libreria
* @return un entero con el numero de libros
*/
public int cuantosMateriales() {
return Ordenes.size();//asigna el tamaño del arreglo a una variable
}
}