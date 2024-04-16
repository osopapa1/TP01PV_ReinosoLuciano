package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private float precio;
	private float descuento;
	
	public Producto () {
		super();
		System.out.println("Se ha generado un nuevo constructor 'Producto'");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = (float) precio;
	}
	
	public Float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = (float) descuento;
	}
	
	
	public Float calcularDescuento() {
		Float precioDes = precio - descuento;
		return precioDes;
	}
	
	public void mostrarDatos() {
		System.out.println("\n");
		System.out.println("Nombre del producto: " +nombre);
		System.out.println("Codigo del producto: " +codigo);
		System.out.println("precio del producto (Sin descuento): " +precio);
		System.out.println("Precio del producto (Con descuneto): " +calcularDescuento());
	}
	
	
	
	}
