package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = 0;
		do {
			System.out.println("Ingrese un número dentro del rango numérico [0-10]: ");
			num = sc.nextInt();
		} while (num < 0 || num > 10);
		
		
		int fact = num;
		int i = 1;
		
		if (num == 0) {
			System.out.println("El resultado del factorial es: "+i);
		}
		else {
			while (i < num) {
				fact = fact * i;
				i++;
			}
			
			System.out.println("El resultado del factorial es: "+fact);
		}
	}
}
