package com.example.hellojava;

public class Gato extends Animal{
	
	public Gato(String tipo, int numeroDePatas, String alimentacion, String raza, String tamaño) {
		super(tipo, numeroDePatas, alimentacion);
		this.raza=raza;
		this.tamaño=tamaño;
	}


	String raza, tamaño;
	
	
	void maullar() {
		System.out.println("Miau!");
	}
	
	
}


