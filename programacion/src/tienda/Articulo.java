/**
 * 
 */
package tienda;

/**
 * @author Ismael m
 *
 */
public class Articulo {
	private String codigo;
	private String nombre;
	private float precio;
	private int stock;
	
	public Articulo(){
		
	}
	
	public Articulo(String c, String n, float p, int s) {
		setcodigo(c);
		setnombre(n);
		setprecio(p);
		setstock(s);
	}
	
	public String getcodigo() {
		return codigo;
	}
	public String getnombre() {
		return nombre;
	}
	public float getprecio() {
		return precio;
	}
	public int getstock() {
		return stock;
	}
	
	public void setcodigo(String c) {
		codigo=c;
	}
	public void setnombre(String n) {
		nombre=n;
	}
	public void setprecio(float p) {
		precio=p;
	}
	public void setstock(int s) {
		stock=s;
	}
	
	@Override
	public String toString() {
		return "Codigo: "+codigo+"\nNombre: "+nombre+"\nPrecio: "+precio+"\nStock: "+stock;
	}
	
	public boolean disponible(int cantidad) {
		return cantidad<stock;
	}

}
