package com.example.hellojava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejemplos {

	Scanner teclado = new Scanner(System.in);

	public void EjemploSwitch() {
		// SWITCH
		System.out.println("¿En que numero de mes estamos?");
		int mes = teclado.nextInt();
		switch (mes) {
		case 10:
			System.out.println("Estamos en Octubre");
			break;
		case 11:
			System.out.println("Estamos en Noviembre");
			break;
		case 12:
			System.out.println("Estamos en Diciembre");
			break;
		default:
			System.out.println("Es otro mes.");
			break;
		}
	}

	public void EjemploWhile() {
		// WHILE
		int x = 1;
		while (x <= 100) {
			System.out.print(x);
			System.out.print("-");
			x = x + 1;
		}
	}

	public void EjemploFor() {
		// FOR
		for (int i = 0; i <= 100; i++) {
			System.out.print(i);
			System.out.print("-");
		}
	}

	public void EjemploArrays() {
		// ARRAYS
		String nombres[];
		nombres = new String[3];

		nombres[0] = "Jose";
		nombres[1] = "Marco";
		nombres[2] = "Maria";
		nombres[3] = "Rolando";
		System.out.print(nombres[1]);

		// cargamos array de nombres
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("infrese Nombre " + i);
			nombres[i] = teclado.nextLine();
		}

		System.out.println("Lista array de Nombres:");
		// recorro el array nombres
		for (int x = 0; x < nombres.length; x++) {
			System.out.println(nombres[x]);
		}

	}

	public void EjemploArreglosBidimensionales() {

		// ARREGLOS BIDIMENSIONALES
		String[][] nombres = new String[3][2];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 2; c++) {
				nombres[f][c] = teclado.nextLine();
			}
		}

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 2; y++) {
				System.out.println(nombres[x][y]);
			}
		}
	}

	public void EjemploMatrizDiagonal() {

		// MATRIZ DIAGONAL PRINCIPAL
		int[][] cantidades = new int[3][3];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 3; c++) {
				cantidades[f][c] = teclado.nextInt();
			}
		}

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				if (x == y) {
					System.out.print(cantidades[x][y]);
				} else {
					System.out.print("-");
				}
			}

			System.out.println(" ");
		}
	}

	public void EjemploColecciones() {

		// COLECCIONES
		Set<String> conjunto = new HashSet();
		conjunto.add("manzana");
		conjunto.add("pera");
		conjunto.add("fresa");
		conjunto.add("naranja");
		conjunto.remove("pera");

		for (String s : conjunto) {
			System.out.println(s);
		}
	}

	public void EjemploArraysList() {

		// ARRAYLIST

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("audi");
		cars.add("Ford");
		cars.set(0, "Ferrari");

		System.out.println(cars);
		System.out.println(cars.get(2));
		cars.remove(3);
		System.out.println(cars);
		cars.clear();
		System.out.println(cars);
	}

	public void EjemploHasmap() {

		//HASH MAP

		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Spain", "Madrid");
		capitalCities.put("Norway", "Oslo");

		System.out.println(capitalCities);

		HashMap<Integer, String> cities = new HashMap<Integer, String>();
		cities.put(1, "London");
		cities.put(2, "Berlin");
		cities.put(3, "Madrid");
		cities.put(4, "Oslo");
		System.out.println(cities);
	}
}
