package Clase_7;
import java.util.Scanner;
public class Programa {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numeros = new int[5];

            // Ingresar los números
            System.out.println("Ingrese 5 números:");

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            // Mostrar los números ingresados
            System.out.println("\nLos números ingresados son:");
            for (int numero : numeros) {
                System.out.println(numero);
            }

            // Encontrar el número mayor y el número menor
            int maximo = numeros[0];
            int minimo = numeros[0];

            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > maximo) {
                    maximo = numeros[i];
                }
                if (numeros[i] < minimo) {
                    minimo = numeros[i];
                }
            }

            System.out.println("\nEl número mayor es: " + maximo);
            System.out.println("El número menor es: " + minimo);

            // Calcular el promedio
            int suma = 0;
            for (int numero : numeros) {
                suma += numero;
            }
            double promedio = (double) suma / numeros.length;

            System.out.println("\nEl promedio es: " + promedio);
        }
    }