package com.formacion.ejercicio2;

public class Cuenta {

	// Atributos
	String titular;
	double cantidad;

	// Constructores
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public Cuenta(String titular) {
		this.titular = titular;
	}

	// METODOS
	public void ingresar(double cantidad) {

		if (cantidad >= 0) {
			this.cantidad += cantidad;
			System.out.println(" Ingresado correctamente\n");
		}
		

	}

	public void retirar(double cantidad) {
		if (cantidad >= this.cantidad) {
			this.cantidad = 0;
			System.out.println(" Se ha quedado sin saldo\n");

		} else if (cantidad < this.cantidad && cantidad >=0){
			this.cantidad -= cantidad;
			System.out.println(" Retirado correctamente\n");

		}
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta\n-----------\n Titular: " + titular + "\n Cantidad: " + cantidad;
	}

	// ToString

}
