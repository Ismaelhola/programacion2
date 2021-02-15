/**
 * 
 */
package tienda;
import java.util.ArrayList;

/**
 * @author Ismael m
 *
 */
public class Carrito {
	ArrayList<Articulocarrito>pedido;
	float total;
	boolean confirmado;
	
	public static boolean CONFIRMADO=true;
	public static boolean PENDIENTE=false;
	
	public Carrito() {
		pedido= new ArrayList<Articulocarrito>();
		total=0;
		confirmado=PENDIENTE;
	}
	
	private float calculatotal() {
		float resultado=0;
		for(Articulocarrito a: pedido) {
			resultado=resultado+(a.elemento.getprecio()*a.cantidad);
		}
		return resultado;
	}

}
