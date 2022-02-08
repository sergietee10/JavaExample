package com.formacion.herencia;

public class Maestro extends Persona {

	// Constructor
	public Maestro(String nombre, String apellido, int dni, String nacionalidad, String clases,
			String estacionamiento) {
		super(nombre, apellido, dni, nacionalidad);
		this.clases = clases;
		this.estacionamiento = estacionamiento;
	}
	// Atributos

	String clases, estacionamiento;

	// ToString para mostrar
	@Override
	public String toString() {
		return "Maestro [clases=" + clases + ", estacionamiento=" + estacionamiento + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", dni=" + dni + "]";
	}

	// Metodos de la clase Alumno
	@Override
	public void infoPersona() {
		System.out.println(
				"Nombre: " + nombre + "\nApellido: " + apellido + "\nDni: " + dni + "\nNacionalidad: " + nacionalidad
						+ "\nClases: " + clases + "\nEstacionamiento: " + estacionamiento + "\n-----------------");
	}

}