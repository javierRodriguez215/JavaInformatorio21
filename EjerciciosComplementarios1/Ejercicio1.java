package Introduccion.EjerciciosComplementarios1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        String user;
        System.out.println("Ingrese nombre de usuario");
        user =  scan.nextLine();
        System.out.println("Hola "+user);
    }
}
