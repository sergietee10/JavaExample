package com.example.hellojava;

public class Persona {

		//Atributos clase persona
		private String nombre, apellido, genero, intereses;
		private int edad;
		
		
		//Constructor
		public Persona(String nombre, String apellido, int edad, String genero, String intereses) {
			this.nombre= nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.genero = genero;
			this.intereses = intereses;
			
		}
		
		//Segundo Constructor
//		public Persona(String nombre, String apellido) {
//			this.nombre= nombre;
//			this.apellido = apellido;
//		}
		
		
		//Metodos de la clase persona
		public void infoPersona() {
			System.out.println("Nombre: "+nombre);
			System.out.println("Apellido: "+apellido);
			System.out.println("Edad: "+edad);
			System.out.println("Genero: "+genero);
			System.out.println("Intereses: "+intereses);
			System.out.println("-----------------");
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

		public int getDireccion() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getIntereses() {
			return intereses;
		}

		public void setIntereses(String intereses) {
			this.intereses = intereses;
		}
		
		
}
