package com.formacion.herencia;

public class Alumno extends Persona {

	// Atributos clase Alumno
	String curso, turno, carrera;

	// Constructor
	public Alumno(String nombre, String apellido, int dni, String nacionalidad, String curso, String turno,
			String carrera) {
		super(nombre, apellido, dni, nacionalidad);
		this.curso = curso;
		this.turno = turno;
		this.carrera = carrera;
	}

	// Metodos de la clase Alumno
	@Override
	public void infoPersona() {
		System.out.println(
				"Nombre: " + nombre + "\nApellido: " + apellido + "\nDni: " + dni + "\nNacionalidad: " + nacionalidad
						+ "\nCurso: " + curso + "\nTurno: " + turno + "\nCarrera: " + carrera + "\n-----------------");
	}

	// toString para mostrar
	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", turno=" + turno + ", carrera=" + carrera + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", dni=" + dni + "]";
	}

}
