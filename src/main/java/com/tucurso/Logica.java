package com.tucurso;

public class Logica {
	public static void main(String[] args) {
		System.out.println("--------------------------------------------------");
		System.out.println("Bucle For");
		System.out.println("--------------------------------------------------");
		for (int i=1; i<=10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " Es par");
			} else {
				System.out.println(i + " Es impar");
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Bucle While");
		System.out.println("--------------------------------------------------");

		int i = 10;

		while (i>0) {
			if (i % 2 == 0) {
				System.out.println(i + " Es par");
			} else {
				System.out.println(i + " Es impar");
			}
		i--;
		}
	}
}