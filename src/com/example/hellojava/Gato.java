package com.example.hellojava;

public class Gato extends Animal{
	
	public Gato(String tipo, int numeroDePatas, String alimentacion, String raza, String tama�o) {
		super(tipo, numeroDePatas, alimentacion);
		this.raza=raza;
		this.tama�o=tama�o;
	}


	String raza, tama�o;
	
	
	void maullar() {
		System.out.println("Miau!");
	}
	
	
}


