package Clase_6;
import java.util.Scanner;
public class Llamadaenwhatsapp {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor digita un numero de telefono mas indicativo de pais");
            String numeroTel = scanner.next();

            String urlGenerado = generadorCelebridad(numeroTel);
            System.out.println("Por medio de este link ,puedes llamar al numero que dijitaste anteriormente: " + urlGenerado);
        }

        public static String generadorCelebridad(String telefono){
            return "https://api.whatsapp.com/send?phone=" + telefono;
        }
    }

