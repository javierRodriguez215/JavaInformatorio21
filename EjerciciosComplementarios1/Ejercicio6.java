package Introduccion.EjerciciosComplementarios1;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        int base;
        int potencia;
        int resultado= 1;
        System.out.println("Ingrese base: ");
        base= scan.nextInt();
        System.out.println("potencia número: ");
        potencia= scan.nextInt();

        for(int i=1; i<=potencia; i++){
             resultado *= base;
        }
        System.out.print("El resultado es: "+resultado);
    }
}
