package com.example.hellojava;

public class Vehiculo {
	private String matricula, modelo;
	private int potenciaCV;
	
	
	
	public Vehiculo(String matricula, String modelo, int potenciaCV) {
		this.matricula = matricula;
		this.potenciaCV = potenciaCV;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
		
	}
	
	public int getPotenciaCV() {
		return potenciaCV;
	}
	
	public String getModelo() {
		return modelo;
	}
}
