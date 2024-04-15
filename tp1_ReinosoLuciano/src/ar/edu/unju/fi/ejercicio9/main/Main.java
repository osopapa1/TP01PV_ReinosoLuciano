package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Producto[] producto = new Producto[3];
		Scanner scanner = new Scanner(System.in);
		String nombre, codigo;
		float precio, descuento;
		
		for(int i=0;i<3;i++) {
			descuento = -1;
			producto[i] = new Producto();
			System.out.println("\nIngrese nombre del producto "+(i+1)+": ");
				nombre = scanner.nextLine();
			System.out.println("Ingrese codigo del producto "+(i+1)+": ");
				codigo = scanner.nextLine();
			System.out.println("Ingrese precio del producto "+(i+1)+": ");
				precio = scanner.nextFloat();
				scanner.nextLine();
			while(descuento<0 || descuento>50) {
				System.out.println("Ingrese descuento del producto "+(i+1)+"(Debe ser un valor entre 0 y 50): ");
					descuento = scanner.nextFloat();
					scanner.nextLine();
			}
			producto[i].setNombre(nombre);
			producto[i].setCodigo(codigo);
			producto[i].setPrecio(precio);
			producto[i].setDescuento(descuento);
		}
		for(int i=0;i<3;i++) {
			producto[i].mostrarDatos();
		}
		
		scanner.close();
		
	}

}

