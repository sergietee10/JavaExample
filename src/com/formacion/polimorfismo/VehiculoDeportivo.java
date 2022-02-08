package com.formacion.polimorfismo;

public class VehiculoDeportivo extends Vehiculo {

	// Contructor
	public VehiculoDeportivo(String marca, String modelo, String matricula, int cilindrada) {
		super(marca, modelo, matricula);
		this.cilindrada = cilindrada;
	}

	// Atributos
	public int cilindrada;

	// Metodos
	@Override
	public String mostrarDatos() {
		return "Deportivo\n------------\n Marca: " + marca + "\nModelo: " + modelo + "\nMatricula: " + matricula + "\nCilindrada: " + cilindrada
				+ "\n-----------------";
	}

}
