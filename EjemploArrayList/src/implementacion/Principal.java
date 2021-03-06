package implementacion;
//Shift+Ctrl+O
import java.util.ArrayList;

import clases.Producto;

public class Principal {
	//Definicion de atributos
	private ArrayList<Producto> productos;
	//<> RawType, en el caso de ArrayList
	//indica el tipo de dato que va a almacenar

	public Principal(){
		productos = new ArrayList<Producto>();
		productos.add(new Producto("Computadora"));//0
		productos.add(new Producto("Desodorante"));//1
		productos.add(new Producto("Jabon Extra"));//2
		productos.add(new Producto("Licuadora"));//3
		productos.add(new Producto("Gelatina moco de gorila"));//4
		System.out.println("Cantidad elementos: " + productos.size());
		//Para eliminar se utiliza el metodo remove
		//Cuando se elimina un elemento los indices se corren
		productos.remove(1);
		System.out.println("Cantidad elementos despues de remove: " + productos.size());

		//Para sustituir un elemento por otro se utiliza set
		productos.set(1, new Producto("Zapatos"));

		//System.out.println("Producto indice 2: "+productos.get(2).getNombreProducto());
		//Listar productos con un ciclo convencional
		for(int i=0; i<productos.size();i++){
			//System.out.println(productos.get(i).getNombreProducto());
			System.out.println(productos.get(i).toString());
		}

		//Listar productos con un foreach
		for(Producto p: productos){
			System.out.println(p);
		}
	}
	public static void main(String[] args) {
		new Principal();
	}
}
