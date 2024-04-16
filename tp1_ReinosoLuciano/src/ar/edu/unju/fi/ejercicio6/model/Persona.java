package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaDeNac;
	private String provincia;
	
	public Persona () {
		System.out.println("Se genero un nuevo constructor 'Persona'");
	}
	
	public Persona (String dni, LocalDate fechaDeNac, String nombre, String provincia) {
		this.dni = dni;
		this.fechaDeNac = fechaDeNac;
		this.nombre = nombre;
		this.provincia = provincia;
	}
	
	public Persona (String dni, LocalDate fechaDeNac, String nombre) {
		this.dni = dni;
		this.fechaDeNac = fechaDeNac;
		this.nombre = nombre;
		this.provincia = "Jujuy";
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNac() {
		return fechaDeNac;
	}
	public void setFechaDeNac(LocalDate fechaDeNac) {
		this.fechaDeNac = fechaDeNac;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int calcularEdad() {
	    LocalDate fechaActual = LocalDate.now();
	    return Period.between(fechaDeNac, fechaActual).getYears();
	}

	public boolean esMayorEdad() {
	    return calcularEdad() >= 18;
	}
	
	public void mostrarDatos() {
	    System.out.println("DNI: " + dni);
	    System.out.println("Nombre: " + nombre);
	    System.out.println("Fecha de Nacimiento: " + fechaDeNac);
	    System.out.println("Provincia: " + provincia);
	    System.out.println("Edad: " + calcularEdad());
	    if (esMayorEdad()) {
	        System.out.println("La persona es mayor de edad");
	    } else {
	        System.out.println("La persona no es mayor de edad");
	    }
	}


	
	
	}

