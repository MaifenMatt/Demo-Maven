package com.tucurso;

import com.tucurso.utilidades.Texto;
import java.util.ArrayList;

public class Colecciones {
	public static int sumaTotalArray (int[] n) {
		int suma = 0;

		for (int x : n) {
			suma += x;
		}

		return (suma);
	}

	public static int sumaTotalArrayl (ArrayList<Integer> n) {
		int suma = 0;

		for (Integer x : n) {
			suma += x;
		}

		return (suma);
	}

	public static void separador () {
		System.out.println("-----------------------------------------------------------");
	}

	public static String imprimirIntArray (int[] array){
		String resultado="(";

		if (array.length > 0) {
			for (int i : array) {
				resultado=resultado+i+",";
			}
			return(resultado.substring(0, resultado.length()-1) + ")");
		} else {
			return("()");
		}
	}

	public static void main (String[] args) {
	
		separador();
		System.out.println("Metodo Suma Total V1");
		separador();

		int[] numerosArray = {0,1,2,3,4,5,6,7,8,9,10};
		

		System.out.println("Array: " + imprimirIntArray(numerosArray));
		System.out.println("Suma Total Array: " + sumaTotalArray(numerosArray)+"\n");

		separador();
		System.out.println("Metodo Suma Total V2");
		separador();

		ArrayList<Integer> numerosArrayl = new ArrayList<>();

		for (int i = 0; i<=10; i++) {
			numerosArrayl.add(i);
		}

		System.out.println("Array List" + numerosArrayl);
		System.out.println("Suma Total Array List: " +sumaTotalArrayl(numerosArrayl)+"\n");


		separador();
		System.out.println("For-each String");
		separador();

		ArrayList <String> nombres = new ArrayList<>();

		nombres.add("Marco");
		nombres.add("Martin");
		nombres.add("Marvin");


		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		System.out.println(" \n");

		/*
		separador();
		System.out.println("For Fallido");
		separador();
		
		int[] numeros2 = {0,1,2,3};

		for (int i=0 ; i<=10 ; i++) {
			System.out.println(numeros2[i]);
		}
		*/
		Texto.inicioSeccion("Prueba import propio");
		System.out.println("\nDodo Magico");
		Texto.finSeccion();

		Texto.inicioSeccion("Imprimir Array Fallido");

		int[] arrayVacio={};

		System.out.println(imprimirIntArray(arrayVacio));

		Texto.finSeccion();
	}	

}