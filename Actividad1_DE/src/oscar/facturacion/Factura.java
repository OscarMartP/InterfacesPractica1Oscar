package oscar.facturacion;

import java.util.*;

public class Factura {

	//VARIABLES
	private int numero;
	private List<Producto> productos;
	private Date fechaRealizacionFactura;
	
	//CONSTRUCTOR
	public Factura(int numero, List<Producto> productos , Date fechaRealizacion) {
		super();
		this.numero = numero;
		this.productos = productos;
		this.fechaRealizacionFactura = fechaRealizacion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	public Date getFechaRealizacion() {
		return fechaRealizacionFactura;
	}

	public void setFechaRealizacion(Date fechaRealizacion) {
		this.fechaRealizacionFactura = fechaRealizacion;
	}
	
	
	//TO STRING
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", productos=" + productos + "]";
	}
	
	//LLAMADA TO STRING
	public void mostrar()
	{
		for (Producto a:productos)
		{
			a.mostrar();
		}
	}

}
