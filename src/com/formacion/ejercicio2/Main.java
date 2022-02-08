package com.formacion.ejercicio2;

public class Main {

	public static void main(String[] args) {
		Cuenta c = new Cuenta("Sergio", 500);
		c.ingresar(200);
		System.out.println(c.toString());
		c.retirar(300);
		System.out.println(c.toString());
		c.retirar(400);
		System.out.println(c.toString());
		c.ingresar(800);
		System.out.println(c.toString());
		c.retirar(400);
		System.out.println(c.toString());

	}
}
