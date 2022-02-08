package com.example.hellojava;

public class Area {

	private String triangulo, cuadrado, rectangulo;
	private int areaT, perimetro, base, altura, ladoRe1, ladoRe2, ladoCua, lado1, lado2, lado3, lado4, resultadoA, resultadoP;
	double areaC, radio, pi=3.14;
	
	public int AreaTriangulo() {
		areaT = lado1*altura;
		resultadoA = areaT/2;
		return resultadoA;
	}
	
	public int PerimetroTriangulo() {
		resultadoP = lado1+lado2+lado3;
		return resultadoP;
	}
	
	public int AreaCirculo() {
		areaC = radio*radio;
		resultadoA = (int) (areaC*pi);
		return resultadoA;
	}
	
	public int PerimetroCirculo() {
		resultadoP = (int) (2*pi*radio);
		return resultadoP;
	}
	
	public int AreaCuadrado() {
		resultadoA = ladoCua*ladoCua;
		return resultadoA;
	}
	
	public int PerimetroCuadrado() {
		resultadoP = ladoCua*4;
		return resultadoP;
	}
	
	public int AreaRectangulo() {
		resultadoA = ladoRe1*ladoRe2;
		return resultadoA;
	}
	
	public int PerimetroRectangulo() {
		resultadoP = ladoRe1*2+ladoRe2*2;
		return resultadoP;
	}

	public String getTriangulo() {
		return triangulo;
	}

	public void setTriangulo(String triangulo) {
		this.triangulo = triangulo;
	}

	public String getCuadrado() {
		return cuadrado;
	}

	public void setCuadrado(String cuadrado) {
		this.cuadrado = cuadrado;
	}

	public String getRectangulo() {
		return rectangulo;
	}

	public void setRectangulo(String rectangulo) {
		this.rectangulo = rectangulo;
	}

	public int getArea() {
		return areaT;
	}

	public void setArea(int area) {
		this.areaT = area;
	}

	public int getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(int perimetro) {
		this.perimetro = perimetro;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	public int getLado4() {
		return lado4;
	}

	public void setLado4(int lado4) {
		this.lado4 = lado4;
	}

	public int getResultadoA() {
		return resultadoA;
	}

	public void setResultadoA(int resultadoA) {
		this.resultadoA = resultadoA;
	}

	public int getResultadoP() {
		return resultadoP;
	}

	public void setResultadoP(int resultadoP) {
		this.resultadoP = resultadoP;
	}

	public int getAreaT() {
		return areaT;
	}

	public void setAreaT(int areaT) {
		this.areaT = areaT;
	}

	public double getAreaC() {
		return areaC;
	}

	public void setAreaC(double areaC) {
		this.areaC = areaC;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public int getLadoCua() {
		return ladoCua;
	}

	public void setLadoCua(int ladoCua) {
		this.ladoCua = ladoCua;
	}

	public int getLadoRe1() {
		return ladoRe1;
	}

	public void setLadoRe1(int ladoRe1) {
		this.ladoRe1 = ladoRe1;
	}

	public int getLadoRe2() {
		return ladoRe2;
	}

	public void setLadoRe2(int ladoRe2) {
		this.ladoRe2 = ladoRe2;
	}
	
	
	
}
