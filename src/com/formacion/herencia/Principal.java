package com.formacion.herencia;

public class Principal {

	public static void main(String[] args) {

		Alumno alumno = new Alumno("Carlos", "Martines", 23541323, "Espa�a", "Segundo", "Tardes", "Informatica");
		Persona persona = new Persona("Maria", "Garcia", 35225232, "Espa�a");
		Maestro maestro = new Maestro("Marcos", "Gonzalez", 2325215, "Espa�a", "Matematicas", "Garaje");
//	System.out.println(alumno.toString());
//	System.out.println(persona.toString());
		persona.infoPersona();
		alumno.infoPersona();
		maestro.infoPersona();

	}
}
