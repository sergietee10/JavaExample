package com.formacion.ejercicio;

public class Libro extends Persona implements Fecha {

	private String fecha, titulo, ISBN, edicion, editorial, lugar, nombreCompleto;
	private int paginas;

	public Libro(String titulo, String edicion, String iSBN, String editorial, String lugar, int paginas, String fecha, String nombreCompleto) {
		this.titulo = titulo;
		ISBN = iSBN;
		this.edicion = edicion;
		this.editorial = editorial;
		this.lugar = lugar;
		this.paginas = paginas;
		this.fecha=fecha;
		this.nombreCompleto=nombreCompleto;
	}
	
	

	@Override
	public String toString() {
		return "Libro\n ---------------\nTitulo:" + titulo + "\nEdicion: " + edicion + "\nAutor: " + nombreCompleto()
				+ "\nISBN: " + ISBN + "\nEditorial: " + editorial + "\nLugar: " + lugar +". "+ fechaEdicion() + "\nPaginas: "
				+ paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String nombreCompleto() {
		// TODO Auto-generated method stub
		return this.nombreCompleto;
	}

	@Override
	public String fechaEdicion() {
		// TODO Auto-generated method stub
		return this.fecha;
	}

}
