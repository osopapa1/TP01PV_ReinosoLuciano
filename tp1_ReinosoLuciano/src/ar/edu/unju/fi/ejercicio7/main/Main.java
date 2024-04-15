package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese el nombre del empleado: ");
		String nombre = sc.next();
		System.out.println("Ingrese el legajo del empleado: ");
		String legajo = sc.next();
		System.out.println("Ingrese el salario del empleado: ");
		Double salario = sc.nextDouble();
		Empleado empleado = new Empleado (nombre, legajo, salario);
		
		empleado.mostrarDatos();
		empleado.aumentoSalario();
		empleado.mostrarDatos();
	}

}

