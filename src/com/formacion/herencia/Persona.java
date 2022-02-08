package com.formacion.herencia;

public class Persona {

	// Atributos clase persona
	public String nombre, apellido, nacionalidad;
	public int dni;

	// Constructor
	public Persona(String nombre, String apellido, int dni, String nacionalidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nacionalidad = nacionalidad;

	}

	// ToString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", dni="
				+ dni + "]";
	}

	// Metodos de la clase persona
	public void infoPersona() {
		System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nDni: " + dni + "\nNacionalidad: "
				+ nacionalidad + "\n-----------------");
	}

	public void caminar() {

	}

	public void comer() {

	}

	public void trabajar() {

	}

	public void conducir() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

}
