package Clase_5;
import java.util.Scanner;
public class MillasaKilometros {
    public static void main(String[] args) {
        //Le solicitamos a nuestro usuario que ingrese la distancia en millas
        System.out.println("Ingresa la distancia en millas");
        Scanner sc = new Scanner(System.in);
        double millas = sc.nextDouble();

        double kilometros = millas * 1.60934;

        System.out.println( "El total en Kilometros (KM) es: " + kilometros);
    }
}

