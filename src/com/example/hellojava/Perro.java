package com.example.hellojava;

public class Perro extends Animal{
	
	public Perro(String tipo, int numeroDePatas, String alimentacion, String raza, String tama�o) {
		super(tipo, numeroDePatas, alimentacion);
		this.raza=raza;
		this.tama�o=tama�o;
	}

	String raza, tama�o;
	
	
	
	void ladrar() {
		System.out.println("Guau!");
	}



	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", tama�o=" + tama�o + ", tipo=" + tipo + ", numeroDePatas=" + numeroDePatas
				+ ", alimentacion=" + alimentacion + "]";
	}



	@Override
	void andar() {
		System.out.println("Correr!");
	}
	
	
}
