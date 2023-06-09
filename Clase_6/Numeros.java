package Clase_6;

public class Numeros {

        public static void main(String[] args){
            String numeros = "Los numeros del 1 al 100 son: ";

            int contador= 0;

            while(contador<50){
                contador++;
                numeros+= "\n" + contador;
            }
            System.out.println(numeros);
        }
    }

