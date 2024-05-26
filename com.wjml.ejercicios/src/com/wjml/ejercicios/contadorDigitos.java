package com.wjml.ejercicios;

import java.util.Scanner;

public class contadorDigitos {

	public static void main(String[] args) {
		// Metodo para contar la cantidad de digitos de un numero ingresado por el usuario
		
		Integer numero;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese un numero entero para contar sus digitos: ");
		numero = leer.nextInt();
		
		String numerostring = Integer.toString(numero);
		
		System.out.println("\nEl numero " + numero + " tiene " + numerostring.length () + " digitos.");
	}
}