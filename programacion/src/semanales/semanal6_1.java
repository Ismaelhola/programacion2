/**
 * 
 */
package semanales;
import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class semanal6_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Scanner sct=new Scanner(System.in);
		
		int salir=0;
		
		do {
			String frase1;
			char[] letrasf1;
			int[] numerolr1;
			String frase2;
			char[] letrasf2;
			int[] numerolr2;
			int repetidas=0;
			int letrastotales=0;
			
			frase1=pedir(sct);
			frase2=pedir(sct);
			
			letrasf1=frase1.toCharArray();
			letrasf2=frase2.toCharArray();
			
			if(letrasf1.length==letrasf2.length) {
				numerolr1= new int[letrasf1.length];
				repetidos(letrasf1, numerolr1);
				eliminarrepetidos(letrasf1, numerolr1);
				numerolr2= new int[letrasf2.length];
				repetidos(letrasf2, numerolr2);
				eliminarrepetidos(letrasf2, numerolr2);
				
				for(int i=0; i<letrasf1.length; i++) {
					for(int j=0; j<letrasf2.length; j++) {
						if(numerolr1[i]!=0) {
							if(letrasf1[i]==letrasf2[j]&&numerolr1[i]==numerolr2[j]) {
								repetidas++;
							}
						}
					}
				}
				
				for(int i=0; i<letrasf1.length; i++) {
					if(numerolr1[i]!=0) {
						letrastotales++;
					}
				}
				
				if(repetidas==letrastotales) {
					System.out.println("Es un anagrama");
				}else {
					System.out.println("no es un anagrama");
				}
			}else {
				System.out.println("no es un anagrama");
			}
			do {
				System.out.println("quiere salir del programa");
				System.out.println("1.si 2.no");
				salir=scn.nextInt();
				if(salir!=1&&salir!=2) {
					System.out.println("no entendi tu respuesta lo puedes volver a escribir");
				}
			}while(salir!=1&&salir!=2);
			
		}while(salir!=1);
		
		System.out.println("hasta otra");
		
		scn.close();
		sct.close();
		
	}
	private static String pedir(Scanner sc) {
		boolean salir=false;
		String frase;
		
		do {
			System.out.println("Escribe una frase:");
			frase=sc.nextLine().replace(" ", "");
			
			if(frase.length()>1000) {
				System.out.println("Esta frase es muy grande escribe otra");
			}else {
				salir=true;
			}
		}while(salir!=true);
		
		return frase;
	}
	private static void repetidos(char[] letrasf, int[] numerolr) {
		for(int i=0; i<letrasf.length;i++){
			for(int j=0; j<letrasf.length; j++) {
				if(letrasf[j]==letrasf[i]) {
					numerolr[i]++;
				}
			}
		}
	}
	private static void eliminarrepetidos(char[] letrasf, int[] numerolr) {
		for(int i=0; i<letrasf.length; i++) {
			for(int j=0; j<letrasf.length; j++) {
				if(i!=j) {
					if(letrasf[i]==letrasf[j]) {
						for(int y=j; y<letrasf.length; y++) {
							if(y!=(letrasf.length-1)) {
								letrasf[y]=letrasf[y+1];
								numerolr[y]=numerolr[y+1];
							}else {
								letrasf[y]=0;
								numerolr[y]=0;
							}
						}
					}
				}
			}
		}
	}
}
