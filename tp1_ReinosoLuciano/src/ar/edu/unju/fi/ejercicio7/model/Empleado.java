package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private String legajo;
	private Double salario;
	private int SalMinimo = 210000, aumento = 20000;
	
	public Empleado (String nombre, String legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario < SalMinimo) {
			this.salario = (double) SalMinimo;
			System.out.println("\nSu salario ha sido actualizado");
		}
		else this.salario = salario;
	}
	
	public Double aumentoSalario () {
		salario = salario + aumento;
		System.out.println("\nUsted ha recibido un aumento de sueldo");
		return salario;
	}

	public void mostrarDatos() {
		System.out.println("\n");
		System.out.println("Nombre del empleado: " +nombre);
		System.out.println("Legajo: " +legajo);
		System.out.println("Salario: " +salario);
	}
}
