package com.wjml.ejercicios;

import java.util.Scanner;

public class sumadosNumeros {
	
	// Metodo para la suma de dos numeros solicitados por consola
	
	public static void main(String[] args) {
		
		int primerNumero = 0;
		int segundoNumero = 0;
		int resultado;
		
		Scanner suma = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero: ");
		primerNumero = suma.nextInt ();
		
		System.out.println("Ingrese el segundo numero: ");
		segundoNumero = suma.nextInt ();
		
		resultado = primerNumero + segundoNumero;
		
		System.out.println("\n" + primerNumero + " + " + segundoNumero + " = " + resultado);
		
	}
	
}