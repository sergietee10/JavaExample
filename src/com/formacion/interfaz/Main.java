package com.formacion.interfaz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro = new Perro("CHOUCHOU", "Algo", "Despues");
		System.out.println(perro.comunicacion());
		System.out.println(perro.toString());
		
		Gato gato = new Gato();
		System.out.println(gato.comunicacion());
	}

}
