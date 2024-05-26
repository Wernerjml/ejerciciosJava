package com.wjml.ejercicios;

import java.util.Scanner;

public class tablaMultiplicar {

	public static void main(String[] args) {
		// Metodo para generar la tabla de multiplicar de un numero
		
		int numero, resultado;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese un numero para visualizar la tabla de multiplicar: ");
		numero = leer.nextInt ();
		
		for (int i = 1; i < 11; i++) {
			resultado = numero * i;
			
			System.out.println(numero + " X " + i + " = " + resultado);
		}
	}
}
