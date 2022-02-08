package com.formacion.polimorfismo;

public class Main {

	public static void main(String[] args) {


		//Creamos el objeto
		Vehiculo vehiculo = new Vehiculo("Yamaha", "R6", "DGF 5325");
		Vehiculo turismo = new VehiculoTurismo("Ford", "Focus", "RKD 6253", 5);
		Vehiculo furgoneta = new VehiculoFurgoneta("Renault", "Kangoo", "HFR 4833", 2000);
		Vehiculo deportivo = new VehiculoDeportivo("Ferrari", "F40", "YTJ 7274", 640);
		
		//Muestra por pantalla del objeto
		System.out.println(vehiculo.mostrarDatos());
		System.out.println(turismo.mostrarDatos());
		System.out.println(furgoneta.mostrarDatos());
		System.out.println(deportivo.mostrarDatos());

	}

}
