package com.example.hellojava;

public class Maestro extends Persona{

	public Maestro(String nombre, String apellido, int edad, String genero, String intereses, String clases, String estacionamiento) {
		super(nombre, apellido, edad, genero, intereses);
		this.clases = clases;
		this.estacionamiento = estacionamiento;
	}

	String clases, estacionamiento;

	@Override
	public String toString() {
		return "Maestro [clases=" + clases + ", estacionamiento=" + estacionamiento + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getDireccion()=" + getDireccion() + ", getGenero()="
				+ getGenero() + ", getIntereses()=" + getIntereses() + "]";
	}
	
	
}
