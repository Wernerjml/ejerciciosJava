package com.wjml.ejercicios;

import java.util.Scanner;

public class numerosPrimos {

	public static void main(String[] args) {
		
		// Metodo para saber si un numero es primo
		
		int numero, divisor;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese un numero para saber si es primo: ");
		numero = leer.nextInt();
		
		if(numero == 1) {
		
		System.out.println("El numero " + numero + " no es primo");
		}
		else {
			divisor = 2;
			while (numero%divisor != 0) {
				divisor ++;
			}
			if (divisor == numero) {
				System.out.println("El numero " + numero + " es primo");
			}
			else { 
					System.out.println("El numero " + numero + " no es primo");
			}
		}		
	}	
}