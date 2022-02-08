package com.example.hellojava;

public class Perro extends Animal{
	
	public Perro(String tipo, int numeroDePatas, String alimentacion, String raza, String tamaño) {
		super(tipo, numeroDePatas, alimentacion);
		this.raza=raza;
		this.tamaño=tamaño;
	}

	String raza, tamaño;
	
	
	
	void ladrar() {
		System.out.println("Guau!");
	}



	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", tamaño=" + tamaño + ", tipo=" + tipo + ", numeroDePatas=" + numeroDePatas
				+ ", alimentacion=" + alimentacion + "]";
	}



	@Override
	void andar() {
		System.out.println("Correr!");
	}
	
	
}
