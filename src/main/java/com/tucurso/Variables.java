package com.tucurso;

public class Variables {
	public static void main(String[] args) {
		int edad = 25;
		double altura = 1.70;
		String nombre = "Ana";
		boolean esEstudiante = true;
		final String ciudad = "Cochabamba";
		String etapaVida;		

		if (edad >= 18) {
			etapaVida = "Mayor de edad";
		} else if (edad >= 13) {
			etapaVida = "Adolescente";
		} else {
			etapaVida = "Nini";
		}



		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Altura: " + altura);
		System.out.println("Es estudiante: " + esEstudiante);
		System.out.println("Ciudad: " + ciudad);

		System.out.println("Ciudad: " + ciudad);

		System.out.println("Etapa de su vida: " + etapaVida);


	}	
}
