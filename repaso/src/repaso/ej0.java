/**
 * 
 */
package repaso;

import java.util.Scanner;

/**
 * @author USUARIO
 *
 */
public class ej0 {
	public static String calcular_letra (int dni)
    {
       final char letra_dni[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        int resto = dni%23;
       return String.valueOf(dni)+letra_dni[resto];
    }

	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
	}
	

}


