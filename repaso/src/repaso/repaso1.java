/**
 * 
 */
package repaso;
import java.util.Scanner;
import com.usuario.*;

/**
 * @author USUARIO
 *Desarrollar un programa en el que se pida al usuario un vector de 
  números enteros e indique en pantalla cuantos de dichos elementos son números 
  impares
 */
public class repaso1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		Scanner entrada = new Scanner(System.in);
		
		int tam;
		System.out.println("¿Cuantos elementos quieres? ");
		tam = entrada.nextInt();
		
		int vector [] = new int[tam];
		System.out.println("introduce los datos");
		ej0.pedir_vector(vector);
		
		int contador=0;
		
		for (int i=0; i<vector.length; i++) {
			if (vector[i]%2!=0)
				contador++;
		}
		System.out.printf("Hay %d números impares ", contador);
		
		System.out.println("tu vector es ");
		
		ej0.mostrar_vector(vector); 
		
		
		
}
}