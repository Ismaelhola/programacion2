/**
 * 
 */
package semanales;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class semanal6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Scanner sct=new Scanner(System.in);
		
		int salir = 0;
		
		do {
			String frase1 = " ";
			String frase2 = " ";
			int salida = 0;
			char[] charf1;
			char[] charf2;
			int contador1[];
			int contador2[];
			int contador3=0;
			int contador4=0;
			int contador5=0;
			int contador6=0;
			
			
			frase1=pedir(frase1,salida,sct);
			salida=0;
			frase2=pedir(frase2,salida,sct);
			
			charf1=frase1.toCharArray();
			contador5=numeroletras(charf1,contador5);
			charf2=frase2.toCharArray();
			contador6=numeroletras(charf2,contador6);
			
			if(contador5==contador6) {
				
				contador1= new int [charf1.length];
				repeticiones(charf1,contador1);
				
				contador2= new int [charf2.length];
				repeticiones(charf2,contador2);
				
				eliminacionrepetidos(charf1, contador1);
				
				eliminacionrepetidos(charf2, contador2);
				
				for(int i=0; i<charf2.length; i++) {
					for(int j=0; j<charf2.length; j++) {
						if(contador1[i]!=0) {
							if(charf1[i]==charf2[j]&&contador1[i]==contador2[j]) {
								contador3++;
							}
						}
					}
				}
				
				for(int i=0; i<charf1.length; i++) {
					if(contador1[i]!=0) {
						contador4++;
					}
				}
				
				if(contador3==contador4) {
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
	private static String pedir(String frase, int salida, Scanner entrada) {
		
		int contador=0;

        do {
        	System.out.println("Escribe una frase:");
        	do {
        		contador++;
        	}while(contador!=1);
            frase=entrada.nextLine().replace(" ","");

            if(frase.length()>1000){
                System.out.println("Esta frase es muy grande escribe otra");
            }else {
                salida=1;
            }

        }while(salida!=1);

        return frase;
    }
	private static int numeroletras(char[] charf, int contador) {
		for(int i=0; i<charf.length; i++) {
			contador++;
		}
		return contador;
	}
	private static void repeticiones(char[] charf, int[] contador) {
		for(int i=0; i<charf.length;i++){
			for(int j=0; j<charf.length; j++) {
				if(charf[j]==charf[i]) {
					contador[i]++;
				}
			}
		}
	}
	private static void eliminacionrepetidos(char[] charf, int[] contador) {
		for(int i=0; i<charf.length; i++) {
			for(int j=0; j<charf.length; j++) {
				if(i!=j) {
					if(charf[i]==charf[j]) {
						for(int y=j; y<charf.length; y++) {
							if(y!=(charf.length-1)) {
								charf[y]=charf[y+1];
								contador[y]=contador[y+1];
							}else {
								charf[y]=0;
								contador[y]=0;
							}
						}
					}
				}
			}
		}
	}

}
