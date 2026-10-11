package com.tucurso;

import com.tucurso.utilidades.Texto;
import java.util.ArrayList;

public class Colecciones {
	public static int sumaTotal_array (int[] n) {
		int suma = 0;

		for (int x : n) {
			suma += x;
		}

		return (suma);
	}

	public static int sumaTotal_arrayl (ArrayList<Integer> n) {
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

		for (int i : array) {
			resultado=resultado+i+",";
		}

		return(resultado.substring(0, resultado.length()-1) + ")");
	}

	public static void main (String[] args) {
	
		separador();
		System.out.println("Metodo Suma Total V1");
		separador();

		int[] numeros_array = {0,1,2,3,4,5,6,7,8,9,10};
		

		System.out.println("Array: " + imprimirIntArray(numeros_array));
		System.out.println("Suma Total Array: " + sumaTotal_array(numeros_array)+"\n");

		separador();
		System.out.println("Metodo Suma Total V2");
		separador();

		ArrayList<Integer> numeros_arrayl = new ArrayList<>();

		for (int i = 0; i<=10; i++) {
			numeros_arrayl.add(i);
		}

		System.out.println("Array List" + numeros_arrayl);
		System.out.println("Suma Total Array List: " +sumaTotal_arrayl(numeros_arrayl)+"\n");


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
	}	

}