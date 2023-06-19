package Clase_10;
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setId(1);
        persona1.setNombre("Juan");
        persona1.setEdad(25);
        persona1.setFechaNacimiento(LocalDate.of(1998, 5, 15));
        persona1.setDni("12345678");

        persona1.mostrar();

        if (persona1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }
    }
}
