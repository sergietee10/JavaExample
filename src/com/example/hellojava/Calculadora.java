package com.example.hellojava;

public class Calculadora {

	private int resultado, valor1, valor2;

	public int suma() {
		resultado = valor1+valor2;
		return resultado;
	}

	public int resta() {
		resultado = valor1-valor2;
		return resultado;
	}

	public int multiplicacion() {
		resultado = valor1*valor2;
		return resultado;

	}

	public int division() {
		resultado = valor1/valor2;
		return resultado;

	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}


	
	
}
