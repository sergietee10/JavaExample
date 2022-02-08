package com.example.hellojava;

public class Autobus extends Vehiculo{

	
	public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
		super(matricula, modelo, potenciaCV);
		this.numeroPlazas=numeroPlazas;
	}

	private int numeroPlazas;

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public String toString() {
		return "Autobus [getNumeroPlazas()=" + getNumeroPlazas()
				+ ", getMatricula()=" + getMatricula() + ", getPotenciaCV()=" + getPotenciaCV() + ", getModelo()="
				+ getModelo() + "]";
	}
	
	
}
