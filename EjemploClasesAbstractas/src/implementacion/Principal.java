package implementacion;

import java.util.ArrayList;

import clases.Alumno;
import clases.Carrera;
import clases.Maestro;
import clases.Persona;

public class Principal {
	private ArrayList<Persona> personas;

	public Principal(){
		personas = new ArrayList<Persona>();
		/*Persona p = new Persona("Maria", "Gimenez","F",50,
				new Carrera("IS", "Ingenieria en Sistemas",54), "Matutino");
		Persona p1 = new Persona("Pedro", "Gimenez","F",50,
				new Carrera("IS", "Ingenieria en Sistemas",54), "Matutino");
		Persona p2 = new Persona("Rodrigo", "Gimenez","F",50,
				new Carrera("IS", "Ingenieria en Sistemas",54), "Matutino");
		 */
		Persona a = new Alumno(
				"Juan","Perez",
				"M",55,
				new Carrera("IS", "Ingenieria en Sistemas",54),
				"Matutino","200610011111"
		);

		Persona a1 = new Alumno(
				"Mario","Perez",
				"M",55,
				new Carrera("IS", "Ingenieria en Sistemas",54),
				"Matutino","200610011111"
		);
		Persona a2 = new Alumno(
				"Matusalen","Perez",
				"M",55,
				new Carrera("IS", "Ingenieria en Sistemas",54),
				"Matutino","200610011111"
		);

		Persona m = new Maestro("Maria", "Gimenez","F",50,
				new Carrera("IS", "Ingenieria en Sistemas",54), "Matutino", "2134234",2132.12);
		Persona m1 = new Maestro("ElBrayan", "Gimenez","F",50,
				new Carrera("IS", "Ingenieria en Sistemas",54), "Matutino", "2134234",2132.12);
		Persona m2 = new Maestro("LaBritany", "Gimenez","F",50,
				new Carrera("IS", "Ingenieria en Sistemas",54), "Matutino", "2134234",2132.12);

		personas.add(a);
		personas.add(m);
		personas.add(m1);
		personas.add(a1);
		personas.add(m2);
		personas.add(a2);


		metodoX(a1);




		//Apuestas:
		//En caso de el llamado a toString, cual ejecutara:
		// El de la clase padre (Persona): 6
		// El de cada clase correspondiente: 16


		mostrarMaestros();
		mostrarAlumnos();
		mostrarPersonas();
		System.out.println("Fin del programa");
	}


	public void metodoX(Persona p){
		System.out.println("Nombre Persona: "+ p.getNombre());
	}


	public void mostrarMaestros(){
		System.out.println("-----Listado de maestros------");
		for (int i = 0; i< personas.size(); i++){
			if (personas.get(i) instanceof Maestro)
				System.out.println(personas.get(i).toString());
		}
	}

	public void mostrarAlumnos(){
		System.out.println("-----Listado de alumnos------");
		for (int i = 0; i< personas.size(); i++){
			if (personas.get(i) instanceof Alumno){
				((Alumno)personas.get(i)).metodoDeLaClaseAlumno(); //cast
				System.out.println(personas.get(i).toString());
			}
		}
	}

	public void mostrarPersonas(){
		System.out.println("-----Listado de personas------");
		for (int i = 0; i< personas.size(); i++){
			if (!(personas.get(i) instanceof Alumno) && !(personas.get(i) instanceof Maestro))
				System.out.println(personas.get(i).toString());
		}
	}



	public static void main(String[] args) {
		new Principal();
	}

}
