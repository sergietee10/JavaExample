package com.example.hellojava;

import java.util.Scanner;

public class Ejercicios {

	Scanner teclado = new Scanner(System.in);

	public void Ejercicio1() {

		// Ejercicio 1
		System.out.println("Ingrese su nombre");
		String nombre = teclado.nextLine();
		System.out.println("Ingrese su edad");
		String edad = teclado.nextLine();
		System.out.println("Ingrese su ciudad");
		String ciudad = teclado.nextLine();
		System.out.println("Mi nombre es " + nombre + ", tengo " + edad + " años y soy de " + ciudad + ".");
		System.out.println(" ");
	}

	public void Ejercicio2() {
		// Ejercicio 2
		int resultadoMult = 0, resultadoDiv = 0, resultadoSuma = 0, resultadoResta = 0;
		System.out.println("Ingrese el valor de A");
		int a = teclado.nextInt();
		System.out.println("Ingrese el valor de B");
		int b = teclado.nextInt();

		resultadoSuma += a + b;
		resultadoResta += a - b;
		resultadoMult += a * b;
		resultadoDiv += a % b;
		System.out.println("la variable A es " + a + " y la B es " + b);
		System.out.println("La suma de A y B es: " + resultadoSuma);
		System.out.println("La resta de A y B es: " + resultadoResta);
		System.out.println("La multiplicación de A y B es: " + resultadoMult);
		System.out.println("La division de A y B es: " + resultadoDiv);
		System.out.println(" ");
	}

	public void Ejercicio3() {
		// Ejercicio 3
		System.out.println("¿Qué precio tiene el producto que esta comprando?");

		double precioProducto = teclado.nextDouble();

		System.out.println("¿Que cantidad de productos de este tipo va a comprar?");
		int cantidadProducto = teclado.nextInt();

		System.out.println("El precio total que tiene que abonar es: " + precioProducto * cantidadProducto);
	}

	public void Ejercicio4() {
		// Ejercicio 4

		System.out.println("Ingrese la base del triángulo:");
		double base = teclado.nextDouble();
		System.out.println("Ingrese la altura del triángulo:");
		double altura = teclado.nextDouble();
		double resultado = +base * altura;

		System.out.println("El area de este triángulo es: " + resultado / 2);
		System.out.println(" ");
	}

	public void Ejercicio5() {
		// Ejercicio 5
		double urgencias = 0.37, pedriatria = 0.42, traumatologia = 0.21, resultadoU = 0, resultadoP = 0,
				resultadoT = 0;

		System.out.println("Ingrese la cantidad de dinero del presupuesto:");
		double dinero = teclado.nextDouble();

		resultadoU = dinero * urgencias;
		resultadoP = dinero * pedriatria;
		resultadoT = dinero * traumatologia;

		System.out.println("Urgencias recibirá " + resultadoU + "€, Pedriatria recibirá " + resultadoP
				+ "€ y Traumatología recibirá " + resultadoT + "€");
		System.out.println(" ");
	}

	public void Ejercicio6() {
		// Ejercicio 6

		System.out.println("¿Cuantas horas has hecho hoy?");
		int horasPlus = 0, horasPlus8 = 8, horas = teclado.nextInt();
		double paga = 0;

		if (horas <= 40) {
			paga = 40 * horas;
		} else if (horas > 40 && horas <= 48) {
			horasPlus = horas - 40;
			horas -= horasPlus;
			paga = 40 * horas;
			paga += 80 * horasPlus;
		} else if (horas > 48) {
			horasPlus = horas - 48;
			System.out.println(horasPlus);
			horas -= horasPlus + horasPlus8;
			System.out.println(horas);
			paga = 40 * horas;
			System.out.println(paga);
			paga += 80 * horasPlus8;
			System.out.println(paga);
			paga += 120 * horasPlus;
			System.out.println(paga);
		}
		System.out.println("Este es tu sueldo " + paga);
	}

	public void Ejercicio7() {
		// Ejercicio 7

		String user1 = "admin", pass1 = "admin123", user2 = "user", pass2 = "user123", user3 = "guest",
				pass3 = "guest123";

		System.out.println("Ingrese el usuario:");
		String usuario = teclado.nextLine();
		System.out.println("Ingrese la contraseña:");
		String pass = teclado.nextLine();

		if (user1.equals(usuario) && pass1.equals(pass) || user2.equals(usuario) && pass2.equals(pass)
				|| user3.equals(usuario) && pass3.equals(pass)) {
			System.out.println("Bienvenido!");
		} else {
			System.out.println("Usuario o contraseña incorrectos.");
		}
	}

	public void Ejercicio8() {
		// Ejercicio 8

		System.out.println("Ingrese la cordenada x:");
		int x = teclado.nextInt();
		System.out.println("Ingrese la cordenada y:");
		int y = teclado.nextInt();

		if (x >= 0 && y > 0 || x > 0 && y >= 0) {
			System.out.println("Estas en el cuadrante 2");
		} else if (x <= 0 && y < 0 || x < 0 && y <= 0) {
			System.out.println("Estas en el cuadrante 3");
		} else if (x >= 0 && y < 0 || x > 0 && y <= 0) {
			System.out.println("Estas en el cuadrante 4");
		} else if (x <= 0 && y > 0 || x < 0 && y >= 0) {
			System.out.println("Estas en el cuadrante 1");
		} else {
			System.out.println("Estas en el centro");
		}

	}

