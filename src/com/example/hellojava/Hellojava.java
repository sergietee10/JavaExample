package com.example.hellojava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hellojava {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		
		
//OBJETO TAXI HEREDADO DE ANIMAL
//		Taxi taxi = new Taxi("ABC 6353", "Renault Clio", 125, 54312352);
//		System.out.println(taxi.toString());
//OBJETO AUTOBUS HEREDADO DE ANIMAL
//		Autobus autobus = new Autobus("FDR 5432", "Mercedes", 250, 45);
//		System.out.println(autobus.toString());
		
		
//OBJETO ALUMNO HEREDADO DE PERSONA
//		Alumno alumno1 = new Alumno("Carlos", "garcia", 23, "masculino", "estudiar", "A", 5);
//		System.out.println(alumno1.toString());
		
		
//OBJETO PERRO HEREDADO DE ANIMAL
//		Perro objPerro = new Perro("Canino", 4, "Carnivoro", "Pitbull", "Mediano");
//		System.out.println(objPerro.toString());
//				
//OBJETO GATO HEREDADO DE ANIMAL
//		Gato objGato = new Gato(null, 0, null, null, null);
//		objGato.andar();
		
		
		
//EJERCICIO FIGURAS GEOMETRICAS Y SU AREA Y PERIMETRO
//		System.out.println(
//				"Que quieres calcular:\n ------------- \nTriangulo pulsa 1.\nCirculo pulsa 2.\nCuadrado pulsa 3.\nRectangulo pulsa 4. ");
//		int valor = teclado.nextInt();
//		System.out.println("-------------");
//		Area area = new Area();
//
//		switch (valor) {
//		case 1:
//			System.out.println("Indica la base del triangulo: ");
//			int ladoT1 = teclado.nextInt();
//			System.out.println("Indica el lado del triangulo: ");
//			int ladoT2 = teclado.nextInt();
//			System.out.println("Indica el otro lado del triangulo: ");
//			int ladoT3 = teclado.nextInt();
//			System.out.println("Indica la altura: ");
//			int altura = teclado.nextInt();
//			area.setLado1(ladoT1);
//			area.setLado2(ladoT2);
//			area.setLado3(ladoT3);
//			area.setAltura(altura);
//			System.out.println("-------------");
//			System.out.print("La area del triangulo es: ");
//			System.out.println(area.AreaTriangulo());
//			System.out.print("Y el perimetro del triangulo es: ");
//			System.out.println(area.PerimetroTriangulo());
//			break;
//		case 2:
//			System.out.println("Indica el radio del circulo: ");
//			int radio = teclado.nextInt();
//			area.setRadio(radio);
//			System.out.println("-------------");
//			System.out.println("La area del circulo es:");
//			System.out.println(area.AreaCirculo());
//			System.out.println("Y el perimetro del circulo es:");
//			System.out.println(area.PerimetroCirculo());
//			break;
//		case 3:
//			System.out.println("Indica el lado del cuadrado: ");
//			int ladoCua = teclado.nextInt();
//			area.setLadoCua(ladoCua);
//			System.out.println("-------------");
//
//			System.out.println("La area del cuadrado es:");
//			System.out.println(area.AreaCuadrado());
//			System.out.println("Y el perimetro del cuadrado es:");
//			System.out.println(area.PerimetroCuadrado());
//			break;
//		case 4:
//			System.out.println("Indica la base del rectangulo: ");
//			int ladoRe1 = teclado.nextInt();
//			System.out.println("Indica el lado del rectangulo: ");
//			int ladoRe2 = teclado.nextInt();
//			area.setLadoRe1(ladoRe1);
//			area.setLadoRe2(ladoRe2);
//			System.out.println("La area del rectangulo es:");
//			System.out.println(area.AreaRectangulo());
//			System.out.println("Y el perimetro del rectangulo es:");
//			System.out.println(area.PerimetroRectangulo());
//			break;
//
//		}

// CALCULADORA
//		Calculadora calculadora = new Calculadora();
//		System.out.println("Indica el primer valor ");
//		int valor1 = teclado.nextInt();
//		System.out.println("Indica el segundo valor ");
//		int valor2 = teclado.nextInt();
//		
//		calculadora.setValor1(valor1);
//		calculadora.setValor2(valor2);
//		int total=0;
//		System.out.println("Para sumar pulsa 1, para restar pulsa 2, para multiplicar pulsa 3 y para dividir pulsa 4 ");
//		total = teclado.nextInt();
//		
//		switch(total) {
//		case 1:
//			System.out.println("La suma de "+valor1+" y de "+valor2+" es:");
//			System.out.println(calculadora.suma());
//			break;
//		case 2:
//			System.out.println("La resta de "+valor1+" y de "+valor2+" es:");
//			System.out.println(calculadora.resta());
//			break;
//		case 3:
//			System.out.println("La multiplicacion de "+valor1+" y de "+valor2+" es:");
//			System.out.println(calculadora.multiplicacion());
//			break;
//		case 4:
//			System.out.println("La division de "+valor1+" y de "+valor2+" es:");
//			System.out.println(calculadora.division());
//			break;
//			default: 
//				System.out.println("Ese numero no es correcto.");
//		}

// EJERCICIOS
//		Ejercicios ejercicios = new Ejercicios();
//		System.out.println("Selecciona el ejercicio que quieres ejecutar: ");
//		int ejercicio = teclado.nextInt();
//		
//		switch (ejercicio) {
//		case 1:
//			ejercicios.Ejercicio1();
//			break;
//		case 2:
//			ejercicios.Ejercicio2();
//			break;
//		case 3:
//			ejercicios.Ejercicio3();
//			break;
//		case 4:
//			ejercicios.Ejercicio4();
//			break;
//		case 5:
//			ejercicios.Ejercicio5();
//			break;
//		case 6:
//			ejercicios.Ejercicio6();
//			break;
//		case 7:
//			ejercicios.Ejercicio7();
//			break;
//		case 8:
//			ejercicios.Ejercicio8();
//			break;
//		case 9:
//			ejercicios.Ejercicio9();
//			break;
//		case 10:
//			ejercicios.Ejercicio10();
//			break;
//		case 11:
//			ejercicios.Ejercicio11();
//			break;
//		case 12:
//			ejercicios.Ejercicio12();
//			break;
//		case 13:
//			ejercicios.Ejercicio13();
//			break;
//		case 14:
//			ejercicios.Ejercicio14();
//			break;
//		case 15:
//			ejercicios.Ejercicio15();
//			break;
//		case 16:
//			ejercicios.Ejercicio16();
//			break;
//		case 17:
//			ejercicios.Ejercicio16Arrays();
//			break;
//		default:
//			System.out.println("No has hecho este ejercicio aun.");
//			break;
//		}

// CLASE PERSONA CON CONSTRUCTOR
//		Persona persona1 = new Persona("Nacho", "Mateo");
//		persona1.infoPersona();

//CLASE PERSONA
//		Persona persona1 = new Persona();
//		persona1.setNombre("Jose");
//		persona1.setApellido("Garcia");
//		persona1.setDireccion("Calle maracas");
//		persona1.setPais("España");
//		persona1.setTelefono(999999999);
//		persona1.infoPersona();
//		
//		Persona persona2 = new Persona();
//		persona2.setNombre("Carlos");
//		persona2.setApellido("Mata");
//		persona2.setDireccion("Calle Guadalupe");
//		persona2.setPais("Argentina");
//		persona2.setTelefono(888888888);
//		persona2.infoPersona();

//CREACION DE OBJETO DE LA CLASE COCHE O INSTANCIA DE LA CLASE COCHE
//		Coche coche1 = new Coche();
//		coche1.color="Rojo";
//		coche1.ruedas=4;
//		coche1.velocidad=200;
//		coche1.setMotor(300);
//		System.out.println(coche1.getMotor());
//		coche1.infoCoche();
//		
//		System.out.println(coche1.arranca());
//		Coche coche2 = new Coche();
//		System.out.println("-------------------");
//		coche2.color="Verde";
//		coche2.ruedas=6;
//		coche2.velocidad=320;
//		coche2.setMotor(290);
//		System.out.println(coche2.getMotor());
//		coche2.infoCoche();

	}

}
