package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
List <Pais> paises = new ArrayList(); 
		
		paises.add(new Pais("c1","argentina"));
		paises.add(new Pais("c2","brasil"));
		
		List<DestinoTuristico> destinos = new ArrayList();
		int op=0;
		do {
			op=menu();
			switch(op) {
			case 1:System.out.println(" Alta de destino turistico :");
					
					DestinoTuristico dt = crearDt();
						if(destinos.add(dt)) {
							System.out.println("Destino agregado con exito");
						}
						else {
							System.out.println("Error al agregar destino");
						}
				break;
			case 2:System.out.println(" Destinos turisticos ");
					mostrarDestinosT(destinos);
				break;
			case 3:System.out.println("Modificar el pais de un destino turistico");
				if(modificarPaisDestino(destinos)) {
					System.out.println(" Se realizaron las modificaciones con exito ");
				}
				else {
					System.out.println(" Error al modificar ");
				}
				break;
			case 4:System.out.println("Limpiar el ArrayList de destinos turisticos");
					destinos.clear();
				break;
			case 5:System.out.println("Eliminar un destino turistico");
					if(eliminarDestino(destinos)) {
						System.out.println(" Se realizaron las modificaciones con exito ");
					}
					else {
						System.out.println("Error al borrar");
					}
				break;
			case 6:System.out.println("Destinos turisticos ordenados por nombre: ");
					mostrarOrdenado(destinos);
				break;
			case 7:System.out.println("Todos los paises: ");
				mostrarPaises(paises);
				break;
			case 8:System.out.println("Destinos turisticos de un pais");
					System.out.println("Ingrese codigo de pais: ");
					Scanner scanner = new Scanner(System.in);
					String cod = scanner.nextLine();
					destinosPorPais(destinos,cod);
				break;
			case 9:System.out.println(" Fin del programa ");
				break;
			default: System.out.println("Opcion incorrecta");
			}
		}while(op != 9);
		
	}
	public static int menu() {
		Scanner scanner = new Scanner(System.in);
		int op=0;
		System.out.println("\n 1- Alta destino turistico.");
		System.out.println(" 2- Mostrar todos los destinos turisticos.");
		System.out.println(" 3- Modificar el pais de un destino turistico.");
		System.out.println(" 4- Limpiar Arraylist de destino turisticos.");
		System.out.println(" 5- Eliminar un destino turistico.");
		System.out.println(" 6- Mostrar destinos turisticos ordenados.");
		System.out.println(" 7- Mostrar todos los paises.");
		System.out.println(" 8- Destinos turisticos de un Pais.");
		System.out.println(" 9- Salir.");
		System.out.println(" \n Ingrese una opcion");
		op = scanner.nextInt();
		scanner.nextLine();
		return op;
	}
	
	static String codigo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese codigo del destino turistico: ");
		return scanner.nextLine();
	}
	static String nombre() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese nombre del destino turistico: ");
		return scanner.nextLine();
	}
	static Float precio() {
		Scanner scanner = new Scanner(System.in);
		float p=0;
		try {
			System.out.println("Ingrese precio: ");
			p = scanner.nextFloat();
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("El dato ingresado no es valido");
		}
		scanner.nextLine();
		return p;
	}
	static Pais pais() {
		Scanner scanner = new Scanner(System.in);
		boolean band=false;
		String c,p="";
		do {
			System.out.println("Ingrese codigo de pais: ");
			System.out.println(" c1 - ARGENTINA");
			System.out.println(" c2 - BRASIL");
			 c = scanner.nextLine();
			if(c.equals("c1")) {
				p = "argentina ";
			}
			if(c.equals("c2")) {
				 p = "brasil ";
			}
			if(c.equals("c1") == true || c.equals("c2") == true) {
				band=true;
			}
			else {
				System.out.println("Error de codigo");
			}
		}while(!band);
		
		
		return new Pais(c,p);
	}
	static int dias() {
		Scanner scanner = new Scanner(System.in);
		int d=0;
		try {
			System.out.println("Ingrese dias: ");
			d = scanner.nextInt();
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("El dato ingresado no es valido");
		}
		scanner.nextLine();
		return d;
	}
	static DestinoTuristico crearDt() {
		return new DestinoTuristico(codigo(),nombre(),precio(),pais(),dias());
	}
	static void mostrarDestinosT(List<DestinoTuristico> destinos) {
		for (DestinoTuristico destinoTuristico : destinos) {
			System.out.println("Destino turistico : "+destinoTuristico.getNombre());
		}
	}
	
	static boolean modificarPaisDestino (List<DestinoTuristico> destinos) {
		Scanner scanner = new Scanner(System.in);
		boolean encontrado = false;
		System.out.println("Ingrese codigo del destino turistico: ");
		String codigo = scanner.nextLine();
			for(int i=0; i< destinos.size(); i++) {
				if(codigo.equals(destinos.get(i).getCodigo())) {
					encontrado = true ;
					destinos.get(i).setPais(pais());
				}
			}
	
		return encontrado;
	}
	static boolean eliminarDestino (List<DestinoTuristico> destinos) {
		Scanner scanner = new Scanner(System.in);
		boolean encontrado = false;
		System.out.println("Ingrese codigo del destino turistico: ");
		String codigo = scanner.nextLine();
			for(int i=0; i< destinos.size(); i++) {
				if(codigo.equals(destinos.get(i).getCodigo())) {
					encontrado = true ;
					destinos.remove(i);
				}
			}
		return encontrado;
	}
	static void mostrarOrdenado(List<DestinoTuristico> destinos) { 
		Collections.sort(destinos,Comparator.comparing(DestinoTuristico::getNombre));
		for (DestinoTuristico destinoTuristico : destinos) {
			System.out.println("Destino Turistico: "+destinoTuristico.getNombre());
		}
	}
	static void mostrarPaises(List <Pais> paises) {
		for (Pais pais : paises) {
			System.out.println(" PAIS : "+pais.getNombre()+ "\n CODIGO : "+pais.getCodigo());
		}
	}
	
	static void destinosPorPais(List<DestinoTuristico> destinos,String cod) {
		for(int i=0; i < destinos.size() ; i++) {
			if(cod.equals(destinos.get(i).getPais().getCodigo())) {
			System.out.println(" Pais : "+destinos.get(i).getPais().getNombre()+"\n Destino : "+destinos.get(i).getNombre());
				
			}
		}
	}

}
