 package com.formacion.interfaz;

public class Gato implements Animal{
	@Override
	public String comunicacion() {
		// TODO Auto-generated method stub
		return "Maullar";
	}

	@Override
	public String alimentacion() {
		// TODO Auto-generated method stub
		return "Pescado";
	}

	@Override
	public String transporta() {
		// TODO Auto-generated method stub
		return "Caminar";
	}
	
}
