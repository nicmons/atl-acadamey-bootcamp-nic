package Clase_6;

import java.util.Scanner;
public class Eligetumisterio {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Eres un gran explorador en busca de un tesoro legendario oculto en una antigua selva amazonica. Tendrás que tomar decisiones cruciales para no morir en la selva. ¿Estás listo para la aventura?");
            System.out.println("Capítulo 1: El gran misterio\n" +
                    "\n" +
                    "Te encuentras frente un rio caudaloso. A tu izquierda, ves  un callejon que contiene un gran arcoiris al fondo. ¿Qué camino escoges?\n" +
                    "\n" +
                    "1 -Entras en el rio caudaloso para cruzar y tratar de seguir.\n" +
                    "2 -Sigues el camino en el que se observa el arcoiris al fondo.");

            System.out.print("Escribe 1 o 2 para hacer tu elección: ");
            String camino = scanner.next();

            if (camino.equals("2")){

                System.out.println("Al seguir por el camino te encuentras con grandes animales salvajes y serpientes ¿Qué haras?\n" +
                        "\n" +
                        "1 -Intentas pegarles con un palo que te encuentras.\n" +
                        "2 -Intentas pasar con cuidado y en silencio para que no te ataquen.");

                System.out.print("Escribe 1 o 2 para hacer tu elección: ");
                String camino_1 = scanner.next();

                if (camino_1.equals("1")){
                    System.out.println("Al intentar pegarles le diste a unos pero una serpiente te muerde en las manos");
                }
                if (camino_1.equals("2")){
                    System.out.println("Lograste escapar pero mas adelante te encuentras con unas personas que dicen querer ayudarte ");
                }
            }

            if (camino.equals("2")){
                System.out.println("Estas personas te ayudan y cargan en sus brazos , se alejan para subirsen en un barco te dicen que los esperes?\n" +
                        "\n" +
                        "1 -Decides seguir a las personas que te cargan en los brazos.\n" +
                        "2 -Decides seguir solo mirando haccia el horizonte");

                System.out.print("Escribe 1 o 2 para hacer tu elección: ");
                String camino_2 = scanner.next();

                if (camino_2.equals("1")){
                    System.out.println("las personas logran rescarte y salvarte");
                }
                if (camino_2.equals("2")){
                    System.out.println("Te quedas sin energia y te mueres de sed , hambre y la mordedura  de la serpiente ");
                }

            }


        }
    }
