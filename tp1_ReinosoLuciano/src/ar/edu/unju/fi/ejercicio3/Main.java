package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese un número: ");
		int n1 = sc.nextInt();
		if ( n1 % 2 == 0) {
		System.out.println("El número es par. Su triple es: " +n1*3);
		}
		else {
			System.out.println("El número es impar. Su doble es: "+n1*2);
		}

	}

}
