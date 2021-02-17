/**
 * 
 */
package tienda;

/**
 * @author Ismael m
 *
 */
public class Articulocarrito {
	Articulo elemento;
	int cantidad;
	
	public Articulocarrito() {
		
	}
	
	public Articulocarrito(Articulo e, int c) {
		elemento=e;
		cantidad=c;
	}
	
	@Override
	public String toString() {
		return elemento.sinstock()+" x "+cantidad+"\n";
	}

}
