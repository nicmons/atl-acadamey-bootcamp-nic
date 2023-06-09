package Clase_6;
import java.util.Scanner;
public class SistemadeUbicacion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Porfavor ingresa el nombre de tu pais");
        String pais = scanner.next();
        String paisGenerado= generadorUrlPais(pais);

        System.out.println("aca tienes el link para ver tu pais: " + paisGenerado);
    }
    public static String generadorUrlPais(String paisIngresado){
        String pais = paisIngresado;
        String urlPais = "https://www.google.com/maps/search/" + pais;

        return urlPais;
    }
}
