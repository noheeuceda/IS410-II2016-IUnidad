package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Producto;

public class Principal {
	private int opcion;
	private ArrayList<Producto> productos;

	public Principal(){
		productos = new ArrayList<Producto>();
		menu();
	}

	public void menu(){

		do{
			opcion = Integer.valueOf(JOptionPane.showInputDialog(null,
					"0 Salir\n"
					+ "1 Agregar producto\n"
					+ "2 Modificar producto\n"
					+ "3 Eliminar producto\n"
					+ "4 Mostrar informacion"));
			switch(opcion){
				case 0:
					JOptionPane.showMessageDialog(null, "Adios");
					break;
				case 1:
					agregarRegistro();
					break;
				case 2:
					actualizarRegistro();
					break;
				case 3:
					eliminarRegistro();
					break;
				case 4:
					mostrarInformacion();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion Invalida");
			}
		}while(opcion!=0);
	}

	public void agregarRegistro(){
		//Crear una instancia de producto
		Producto p = new Producto();
		//Solicitar la informacion al usuario
		p.solicitarInformacion();
		//Agregar la instancia al ArrayList
		productos.add(p);
		//Mostrar la informacion agregada
		mostrarInformacion();
	}

	public void actualizarRegistro(){
		//Solicitar registro que desea actualizar
		int indice = Integer.valueOf(JOptionPane.showInputDialog("Que indice desea actualizar (0 al "+(productos.size()-1)+ ")"));
		//Obtener el objeto a modificar
		Producto p = productos.get(indice);
		//Solicitar nuevamente la informacion
		p.solicitarInformacion();
		//Actualizar o sustituir el objeto en el ArrayList
		productos.set(indice, p);
		//Mostrar informacion
		mostrarInformacion();
	}

	public void eliminarRegistro(){
		//Solicitar el indice que desea eliminar
		int indice = Integer.valueOf(JOptionPane.showInputDialog("Que indice desea eliminar (0 al "+(productos.size()-1)+ ")"));
		//Consultar si desea eliminar el registro
		int resultado = JOptionPane.showConfirmDialog(null, "�Desea eliminar el producto " + productos.get(indice).getNombreProducto() + "?");
		System.out.println(resultado);
		//Opcion Si: 0
		//Opcion No: 1
		//Opcion Cancelar: 2
		//Eliminar el objeto del arrayList
		if (resultado == 0)
			productos.remove(indice);
		//Mostrar informacion
		mostrarInformacion();
	}

	public void mostrarInformacion(){
		String resultado="";
		for(Producto p: productos)
			resultado += p.toString()+"\n";

		JOptionPane.showMessageDialog(null, resultado);
	}

	public static void main(String[] args) {
		new Principal();
	}
}
