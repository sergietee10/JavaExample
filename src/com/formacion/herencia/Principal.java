package com.formacion.herencia;

public class Principal {

	public static void main(String[] args) {

		Alumno alumno = new Alumno("Carlos", "Martines", 23541323, "España", "Segundo", "Tardes", "Informatica");
		Persona persona = new Persona("Maria", "Garcia", 35225232, "España");
		Maestro maestro = new Maestro("Marcos", "Gonzalez", 2325215, "España", "Matematicas", "Garaje");
//	System.out.println(alumno.toString());
//	System.out.println(persona.toString());
		persona.infoPersona();
		alumno.infoPersona();
		maestro.infoPersona();

	}
}
