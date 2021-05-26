package oscar.gestion;
import java.util.*;
import oscar.facturacion.*;

//DECLARACION DE VARIABLES
public class ejercicio1 {
		
	static Producto producto;
	static Factura factura;
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ARRAY DE PRODUCTOS
		List <Producto> productos = new ArrayList<>();
		
		//ANADIENDO PRODUCTOS
		producto = new Producto(0.75 , "Leche", null);
		productos.add(producto);
		
		producto = new Producto(0.50 , "Pan" , null);
		productos.add(producto);
		
		producto = new Producto(8.99 , "Salmon" , null);
		productos.add(producto);
		
		producto = new Producto(2.95 , "Aguacates" , null);
		productos.add(producto);
		
		producto = new Producto(1.20 , "Friegasuelos" , null);
		productos.add(producto);
		
		producto = new Producto(0.56 , "Cerveza" , null);
		productos.add(producto);
		
		producto = new Producto(1.45 , "Sandia" , null);
		productos.add(producto);
		
		//GENERANDO FACTURA
		factura = new Factura(0 , productos , null); 
		//MOSTRAR FACTURA
		factura.mostrar();
		
			
	}
	
		
		
		
		

	}


