package Clase_6;
import java.util.Scanner;

public class Twiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingresa el nombre de un famoso");
        String famoso = scanner.next();

        String urlGenerado = generadorCelebridad(famoso);
        System.out.println("aca esta el  para ver el perfil de  twitter del famoso que escogiste: " + urlGenerado);
    }


    public static String generadorCelebridad(String celebridad){
        String celebridadIngresada = celebridad;
        String generadorUrl = "https://twitter.com/search?q=" + celebridadIngresada;

        return generadorUrl;
    }

}