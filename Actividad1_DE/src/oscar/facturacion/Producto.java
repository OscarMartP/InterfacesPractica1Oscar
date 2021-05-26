package oscar.facturacion;

public class Producto {
	
	//VARIABLES
	private double importe;
	private String descripcion;
	private Impuesto tipoImpuesto;
	
	//CONSTRUCOR
	public Producto(double importe, String descripcion ,  Impuesto tipoImpuesto ) {
		super();
		this.importe = importe;
		this.descripcion = descripcion;
		this.tipoImpuesto = tipoImpuesto;
		}
	
	public double getImporte() {
		return importe;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	public Impuesto getTipoImpuesto() {
		return tipoImpuesto;
	}
	public void setTipoImpuesto(Impuesto tipoImpuesto) {
		this.tipoImpuesto = tipoImpuesto;
	}
	
	
	//VARIABLE ENUM
		public enum Impuesto {
			
		SUPERREDUCIDO(0.4) , REDUCIDO(0.1) , NORMAL(0.21);
		
		private Impuesto(double valorImpuesto) {
			
			this.valorImpuesto = valorImpuesto; 
			}
		private double valorImpuesto;

		public double getValorImpuesto() {
			return valorImpuesto;
		}
		public void setValorImpuesto(double valorImpuesto) {
			this.valorImpuesto = valorImpuesto;
		}
		
		}
		
	//TO STRING
	@Override
	public String toString() {
		return "Producto [importe=" + importe + ", descripcion=" + descripcion + "]";
	}
	
	//LLAMADA TO STRING
	public void mostrar()
	{
		System.out.println ("Producto: " + descripcion + " Importe: " + importe + "€ " + "Tipo de impuesto: " + tipoImpuesto );
	}
	
	
	
	
	
}