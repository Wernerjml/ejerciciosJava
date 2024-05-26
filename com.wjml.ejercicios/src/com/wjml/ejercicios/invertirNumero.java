package com.wjml.ejercicios;

import java.util.Scanner;

public class invertirNumero {

	public static void main(String[] args) {
		
		// metodo para invertir un numero ingresado por el usuario
		
		Integer numero;
		
		int numeroinv = 0;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese un numero para invertir su orden: ");
		numero = leer.nextInt();
		
		while (numero > 0) {
			int ultimonumero = numero % 10;
			numeroinv = (numeroinv * 10) + ultimonumero;
			numero = numero / 10;
		}
		System.out.println("\nOrden invertido: " + numeroinv);
	}
}