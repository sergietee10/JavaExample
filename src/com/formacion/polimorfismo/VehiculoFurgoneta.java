package com.formacion.polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {

	// Contructor
	public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}

	// Atributos
	public int carga;

	// Metodos
	@Override
	public String mostrarDatos() {
		return "Furgoneta\n------------\nMarca: " + marca + "\nModelo: " + modelo + "\nMatricula: " + matricula + "\nCarga: " + carga
				+ "\n-----------------";
	}

}
