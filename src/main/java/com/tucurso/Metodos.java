package com.tucurso;

public class Metodos{

	public static void separador () {
		System.out.println("-----------------------------------------------------------");
	}

	public static int suma (int a, int b) {
		return (a+b);
	}

	public static double cuadrado (double a) {
		return (a*a);
	}

	public static boolean esPar(int a) {
		return(a%2==0);
	}

	public static int triple(int a) {
		return(a*3);
	}

	public static void main (String[] args) {
		separador();
		System.out.println("Metodo suma");
		separador();
		
		int a=2;
		int b=3;

		System.out.println("Termino 1: " + a);
		System.out.println("Termino 2: " + b);
		System.out.println("Suma: " + suma(a,b));
		System.out.println(" ");

		separador();
		System.out.println("Metodo cuadrado");
		separador();

		double c=12.34;

		System.out.println("Numero base: " + c);

		System.out.println("Potencia cuadratica: " + cuadrado(c));

		System.out.println(" ");

		separador();
		System.out.println("Metodo esPar");
		separador();
		
		for (int i=1; i<=10; i++) {
			if (esPar(i)) {
				System.out.println(i + " Es par");
			} else {
				System.out.println(i + " Es impar");
			}
		}
	}
}