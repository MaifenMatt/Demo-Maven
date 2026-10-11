package com.tucurso.utilidades;

public class Texto {
	public static void separador() {
		System.out.println("-----------------------------------------------");
	}

	public static void inicioSeccion(String titulo) {
		separador();
		System.out.println(titulo);
		separador();
	}

	public static void finSeccion() {
		System.out.println("\n");
	}

	public static void main (String[] args) {

	}
}