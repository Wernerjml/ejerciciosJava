package com.wjml.ejercicios;

import java.util.Scanner;

public class palindromo {

	public static void main(String[] args) {
		
		// metodo para saber si una palabra es un palindromo
		
		String palabra;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese una palabra para saber" + "\nsi es un palindromo: \n");
		palabra = leer.nextLine();
		
		int size = palabra.length();
		
		String palabrainv = "";
		
		for (int i = palabra.length() - 1; i >= 0; i--) {
			palabrainv = palabrainv + palabra.charAt(i);
		}
		System.out.println("\nLa palabra es: " + palabra + "\nLa palabra invertida es: " + palabrainv);
		if (palabra.equals(palabrainv)) {
			System.out.println("\n¡Es un palindromo!");
		}
		else {
			System.out.println("\nNo es un palindromo");
		}
	}		
}
