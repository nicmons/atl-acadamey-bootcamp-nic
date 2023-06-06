package Clase_5;


import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args) {
        //Le pedimos al usuario que ingrese el total de la cuenta de un restaurante
        System.out.println("Ingresa el total de la cuenta: ");
        Scanner sc = new Scanner(System.in);
        double totalCuenta = sc.nextDouble();

        //Le pedimos al usuario que ingrese el porcentaje de propina
        System.out.println("Ingresa el porcentaje de propina que desea dejar: ");
        double porcentajePropina = sc.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);

        System.out.println("El total de la propina es: " + propina);
    }
}