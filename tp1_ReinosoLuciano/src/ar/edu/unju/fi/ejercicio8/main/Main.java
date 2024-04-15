package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un valor: ");
		int n = sc.nextInt();
		CalculadoraEspecial cal = new CalculadoraEspecial();
		cal.setN(n);
		System.out.println("\nResultado de la Sumatoria: "+cal.CalcularSumatoria());
		System.out.println("\nResultado de la Productoria: "+cal.CalcularProductoria());
		sc.close();
	}

}
