package com.tucurso;

import java.util.HashMap;
import com.tucurso.utilidades.Texto;
import java.util.ArrayList;


public class Mapas {
	public static int buscarInt(String[] keys, int[] values, String lookedKey) {
		int index = 0;
		for (String i : keys) {
			if (i.equals(lookedKey)) {
				return(values[index]);
			} else {
				index ++;
			}
		}

		return(0);
	}

	public static ArrayList<Integer> contarPalabrasSinMapa(String oracion) {
		String[] oracionDividida = oracion.split(" ");
		
		ArrayList<Integer> conteoPalabras = new ArrayList<>();
		ArrayList<String> palabras = new ArrayList<>();

		int index;

		for (String i:oracionDividida) {
			//debuging
			//System.out.println(i);
			//System.out.println(palabras.contains(i));
			
			if (palabras.contains(i)) {
				index=palabras.indexOf(i);
				conteoPalabras.set(index, conteoPalabras.get(index)+1);
			} else {
				palabras.add(i);
				index=palabras.indexOf(i);
				conteoPalabras.add(1);
			}
		}

		return(conteoPalabras);
	}

	public static HashMap<String,Integer> contarPalabrasConMapa(String oracion) {
		HashMap<String,Integer> conteoPalabras = new HashMap<> ();
		String[] oracionDividida = oracion.split(" ");

		for (String palabra:oracionDividida) {
			/*if (conteoPalabras.containsKey(palabra)) {
				conteoPalabras.replace(palabra, conteoPalabras.get(palabra) + 1);
			} else {
				conteoPalabras.put(palabra, 1);
			}*/
			conteoPalabras.put(palabra,conteoPalabras.getOrDefault(palabra,0)+1);
		}

		return(conteoPalabras);
	}

	public static void main(String[] args) {
		Texto.inicioSeccion("Primer Ejercicio - HashMap Precios");
		
		HashMap<String,Double> precios = new HashMap<> ();
		precios.put("Res",10.95);
		precios.put("Pollo",4.99);
		precios.put("Cerdo",8.49);
		System.out.println(precios);

		for (String i:precios.keySet()) {
			System.out.println("Para producto " + i + " tendra que pagar " + precios.get(i));
		}
		
		Texto.finSeccion();
		Texto.inicioSeccion("Segundo Ejercicio - HashMap con arrays");
		
		String[] keyList = {"Dodo", "Mono", "Loco", "Roco"};
		int[] valueList = {0,1,2,3};

		System.out.println("\nClave: " + "Loco");
		System.out.println("Valor: " + buscarInt(keyList, valueList, "Loco"));

		Texto.finSeccion();
		Texto.superSeccion("Tercer Ejercicio - Metodo Contar Palabras");
		
		String oracion = "Maria come comida suelta mientras suelta comida para gente llamada Maria suelta para gente";

		Texto.inicioSeccion("Sin Mapas");
		
		System.out.println("Oracion: " + oracion);
		System.out.println("Conteo: " + contarPalabrasSinMapa(oracion));

		Texto.finSeccion();
		Texto.inicioSeccion("Con Mapas");

		System.out.println("Oracion: " + oracion);
		System.out.println("Conteo: " + contarPalabrasConMapa(oracion));

		Texto.finSeccion();
		Texto.inicioSeccion("Cuarto Ejercicio - Prueba Key fuera del KeySet");
		
		HashMap<String,Integer> edades = new HashMap<> ();
		
		edades.put("Ana", 25);
		edades.put("Luis", 30);
		edades.put("Ana", 26);
		edades.put("Ana", 27);

		//int edadPedro = edades.get("Pedro");

		edades.put("Pedro", 40);

		//Mi hipotesis es que puede devolver un error, o se habra generado un puntero a la direccion vacia.

		//System.out.println(edadPedro); // Devolvio una excepcion de error "Java cannot inoke this value becuase the result of this call is null"

		//Mi hipotesis es que devolvera o la primera Ana o una lista con ambas.

		System.out.println("Edad Ana: " + edades.get("Ana")); // En efecto unicamente devuelve la ultima Ana de la lista.

		Texto.finSeccion();
	}
}