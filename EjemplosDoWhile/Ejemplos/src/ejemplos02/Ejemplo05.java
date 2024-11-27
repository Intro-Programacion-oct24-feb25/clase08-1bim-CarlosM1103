/*
 Este programa genera el resultado de
 4 elevado a la potencia 3
 Donde número = 4 y potencia = 3

 Agregar los cambios necesarios para que tanto número y potencia 
 sean ingresados por teclado por el usuario.
 */

package ejemplos02;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // 2. numero, i[0, n]
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        System.out.println("Ingrese la potencia");
        int potencia = leer.nextInt();
        int resultado;
   
        resultado = 1;

        int contador = 1;

        do {
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}
