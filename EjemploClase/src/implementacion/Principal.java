package implementacion;

import clases.Producto;

public class Principal {
	//Declaracion de variables globales en la clase
	public static void main(String[] args) {
		final int VALOR_MAXIMO = 100;
		///Producto.valor_estatico = 50;
		//Declaracion de variables locales
		Producto p = new Producto(10,"Desodorante OldSpice", "OldSpice",150,15); //Objeto o instancia p, Instanciacion
		Producto p2 = new Producto("Zapatos adidas");
		Producto p3 = new Producto();
		Producto p4 = new Producto(151,"Collares para gato", "Gatito Feliz",150,15);
		p3.setNombreProducto("Esmalte de u�as");

		//p.setNombreProducto("Desodorante OldSpice");
		System.out.println(p.getMarca());
		System.out.println(p.getNombreProducto());
		System.out.println(p.getPrecio());

		System.out.println(p2.getNombreProducto());
		System.out.println(p3.getNombreProducto());

		p4.mostrarInformacion();
		p4.mostrarInformacion("Gatito furioso");
		p4.mostrarInformacion(666);

		System.out.println(p4);


		Producto.valor_estatico = 10;

		System.out.println(p.valor_estatico); //10
		System.out.println(p2.valor_estatico); //10
	}
}
