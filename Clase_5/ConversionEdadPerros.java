package Clase_5;
import java.util.Scanner;

public class ConversionEdadPerros {
    public static void main(String[] args) {
        //Le pedimos al usuario que nos diga  la edad de su perro
        System.out.println("Ingresa la edad de tu perro");
        Scanner sc = new Scanner(System.in);
        Integer edad = sc.nextInt();

        Integer edadReal = edad * 7;

        System.out.println( "La edad real de tu perro es: " + edadReal);
    }
}
