package com.formacion.interfaz;

public class Perro extends Canino implements Animal,Mascota{

	public Perro(String raza, String tipo, String tamaño) {
		super(raza, tipo, tamaño);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String comunicacion() {
		// TODO Auto-generated method stub
		return "Ladrar";
	}

	@Override
	public String alimentacion() {
		// TODO Auto-generated method stub
		return "Pienso";
	}

	@Override
	public String transporta() {
		// TODO Auto-generated method stub
		return "Caminar";
	}

	@Override
	public String nombre() {
		// TODO Auto-generated method stub
		return "Pupi";
	}

	@Override
	public String dueño() {
		// TODO Auto-generated method stub
		return "Carlos";
	}

}
