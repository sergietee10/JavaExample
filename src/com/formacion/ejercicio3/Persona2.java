package com.formacion.ejercicio3;
import java.util.*;

public class Persona2 {

	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
	
	
	//CONSTRUCTOR POR DEFECTO 
	public Persona2 () {
		nombre = "";
		edad =0;
		this.DNI =generaDNI();
		sexo = 'H';
		peso =0;
		altura =0;		
		comprobarSexo(this.sexo);
	}
	
	//CONSTRUCTOR CON SOLO UNOS PARAMETROS
	public Persona2 (String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI =generaDNI();
		this.sexo='H';
		peso =0;
		altura =0;
		comprobarSexo(this.sexo);
	}

	//CONSTRUCTOR CON LOS ATRIBUTOS POR PARAMETRO
	public Persona2(String nombre, int edad,  char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI =generaDNI();
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		comprobarSexo(this.sexo);
	}
	
	//METODOS SETTER
	
	public void setNombre(String nombre) {this.nombre = nombre;}

	public void setEdad(int edad) {this.edad = edad;}

	public void setPeso(double peso) {this.peso = peso;}

	public void setAltura(double altura) {this.altura = altura;}
	
	public void setSexo (char sexo) { this.sexo=sexo;}
	//MÉTODO TO STRING
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	//METODO DE CALCULAR LA MASA CORPORAL
	public void calcularIMC(){
		
		double imc = peso/(altura*altura);

		if(imc <20) {
			System.out.println(-1+ "--> Bajo peso");
		} 
		else  if(imc>=20 && imc <=25) {
			System.out.println(0+ "--> Saludable");

		} else if(imc>25) {
			System.out.println(1+ "--> Sobrepeso");
		}
	}
	
	//METODO MAYOR DE EDAD
	public boolean esMayordeEdad() {
		if (edad>18) {
			return true;
		} else {
			return false;
		}
	}
	
	//COMPROBACIÓN DE SEXO
	public void comprobarSexo (char sexo) {
		
		if(sexo!='H' && sexo!='M') {
			System.out.println("El género está mal introducido");
			this.sexo='H';
		}
	}
	
	//METODO PARA GENERAR EL DNI
	public String generaDNI() {
		int numero =0;
		String dni ="";
		
		for (int i =0; i<8; i++) {
		 numero = (int)(Math.random() * 10);
		 dni+=numero;
		 
		}
		Random random = new Random();
		char letra = (char) (random.nextInt(26) + 'A');

		return dni+letra;
	}
	
	
	
	
	public static void main (String[]args) {
		
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
		
		
		Persona2 pers = new Persona2(nombre, edad,sexo,peso, altura);
	
		System.out.println(pers.toString());
		

		System.out.println("-------------");
		Persona2 pers2 = new Persona2(nombre, edad,sexo);
		
		System.out.println(pers2.toString());
		System.out.println("-------------");
		Persona pers3= new Persona();
		pers3.setNombre("Pepe");
		pers3.setEdad(17);
		pers3.setSexo('H');
		pers3.setPeso(65.00);
		pers3.setAltura(1.90);
		System.out.println(pers3.toString());
		System.out.println("-------------");
	}
	
	
	
}
