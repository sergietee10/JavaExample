package com.example.hellojava;

public class Coche {

	

	int ruedas;
	int velocidad;
	int cilindrada;
	String color;
	

	
	void infoCoche() {
		System.out.println(color);
		System.out.println(ruedas);
		System.out.println(velocidad);
		System.out.println(cilindrada);
	}
	
	public void setMotor(int valor) {
		if(valor>=300) {
			System.out.println("limite de valor 299");
		} else {
			cilindrada=valor;
		}
	}
	
	public int getMotor() {
		
		return cilindrada;
	}
	
	String arranca() {
		return "Arrancado";		
	}
	
	String frenar() {
		return "Frenando";
	}
	
	String girar() {
		return "Girando";
	}
	
	
	
	
}
