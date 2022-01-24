/**
 * 
 */
package repaso;
import java.util.Scanner;
/**
 * @author USUARIO
 * Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolverá el DNI completo.. Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23, el resultado debe de
 * estar entre 0 y 22. Haz un método que le pases el número del DNI sin la letra y devuelva la letra, teniendo en cuenta las siguientes equivalencias. 
 */
public class ej1 {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce DNI sin letra");
		int dni = sc.nextInt();
		
		System.out.printf("El DNI es " +ej0.calcular_letra(dni) );
		
	}

}
