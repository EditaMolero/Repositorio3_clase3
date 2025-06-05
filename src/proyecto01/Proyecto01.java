
package proyecto01;

import java.util.Scanner;
public class Proyecto01 {

    public static void main(String[] args) {
        // DECLARE VARIABLE
        double num1,num2,suma,promedio;
        
        Scanner lectura = new Scanner (System.in);
        
        //entrada de datos
        
        System.out.print("INGRESA NUMERO 1: ");
        num1=lectura.nextDouble();
        
        System.out.print("INGRESA NUMERO 2: ");
        num2=lectura.nextDouble();
        
        //proceso
        
        suma= (num1+ num2);
        promedio = (suma / 2);
        
        
        //Salida
        System.out.println("LA SUMA ES: "+suma);
        System.out.println("EL PROMEDIO ES: "+promedio);
        
    }
    
}
