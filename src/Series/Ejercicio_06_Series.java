package Series;

/**
 * Programa donde el usuario introduzca un numero 
 *  y lo imprima desde el 1 hasta el numero 
 *  cada numero se imprimira el numero de veces que su propio valor
 *  Ejemplo: Introduce: 5
 *  Imprime: 1, 2,2, 3,3,3, 4,4,4,4, 5,5,5,5,5...
 * @author alumno
 */

import java.util.Scanner;

public class Ejercicio_06_Series {
    public static void series01(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
                if (j < i - 1) {
                    System.out.print(",");
                }
            }//Fin if
            if (i < num) {
                System.out.print(";");
            }//Fin for 2
        }//Fin for 1
    }
    
    public static void main(String[] args){
        //Entrada de Datos
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introuce un numero: ");
        int num = teclado.nextInt();
        series01(num);
        
    }//Fin MAIN
    
}//Fin CLASS
