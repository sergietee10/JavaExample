package com.formacion.ejercicio3;

import java.util.Random;

public class Persona {

	private String nombre, dni;
	private char sexo = 'H';
	private int edad;
	private double peso, altura;
	public double imc;

	//CONSTRUCTOR POR DEFECTO 
		public Persona () {
			nombre = "";
			edad =0;
			this.dni =generaDNI();
			sexo = 'H';
			peso =0;
			altura =0;		
			comprobarSexo(this.sexo);
		}
		
		//CONSTRUCTOR CON SOLO UNOS PARAMETROS
		public Persona (String nombre, int edad, char sexo) {
			this.nombre = nombre;
			this.edad = edad;
			this.dni =generaDNI();
			this.sexo='H';
			peso =0;
			altura =0;
			comprobarSexo(this.sexo);
		}

		//CONSTRUCTOR CON LOS ATRIBUTOS POR PARAMETRO
		public Persona(String nombre, int edad,  char sexo, double peso, double altura) {
			this.nombre = nombre;
			this.edad = edad;
			this.dni =generaDNI();
			this.sexo = sexo;
			this.peso = peso;
			this.altura = altura;
			comprobarSexo(this.sexo);
		}

	// Metodos
	public void calcularIMC() {

		double imc = peso / (altura * altura);

		if (imc < 20) {
			System.out.println(-1 + "--> Bajo peso");
		} else if (imc >= 20 && imc <= 25) {
			System.out.println(0 + "--> Saludable");

		} else if (imc > 25) {
			System.out.println(1 + "--> Sobrepeso");
		}
	}

	public boolean esMayorDeEdad(int edad) {
		if (edad >= 18) {
			return true;
		} else {
			return false;
		}
	}

	public void comprobarSexo(char sexo) {
		if(sexo!='H' && sexo!='M') {
			System.out.println("Genero erroeno. Se pondra por defecto 'H'.");
			this.sexo='H';
		}
	}

	public String generaDNI() {
		int numero =0;
		String dni ="";
		
		for (int i =0; i<8; i++) {
		 numero = (int)(Math.random() * 10);
		 dni+=numero;
		 
		}
		Random random = new Random();
		char letra = (char) (random.nextInt(26) + 'A');

		return dni+letra;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", sexo=" + sexo + ", edad=" + edad + esMayorDeEdad(edad)
				+ ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

}
