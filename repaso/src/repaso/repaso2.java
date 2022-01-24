/**
 * 
 */
package repaso;
import java.util.Scanner;
import com.usuario.matrices.Matrices;


/**
 * @author USUARIO
 *Desarrollar un programa en el que se pida al usuario una matriz de 
dimensiones N ×M, y compruebe si la matriz es dispersa. (Todos las filas y todas 
las columnas contienen al menos un elemento nulo).
 */
public class repaso2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("¿Cuántas filas quieres?: ");
		int filas =sc.nextInt();
		
		System.out.println("¿Cuántas columnas quieres?: ");
		int columnas =sc.nextInt();
		
		int matriz[][]= new int [filas] [columnas];
		System.out.println("Introduce la matriz");
		Matrices.pedir_matriz(matriz);
		
		System.out.println("Tu matriz es: ");
		Matrices.mostrar_matriz(matriz);
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; i<matriz[0].length; j++) {
				if (matriz[i][j]!=0)
					System.out.println("La matriz no es dispersa");
				
			}
				
		}
					
			}
		}
		



