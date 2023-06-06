package Clase_5;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        //Le pedimos al usuario que ingrese el precio original del producto
        System.out.println("Ingresa el precio original del producto: ");
        Scanner sc = new Scanner(System.in);
        double precioOriginal = sc.nextDouble();

        //Le pedimos al usuario que ingrese el porcentaje del descuento
        System.out.println("Ingresa el porcentaje a calcular: ");
        double porcentajeDescuento = sc.nextDouble();

        double precioFinal = precioOriginal -(precioOriginal * porcentajeDescuento / 100);

        System.out.println( "El precio final con descuento es: " + precioFinal);
    }
}