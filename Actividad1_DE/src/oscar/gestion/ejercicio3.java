package oscar.gestion;
import java.util.*;
import oscar.facturacion.*;
import oscar.facturacion.Producto.Impuesto;



public class ejercicio3 {
		
	//VARIABLES
	static Producto producto;
	static Factura factura;
	static Impuesto impuestos;
	static Date fechaRealizacion = new Date();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIABLES DE LAS LISTAS
		List <Producto> productos = new ArrayList<>();
		List <Producto> productosBorrador; 
		List <Factura> facturas = new ArrayList<>();
		
		//CREANDO PRODUCTOS
		producto = new Producto(0.75 , "Leche" , impuestos = Impuesto.REDUCIDO);
		productos.add(producto);
		
		producto = new Producto(0.50 , "Pan" , impuestos = Impuesto.SUPERREDUCIDO);
		productos.add(producto);
		
		producto = new Producto(8.99 , "Salmon", impuestos = Impuesto.REDUCIDO);
		productos.add(producto);
		
		producto = new Producto(2.95 , "Aguacates", impuestos = Impuesto.NORMAL);
		productos.add(producto);
		
		producto = new Producto(1.20 , "Friegasuelos", impuestos = Impuesto.NORMAL);
		productos.add(producto);
		
		producto = new Producto(0.56 , "Cerveza", impuestos = Impuesto.NORMAL);
		productos.add(producto);
		
		producto = new Producto(1.45 , "Sandia", impuestos = Impuesto.SUPERREDUCIDO);
		productos.add(producto);
		
		//CRACION 5 FACTURAS
		factura = new Factura(1 , productos, new Date());
		factura = new Factura(2 , productos, new Date());
		factura = new Factura(3 , productos, new Date());
		factura = new Factura(4 , productos, new Date());
		factura = new Factura(5 , productos, new Date()); 
		factura.mostrar();
	}
}
		
		