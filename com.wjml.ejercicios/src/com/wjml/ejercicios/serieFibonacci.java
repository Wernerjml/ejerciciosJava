package com.wjml.ejercicios;

import java.util.Scanner;

public class serieFibonacci {

	public static void main(String[] args) {
		// Metodo para mostrar la serie fibonacci.
		
		int limite, sumando, respuesta;
		
		respuesta = 1;
		sumando = 0;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese el limite mayor a 5 para la serie Fibonacci: ");
		limite = leer.nextInt ();
		System.out.println(sumando);
		
		while (sumando <= limite && respuesta <= limite) {
			
			System.out.println(respuesta += sumando);
			System.out.println(sumando += respuesta);
		}
	}
}	