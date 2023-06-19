package Clase_10;

public class Cuenta {
        private Persona titular;
        private double cantidad;

        // Constructor
        public Cuenta() {
            this.titular = new Persona();
            this.cantidad = 0.0;
        }

        // Setters
        public void setTitular(Persona titular) {
            this.titular = titular;
        }

        // Getter del titular
        public Persona getTitular() {
            return titular;
        }

        // Getter y setter de la cantidad
        public double getCantidad() {
            return cantidad;
        }

        public void setCantidad(double cantidad) {
            this.cantidad = cantidad;
        }

        // Método mostrar()
        public void mostrar() {
            System.out.println("Titular: " + titular.getNombre());
            System.out.println("Cantidad: " + cantidad);
        }

        // Método ingresar()
        public void ingresar(double cantidad) {
            if (cantidad > 0) {
                this.cantidad += cantidad;
            }
        }

        // Método retirar()
        public void retirar(double cantidad) {
            this.cantidad -= cantidad;
        }
    }