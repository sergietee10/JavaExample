package com.formacion.encapsulamiento;

public class Persona {

	private int edad;
	
	//Setters
	public void setEdad(int edad) {
		if (edad<=140 && edad>=0) {
			this.edad=edad;
		} else {
			System.out.println("Esta fuera del rango");
		}
	}
	
	//Getters
	public int getEdad() {
		return edad;
	}
}
