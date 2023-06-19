package Clase_10;

public class Main1 {

        public static void main(String[] args) {
            Persona titular = new Persona();
            titular.setNombre("Juan");

            Cuenta cuenta = new Cuenta();
            cuenta.setTitular(titular);
            cuenta.setCantidad(1000.0);

            cuenta.mostrar();

            cuenta.ingresar(500.0);
            cuenta.mostrar();

            cuenta.retirar(200.0);
            cuenta.mostrar();
        }
    }

