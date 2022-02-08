package com.formacion.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un nombre");
		String nombre = teclado.next();
		System.out.println("Introduce la edad");
		int edad = teclado.nextInt();
		System.out.println("Introduce un sexo H/M");
		String sx = teclado.next();
		char sexo = sx.charAt(0);
		System.out.println("Introduce un peso");
		double peso = teclado.nextDouble();
		System.out.println("Introduce un altura");
		double altura = teclado.nextDouble();
		
		
		Persona pers = new Persona(nombre, edad ,sexo, peso, altura);
		System.out.println(pers.toString());
		
		Persona pers2 = new Persona(nombre, edad ,sexo);
	    pers2.setAltura(2.20);
	    pers2.setPeso(78.2);
	    System.out.println(pers2.toString());
		
	    
	    Persona pers3 = new Persona();
	    pers3.setAltura(1.76);
	    pers3.setEdad(25);
	    pers3.setNombre("Sergio");
	    pers3.setPeso(56.2);
	    pers3.setSexo('H');
	    System.out.println(pers3.toString());
		
		
//		System.out.println("-------------");
//		Persona pers2 = new Persona(nombre, edad, sexo);
//		
//		System.out.println(pers2.toString());
//		System.out.println("-------------");
//		Persona pers3= new Persona();
//		pers3.setNombre("Pepe");
//		pers3.setEdad(17);
//		pers3.setSexo('H');
//		pers3.setPeso(65.00);
//		pers3.setAltura(1.90);
//		System.out.println(pers3.toString());
//		System.out.println("-------------");
	}

}
