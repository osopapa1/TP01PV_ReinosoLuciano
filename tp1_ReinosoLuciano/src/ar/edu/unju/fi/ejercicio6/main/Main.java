package ar.edu.unju.fi.ejercicio6.main;

import java.util.Scanner;
import java.util.Set;
import java.time.LocalDate;
import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//1er objeto
		//Constructor por defecto
		
		System.out.println("Constructor por defecto - Carga de datos");
		
		Persona pers1 = new Persona ();
		
		System.out.println("Ingrese su D.N.I: ");
		String dni2 = sc.nextLine();
		pers1.setDni(dni2);
		System.out.println("Ingrese su nombre: ");
		String nombre2 = sc.nextLine();
		pers1.setNombre(nombre2);
		System.out.println("Ingrese su Fecha de nacimiento (YYYY-MM-DD): ");
		String fecha2 = sc.nextLine();
		LocalDate fechaDeNac2 = LocalDate.parse(fecha2);
		pers1.setFechaDeNac(fechaDeNac2);
		System.out.println("Ingrese su provincia: ");
		String provincia2 = sc.nextLine();
		pers1.setProvincia(provincia2);
		
		//2do objeto
		//Contructor sin provincia
		
		System.out.println("Segundo constructor (Sin provincia) - Carga de datos");
		
		System.out.println("Ingrese su D.N.I: ");
		String dni1 = sc.nextLine();
		System.out.println("Ingrese su nombre: ");
		String nombre1 = sc.nextLine();
		System.out.println("Ingrese su Fecha de nacimiento (YYYY-MM-DD): ");
		String fecha1 = sc.nextLine();
		LocalDate fechaDeNac1 = LocalDate.parse(fecha1);
		Persona pers2 = new Persona (dni1, fechaDeNac1, nombre1);
		
		
		//3er objeto
		//Contructor parametrizado
		
		System.out.println("Constructor Parametrizado - Carga de datos");
		
		System.out.println("Ingrese su D.N.I: ");
		String dni = sc.nextLine();
		System.out.println("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese su Fecha de nacimiento (YYYY-MM-DD): ");
		String fecha = sc.nextLine();
		LocalDate fechaDeNac = LocalDate.parse(fecha);
		System.out.println("Ingrese su provincia: ");
		String provincia = sc.nextLine();
		Persona pers3 = new Persona (dni, fechaDeNac, nombre, provincia);
		
		System.out.println("\n\n");
		System.out.println("\n Datos de la primera persona: ");
		pers1.mostrarDatos();
		System.out.println("\n Datos de la segunda persona: ");
		pers2.mostrarDatos();
		System.out.println("\n Datos de la tercera persona: ");
		pers3.mostrarDatos();		

	}

}
