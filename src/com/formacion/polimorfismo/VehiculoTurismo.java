package com.formacion.polimorfismo;

public class VehiculoTurismo extends Vehiculo {

	// Contructor
	public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
		super(matricula, marca, modelo);
		this.numeroPuertas = numeroPuertas;
	}

	// Atributos
	public int numeroPuertas;

	// Metodos
	@Override
	public String mostrarDatos() {
		return "Turismo\n------------\n Marca: " + marca + "\nModelo: " + modelo + "\nMatricula: " + matricula + "\nNumero de Puertas: "
				+ numeroPuertas + "\n-----------------";
	}

}
