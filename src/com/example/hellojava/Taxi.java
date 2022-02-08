package com.example.hellojava;

public class Taxi extends Vehiculo {

	public Taxi(String matricula, String modelo, int potenciaCV, int numeroLicencia) {
		super(matricula, modelo, potenciaCV);
		this.numeroLicencia = numeroLicencia;
	}

	private int numeroLicencia;

	public int getNumeroLicencia() {
		return numeroLicencia;
	}

	public void setNumeroLicencia(int numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}

	@Override
	public String toString() {
		return "Taxi [getNumeroLicencia()=" + getNumeroLicencia()
				+ ", getMatricula()=" + getMatricula() + ", getPotenciaCV()=" + getPotenciaCV() + ", getModelo()="
				+ getModelo() + "]";
	}
	
	

}
