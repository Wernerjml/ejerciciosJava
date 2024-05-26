package com.wjml.ejercicios;

import java.util.Scanner;

public class multiplicaciondosNumeros {
	
	// Metodo para la multiplicacion de dos numeros ingresados por consola

	public static void main(String[] args) {
		
		int primerNumero = 0;
		int segundoNumero = 0;
		int resultado;
		
		Scanner multiplicar = new Scanner (System.in);
		
		System.out.println("Ingrese el primer numero: ");
		primerNumero = multiplicar.nextInt ();
		
		System.out.println("Ingrese el segundo numero: ");
		segundoNumero = multiplicar.nextInt();
		
		resultado = primerNumero * segundoNumero;
		
		System.out.println("\n"+ primerNumero + " X " + segundoNumero + " = " + resultado);
		
	}

}