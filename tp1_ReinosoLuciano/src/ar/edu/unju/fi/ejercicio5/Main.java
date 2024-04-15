package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = 0;
		
		do {
			System.out.println("Ingrese un numero: ");
			num = sc.nextInt();
		} while (num < 1 || num > 9);
	
		
		for (int i = 0; i < 11; i++) {
			System.out.println(+num+" x "+i+" = "+(num*i));			
		}
		
	}

}
