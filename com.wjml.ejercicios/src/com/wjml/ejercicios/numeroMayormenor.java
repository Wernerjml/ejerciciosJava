package com.wjml.ejercicios;


import java.util.Scanner;

public class numeroMayormenor {

	public static void main(String[] args) {
		
		// Metodo para solicitar una lista de numeros y encontrar el mayor y menor
		
		int cantidad, numero;
		
		numero = 0;
		
		Scanner leer = new Scanner (System.in);
		Scanner leerlist = new Scanner (System.in);
		
		System.out.println("Se calculara el numero mayor y menor" + "\n¿Cuantos numeros ingresara?");
		cantidad = leer.nextInt();
		
		Integer [] numeros = new Integer[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
            System.out.print(i+1 + ") ");
            numeros[i] = leerlist.nextInt();
        }
		System.out.println("\nLos numeros ingresados son:\n");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numeros[i]);
        }
        int mayor, menor;
        mayor = menor = numeros [0];
       
        for (int i = 0; i < numeros.length; i++) {
            if(numeros [i] > mayor) {
                mayor = numeros[i];
            }
            if(numeros[i]<menor) {
                menor = numeros[i];
            }
        }
        System.out.println("\nEl nuemero mayor es: " + mayor);
        System.out.println("\nEl numero menor es: " + menor);
    }	
}