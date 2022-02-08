package com.example.hellojava;

public class Animal {

	String tipo;
	int numeroDePatas;
	String alimentacion;

	
	public Animal(String tipo, int numeroDePatas, String alimentacion) {
		this.tipo = tipo;
		this.numeroDePatas = numeroDePatas;
		this.alimentacion = alimentacion;
	}


	void andar() {
		System.out.println("andando");
	}

	void alimentarse() {
		System.out.println("comiendo");
	}

}
