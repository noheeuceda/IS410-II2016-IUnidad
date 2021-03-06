package clases;

public class Arreglos {
	//Variables globales para la clase
	private int[] enteros;
	private Producto[] productos;
	public Arreglos(){
		//Logica del programa
		enteros = new int[5];
		enteros[0]= 10;
		enteros[1]= 20;
		enteros[2]= 30;
		enteros[3]= 40;
		enteros[4]= 50;
		/*for (int i = 0; i<enteros.length;i++){
			System.out.println("Valor: " + enteros[i]);
		}*/
		//Ejemplo For each
		for (int valor: enteros){
			System.out.println("Valor: "+ valor);
		}

		productos = new Producto[5]; //No se esta instanciando
		//Unicamente se reserva espacio en memoria para almacenar
		//5 elementos del tipo Producto
		productos[0] = new Producto("Calcetines");
		productos[1] = new Producto("Cerveza");
		productos[2] = new Producto("Licuado");
		productos[3] = new Producto("Desodorante");
		productos[4] = new Producto("Licuadora");

		for (Producto p: productos)
			System.out.println(p.getNombreProducto());
	}

	public static void main(String[] args) {
		new Arreglos(); //Instancia anonima
	}
}
