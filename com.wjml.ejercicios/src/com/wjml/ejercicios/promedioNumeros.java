package com.wjml.ejercicios;

import java.util.Scanner;

public class promedioNumeros {
	
	// Metodo para saber el promedio de un listado de numeros ingresados por consola

	public static void main(String[] args) {
		
		int suma, cantidad, num;
		suma = 0;
		
		Scanner leerc = new Scanner (System.in);
		
		System.out.println("Ingrese la cantidad de numeros: ");
		cantidad = leerc.nextInt();
		
		Scanner leern = new Scanner (System.in);
		
		for (int i = 1; i <= cantidad; i++) {
			System.out.println("Ingrese el numero: ");
			num = leern.nextInt();
			suma = suma + num;
		}
		System.out.println("El promedio es: " + suma/cantidad);
	}
}	