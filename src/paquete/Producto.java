package paquete;

public abstract class Producto {
	
	private String titulo;
	private String fechaPublicacion;
	private String editor;
	private int codigo;
	private double precio;
	private static final Double minPrecio = 0.1;
	
	public Producto() {	
		this.titulo = "";
		this.fechaPublicacion = "";
		this.editor = "";
		this.codigo = 00;
		this.precio = minPrecio;
	}
	
	public Producto(String t, int c, double p) {
		this.titulo = t;
		this.codigo = c;
		this.precio = p;
	}
	
	public Producto(String t, String fp, String e, int c, double p) {
		this.titulo = t;
		this.fechaPublicacion = fp;
		this.editor = e;
		this.codigo = c;
		this.precio = p;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return "Producto ";
	}
}
