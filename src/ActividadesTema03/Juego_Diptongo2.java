package ActividadesTema03;

/**
 * Programa que te diga cuantos DIPTONGOS hay en una frase
 * Diptongo combinación de vocales en la misma sílaba
 * @author David
 */
import java.util.Scanner;

public class Juego_Diptongo2 {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String n;
        System.out.print("Escriba una frase: ");
        n = teclado.nextLine();
        
        int diptongos = 0;
        //Recorre toda la frase para comprobar si hay alguna opcion (diptongo)
        for(int i=0; i<n.length(); i++){
            //Ponemos todos los diptongos posibles
            //.indexOf devuelve un numero por lo que,
            //(n.indexOf) es mayor q -1 significa que hay diptongo
            if(n.contains("ai")){
                diptongos++;
            }
            else if(n.contains("ei")){
                diptongos++;
            }
            else if (n.contains("eu")) {
                diptongos++;
            }
            else if (n.contains("oi")) {
                diptongos++;
            }
            else if (n.contains("ou")) {
                diptongos++;
            }
            else if (n.contains("ia")) {
                diptongos++;
            }
            else if (n.contains("ie")) {
                diptongos++;
            }
            else if (n.contains("io")) {
                diptongos++;
            }
            else if (n.contains("iu")) {
                diptongos++;
            }
            else if (n.contains("ua")) {
                diptongos++;
            }
            else if (n.contains("ue")) {
                diptongos++;
            }
            else if (n.contains("ui")) {
                diptongos++;
            }
            else if (n.contains("uo")) {
                diptongos++;
            }//Fin if
            
        }//Fin for
        
        System.out.println("Diptongos: "+diptongos);
        //////////////Muestra los diptongos
        if (diptongos > 0) {
            System.out.println("La palabra: " + n + " es un DIPTONGO");
        } else {
            System.out.println("La palabra: " + n + " NO es un diptongo");
        }
        
    }//Fin main
    
}//Fin class
