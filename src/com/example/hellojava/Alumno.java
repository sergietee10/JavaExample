package com.example.hellojava;

public class Alumno extends Persona {

		public Alumno(String nombre, String apellido, int edad, String genero, String intereses, String clase, int grupo) {
		super(nombre, apellido, edad, genero, intereses);
		this.clase=clase;
		this.grupo=grupo;
	}
		String clase;
		int grupo;
		
		@Override
		public String toString() {
			return "Alumno [clase=" + clase + ", grupo=" + grupo + ", getNombre()=" + getNombre() + ", getApellido()="
					+ getApellido() + ", getDireccion()=" + getDireccion() + ", getGenero()=" + getGenero()
					+ ", getIntereses()=" + getIntereses() + "]";
		}
		
		
		
}
