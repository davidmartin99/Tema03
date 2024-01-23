package tema3;
/**
 * introduces nºpreguntas y aciertos
 * calcular la nota de tipo test y que diga suspenso suficiente...
 * ahora cada 2 errores restan 1 aciertos
 * @author David
 */
import java.util.Scanner;

public class Ejemplo02_Ifc {
    public static void main(String[] args) {
    //zona de variables
    double nota=0 ;
    double preguntas, aciertos;
    double errores;
    String resultado=" ";
    
    //Zona de iniciación de datos
    Scanner teclado = new Scanner(System.in);
    System.out.print("Escriba cuantas preguntas tiene el test: ");
    preguntas = teclado.nextInt();
    System.out.print("Ahora introduzca los aciertos: ");
    aciertos = teclado.nextInt();

    
    //Calcular la nota
    if(aciertos<=preguntas){
        errores = preguntas - aciertos;
        nota = ((aciertos - (errores/2)) *10) / preguntas;
        System.out.printf("Tu nota es: %.2f\n",nota);
    }
    else{
        System.out.print("ERROR, los aciertos no pueden ser mas que las preguntas");
        System.exit(0);
    }
    
    //Zona de procesamiento
    if(nota<=5){
        resultado="SUSPENSO";
    }
    if(nota>5){
        resultado="SUFICIENTE";
    }
    if(nota>6){
        resultado="BIEN";
    }
    if(nota>7){
        resultado="NOTABLE";
    }
    if(nota>9){
        resultado="SOBRESALIENTE";
    }
  
    //Zona de salida
    System.out.println("El resultado es: "+resultado);
    }
}

