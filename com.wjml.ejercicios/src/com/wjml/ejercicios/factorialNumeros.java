package com.wjml.ejercicios;

import java.util.Scanner;

public class factorialNumeros {

	public static void main(String[] args) {
		// Metodo para calcular el factorial de un numero
		
		int numero, multiplicador, factorial;
		multiplicador = 1;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese un numero para calcular su factorial: ");
		numero = leer.nextInt();
		factorial = numero;
		
		for (int i = numero; i>0; i-- ) {
			multiplicador *= i;
			System.out.println(" " + i + "*" + "\n" + multiplicador);
		}
			
		System.out.println("El factorial de " + numero + " es " + multiplicador);
	}
}