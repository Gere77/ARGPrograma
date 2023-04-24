package paquete;

public class Revista extends Producto{
	
	public Revista() {
		super();		
	}
	
	public Revista(String t, int c, double p) {
		super(t, c, p);
	}

	public Revista(String t, String fp, String e, int c, double p) {
		super(t, fp, e, c, p);
	}

	public String toString() {
		return super.toString() + "revista " + this.getTitulo();
	}
}
