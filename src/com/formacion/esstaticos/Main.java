package com.formacion.esstaticos;

public class Main {

	public static void main(String[] args) {
		
		Clase1 clase1 = new Clase1();
		clase1.codigo="5134";
		System.out.println(clase1.codigo);
		
		Clase1 clase2 = new Clase1();
		clase2.codigo="543462";
		System.out.println(clase2.codigo);
		System.out.println(clase1.codigo);

		Clase1 clase3 = new Clase1();
		System.out.println(clase3.codigo);
		
		System.out.println(Clase1.codigo);
		Clase1.saludar();
	}

}