	public void Ejercicio9() {
		// Ejercicio 9

		System.out.println("Ingrese su sueldo");
		double sueldo = teclado.nextDouble();
		System.out.println("Ingrese los años te antiguedad");
		int años = teclado.nextInt();
		double bono = 0;

		if (sueldo < 500 && años >= 10) {
			bono = sueldo * 0.20;
			sueldo += bono;
			System.out.println("El sueldo es de " + sueldo + "€.");
		} else if (sueldo < 500 && años < 10) {
			bono = sueldo * 0.05;
			sueldo += bono;
			System.out.println("El sueldo es de " + sueldo + "€.");
		} else if (sueldo >= 500) {
			System.out.println("El sueldo es de " + sueldo + "€.");
		}
	}

	public void Ejercicio10() {
		// Ejercicio 10

		int[] notas = new int[10];
		int menor = 0, mayor = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("ingrese una nota del alumno " + i);
			int notaAlumno = teclado.nextInt();
			notas[i] = notaAlumno;
		}

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 7) {
				mayor++;
			} else {
				menor++;
			}

		}
		System.out.println("Notas mayor que 7: " + mayor + ". Notas menor a 7: " + menor);
	}
	
	public void Ejercicio11() {
		
	}
	
	
	public void Ejercicio12() {
//		//Ejercicio 12

//		System.out.println("Indica cuantas personas: ");
//		double personas = teclado.nextDouble();
//		double[][] notas = new double[personas][2];
//		double suma = 0;
//		
//		for(int i=0; i<personas; i++) {
//			System.out.println();
//		}
	}

	public void Ejercicio13() {
		
	}
	
	
	public void Ejercicio14() {
		// EJERCICIO 14
		System.out.println("Cuantos trabajadores ");
		int personas = teclado.nextInt();
		int[] sueldos = new int[personas];
		int menor = 0, mayor = 0, suma = 0;

		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Sueldo del empleado " + i);
			int sueldo = teclado.nextInt();
			sueldos[i] = sueldo;
			suma += sueldos[i];

		}

		for (int i = 0; i < sueldos.length; i++) {
			if (sueldos[i] >= 100 && sueldos[i] <= 300) {
				menor++;
			} else if (sueldos[i] > 300) {
				mayor++;
			}

		}

		System.out.println(menor + " personas cobran entre 100 y 300. " + mayor + " cobran mas de 300.");
	}

	public void Ejercicio15() {
		// Ejercicio 15
		int valores = 0;
		int suma = 0;
		double prom = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("valor " + i);
			valores = teclado.nextInt();
			suma += valores;
		}
		System.out.println("La suma total es de " + suma + "y el promedio es de " + suma / 10);

	}

	public void Ejercicio16() {
		// EJERCICIO 16
		System.out.println("Cuantos triangulos hay: ");
		int triangulos = teclado.nextInt();
		int lado1 = 0, lado2 = 0, lado3 = 0;
		int iso = 0, esc = 0, equi = 0;
		String menorTriangulo = "";

		for (int i = 0; i < triangulos; i++) {
			System.out.println("Cm del primer lado");
			lado1 = teclado.nextInt();
			System.out.println("Cm del segundo lado");
			lado2 = teclado.nextInt();
			System.out.println("Cm del tercer lado");
			lado3 = teclado.nextInt();

			if (lado1 == lado2 && lado2 == lado3) {
				equi++;
			}
			if (lado1 == lado2 && lado2 != lado3) {
				iso++;
			}
			if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				esc++;
			}
			System.out.println("-------");
		}

		if (equi < esc && equi < iso) {
			menorTriangulo = " equilateros";
		} else if (esc < equi && esc < iso) {
			menorTriangulo = " escalenos";
		} else if (iso < equi && iso < esc) {
			menorTriangulo = " isosceles";
		}

		System.out.println("Hay " + esc + " triangulos Escalenos");
		System.out.println("Hay " + iso + " triangulos Isosceles");
		System.out.println("Hay " + equi + " triangulos Equilateros");
		System.out.println("Hay menos triangulos " + menorTriangulo);
	}

	public void Ejercicio16Arrays() {
		// EJERCICIO 16 con ARRAYS
		System.out.println("Cuantos triangulos hay: ");
		int t = teclado.nextInt();
		int[][] triangulos = new int[t][3];
		int iso = 0, esc = 0, equi = 0;
		String menorTriangulo = "";

		for (int i = 0; i < t; i++) {
			System.out.println("Triangulo numero " + i);
			for (int j = 0; j < 3; j++) {
				System.out.println("Ingrese lado" + j);
				triangulos[i][j] = teclado.nextInt();
			}
		}

		for (int i = 0; i < t; i++) {
			if (triangulos[i][0] == triangulos[i][1] && triangulos[i][0] == triangulos[i][2]) {
				equi++;
			} else if (triangulos[i][0] == triangulos[i][1] && triangulos[i][0] != triangulos[i][2]) {
				iso++;
			} else if (triangulos[i][0] != triangulos[i][1] && triangulos[i][0] != triangulos[i][2]
					&& triangulos[i][1] != triangulos[i][2]) {
				esc++;
			}
		}
		System.out.println("-------");

		if (equi < esc && equi < iso) {
			menorTriangulo = " equilateros";
			System.out.println("Hay menos triangulos" + menorTriangulo);
		} else if (esc < equi && esc < iso) {
			menorTriangulo = " escalenos";
			System.out.println("Hay menos triangulos" + menorTriangulo);
		} else if (iso < equi && iso < esc) {
			menorTriangulo = " isosceles";
			System.out.println("Hay menos triangulos" + menorTriangulo);
		} else {
			System.out.println("hay los mismos triangulos");
		}

		System.out.println("Hay " + esc + " triangulos Escalenos");
		System.out.println("Hay " + iso + " triangulos Isosceles");
		System.out.println("Hay " + equi + " triangulos Equilateros");

	}

}
