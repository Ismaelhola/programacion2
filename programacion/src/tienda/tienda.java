/**
 * 
 */
package tienda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ismael m
 *
 */
public class tienda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		Scanner sct= new Scanner(System.in);
		
		int opcion= 0;
		Carrito carro= new Carrito();
		ArrayList<Articulo>catalogo= new ArrayList<Articulo>();
		
		inicializarcatalogo(catalogo);		
		
		do {
			System.out.println("1. Alta articulo");
			System.out.println("2. Comprar");
			System.out.println("3. Confirmar compra");
			System.out.println("0. salir");
			System.out.println("¿Cual es tu opcion?");
			opcion= scn.nextInt();
			
			switch(opcion) {
				case 0:
					System.out.println("Muchas gracias por su compra");
					break;
				case 1:
					meterarticulocatalogo(catalogo, scn, sct);
					mostrarcatalogo(catalogo);
					break;
				case 2:
					break;
				case 3:
					break;
				default:
					System.out.println("Esta opcion no existe escribe otra");
					break;
			}
		}while(opcion!=0);

	}
	private static void inicializarcatalogo(ArrayList<Articulo> c) {
		c.add(new Articulo("0001", "Monitor", 200.00F, 10));
		c.add(new Articulo("0002", "Teclado", 10.00F, 100));
		c.add(new Articulo("0003", "RJ45 2M", 4.50F, 50));
		c.add(new Articulo("0004", "Raton", 20.00F, 15));
	}
	
	private static void meterarticulocatalogo(ArrayList<Articulo> c, Scanner scn, Scanner sct) {
		String codigo;
		String nombre;
		float precio;
		int stock;
		System.out.println("Introduce el codigo:");
		codigo=sct.nextLine();
		System.out.println("Introduce el nombre:");
		nombre=sct.nextLine();
		System.out.println("Introduce el precio");
		precio=scn.nextFloat();
		System.out.println("Introduce el stock");
		stock=scn.nextInt();
		c.add(new Articulo(codigo, nombre, precio, stock));
	}
	
	private static void mostrarcatalogo(ArrayList<Articulo>c) {
		for(Articulo a: c) {
			System.out.println(a);
		}
	}
	
	private static void comprar(ArrayList<Articulo>c, Carrito ca, Scanner sct, Scanner scn) {
		String codigo;
		int cantidad;
		int salir=0;
		Articulo meter=new Articulo();
		
		mostrarcatalogo(c);
		do {
			System.out.println("¿Que articulo quieres comprar?");
			System.out.println("Escribe el codigo del articulo:");
			codigo=sct.nextLine();
			for(int i=0; i<c.size(); i++) {
				if(c.get(i).getcodigo().equals(codigo)) {
					salir++;
					meter=c.get(i);
				}
			}
			if(salir!=1) {
				System.out.println("no existe ese articulo coje otro");
			}
		}while(salir!=1);
		System.out.println("¿Que cantidad quieres?");
		cantidad=scn.nextInt();
		
		ca.meterarticulo(meter, cantidad);
		
	}
	
	private static void confirmarcarrito() {
		
	}

}
