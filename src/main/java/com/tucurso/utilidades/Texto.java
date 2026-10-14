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

	public static void superSeccion(String titulo){
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(titulo);
		System.out.println("---------------------------------------------------------------------------");
	}

	public static void main (String[] args) {

	}
}