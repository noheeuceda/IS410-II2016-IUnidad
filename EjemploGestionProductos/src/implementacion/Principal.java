package implementacion;

import javax.swing.JOptionPane;

public class Principal {
	private int opcion;
	public Principal(){
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
					JOptionPane.showMessageDialog(null, "Agregar");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Actualizar");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Eliminar");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Mostrar informacion");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion Invalida");
			}
		}while(opcion!=0);
	}
	public static void main(String[] args) {
		new Principal();
	}
}
