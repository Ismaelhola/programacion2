/**
 * 
 */
package Actividad25;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class actividad25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sct = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		
		Playlist primera;
		int opcion=0;
		
		System.out.println("¿Cual es el nombre de tu playlist?");
		primera=new Playlist(sct.nextLine());
		
		do {
			opcion=menu(scn);
			
			switch(opcion) {
			case 0:
				System.out.println("Un placer haver creado la playlist "+primera.nombre);
				System.out.println("Hasta luego");
				break;
			case 1:
				primera(scn,sct,primera);
				break;
			case 2:
				segunda(primera);
				break;
			case 3:
				tercera(scn, sct, primera);
				break;
			case 4:
				cuarta(primera);
				break;
			case 5:
				quinta(primera);
				break;
			case 6:
				sexta(primera);
				break;
			case 7:
				septima(scn, primera);
				break;
			case 8:
				octava(primera);
				break;
			case 9:
				novena(scn, primera);
				break;
			case 10:
				decima(sct, primera);
				break;
			}
		}while(opcion!=0);

	}
	private static int menu(Scanner sc){
		int opcion;
		
		System.out.println("Estas con las opciones que puedes elegir");
        System.out.println("1. Añadir cancion");
        System.out.println("2. Cuantas canciones tienes");
        System.out.println("3. Encontrar cancion");
        System.out.println("4. Mostrar las canciones de la playlist");
        System.out.println("5. Mostrar la duracion de la playlist");
        System.out.println("6. Reproducir toda la playlist");
        System.out.println("7. Reproducir una cancion de la playlist");
        System.out.println("8. Limpiar la playlist");
        System.out.println("9. Eliminar una cancion de la playlist");
        System.out.println("10. Encontrar toda las canciones de un artista");
        System.out.println("0. Salir");
        System.out.println("¿Cual es tu opcion?");
		opcion = sc.nextInt();
		
		return opcion;
	}
	private static void mostrarplaylist(Playlist a) {
		for (Cancion c: a.canciones) {
			System.out.println(c.toString()+".");
		}
	}
	private static void reproducirplaylist(Playlist a) {
		for(int i = 0; i<a.canciones.size() ;i++) {
			System.out.println(a.reproducirCancion(i));
		}
	}
	private static void primera(Scanner scn, Scanner sct, Playlist a) {
		String titulo;
		String artista;
		int duracion;
		
		System.out.println("Has seleccionado la opcion de introducir canciones: ");
		System.out.println("Introduzca el titulo de la cancion: ");
		titulo = sct.nextLine();
		System.out.println("Introduzca el artista de la cancion: ");
		artista = sct.nextLine();
		System.out.println("Introduzca el duracion de la cancion: ");
		duracion = scn.nextInt();
		
		a.anyadirCancion(titulo, artista, duracion);
	}
	private static void segunda(Playlist a) {
		System.out.println("Tienes "+a.obtieneTotalCanciones()+" en la playlist");
	}
	private static void tercera(Scanner scn, Scanner sct, Playlist a) {
		int opcion;
		int numero;
		String titulo;
		
		System.out.println("Estas son las opciones que tienes");
		System.out.println("1. por posicion");
		System.out.println("2. por titulo");
		System.out.println("¿Que opcion vas a elegir?");
		opcion=scn.nextInt();
		if(opcion==1) {
			System.out.println("¿Cual es la posicion?");
			numero=scn.nextInt();
			System.out.println(a.obtieneCancion(numero-1).toString());
		}else {
			System.out.println("¿Cual es el titulo de la cancion?");
			titulo=sct.nextLine();
			System.out.println(a.encontrarCancionPorTitulo(titulo).toString());
		}
	}
	private static void cuarta(Playlist a) {
		System.out.println("Has seleccionado la opcion de mostrar todas las canciones de la playlist:");
		System.out.println("Estas son todas la canciones: ");
		mostrarplaylist(a);
	}
	private static void quinta(Playlist a) {
		System.out.println("Has seleccionado la opcion de saber el total de la duracion de la playlist.");
		System.out.println("Esta es la duracion de la playlist: " + a.totalDuracionPlaylist()+" minutos");
	}
	private static void sexta(Playlist a) {
		System.out.println("Has seleccionado la opcion reproducir toda la playlist, ahora se reproducira: ");
			if(a.canciones.size() >0) {
				reproducirplaylist(a);
			}else {
				System.out.println("La playlist no tiene canciones.");
			}
	}
	private static void septima(Scanner sc, Playlist a) {
		int posicion;
		
		System.out.println("Has seleccionado la opcion de reproducir un cancion, "
				+ "introduce la posicion para reproducirla: ");
				posicion = sc.nextInt();
				System.out.println("Esta es la cancion: "+ a.reproducirCancion(posicion-1));
	}
	private static void octava(Playlist a) {
		System.out.println("Has seleccionado la opcion de limpiar la playlist: ");
		System.out.println("Se limpiara la playlist.");
		a.limpiarPlaylist();
	}
	private static void novena(Scanner sc, Playlist a) {
		int posicion;
		
		System.out.println("Has seleccionado la opcion de eliminar una cancion, para ello necesito la posicion de la cancion: ");
		posicion = sc.nextInt();
		a.eliminarCancion(posicion-1);
		System.out.println("La cancion se ha borrado.");
	}
	private static void decima(Scanner sc, Playlist a) {
		String artista;
		
		System.out.println("Has seleccionado buscar las canciones del artista, introduzca el artista del que quiere buscar las canciones: ");
		artista = sc.nextLine();
		System.out.println("Estas son las canciones del artista elegido:");
		for (Cancion c: a.encontrarCancionesPorArtista(artista)) {
			System.out.println(c.toString());
		}
	}

}
