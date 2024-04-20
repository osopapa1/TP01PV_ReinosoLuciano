package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNac;
	private String nacionalidad;
	private float estatura;
	private float peso;
	private String posicion;
	
	public Jugador() {
	}
	
	
	public Jugador(String nombre, String apellido, LocalDate fechaDeNac, String nacionalidad, float estatura,
			float peso, String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNac = fechaDeNac;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaDeNac() {
		return fechaDeNac;
	}

	public void setFechaDeNac(LocalDate fechaDeNac) {
		this.fechaDeNac = fechaDeNac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public void mostrarDatos() {
		System.out.println("Ingrese Nombre del Jugador : "+this.nombre);
		System.out.println("Ingrese Apellido del Jugador : "+this.apellido);
		System.out.println("Ingrese Fecha de Nacimiento del Jugador : "+this.fechaDeNac);
		System.out.println("Ingrese Nacionalidad del Jugador : "+this.nacionalidad);
		System.out.println("Ingrese Estatura del Jugador : "+this.estatura);
		System.out.println("Ingrese Peso del Jugador : "+this.peso);
		System.out.println("Ingrese Posicion del Jugador : "+this.posicion);

	}
	
}
