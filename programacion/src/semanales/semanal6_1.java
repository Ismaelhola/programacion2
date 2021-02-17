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
			
			frase1=pedir(sct);
			frase2=pedir(sct);
			
			letrasf1=frase1.toCharArray();
			letrasf2=frase2.toCharArray();
			
			if(letrasf1==letrasf2) {
				numerolr1= new int[letrasf1.length];
				repetidos(letrasf1, numerolr1);
				numerolr2= new int[letrasf2.length];
				repetidos(letrasf2, numerolr2);
			}else {
				System.out.println("no es un anagrama");
			}
			
		}while(salir!=1);
		
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
	private static void 

}
