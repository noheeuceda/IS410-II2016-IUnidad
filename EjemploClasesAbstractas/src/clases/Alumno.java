package clases;

public class Alumno extends Persona{
	private String cuenta;

	public Alumno(
			String nombre,
			String apellido,
			String genero,
			int edad,
			Carrera carrera,
			String horario,
			String cuenta){
		super(nombre, apellido, genero, edad, carrera, horario);
		this.cuenta = cuenta;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}



	@Override
	public String toString() {
		return "Alumno [cuenta=" + cuenta + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero
				+ ", edad=" + edad + ", carrera=" + carrera + ", horario=" + horario + "]";
	}

	public void mostrarNombreCompleto(){
		System.out.println(nombre + " " + apellido);
	}

	@Override
	public void aprobar(){
		System.out.println("Aprobando");
	}

	public void metodoDeLaClaseAlumno(){
		System.out.println("Este metodo solo es de la clase alumno, ok");
	}


}
