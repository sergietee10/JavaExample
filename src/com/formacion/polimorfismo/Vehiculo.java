package com.formacion.polimorfismo;

public class Vehiculo {

	// Contructor
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	// Atributos
	String matricula, marca, modelo;

	// Metodos
	public String mostrarDatos() {
		return "Vehiculo\n------------\n Marca: " + marca + "\nModelo: " + modelo + "\nMatricula: " + matricula + "\n-----------------";
	}
}
