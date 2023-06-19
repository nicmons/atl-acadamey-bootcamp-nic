package Clase_10;
import java.time.LocalDate;
public class Persona {

    private int id;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    private String dni;

    // Constructor
    public Persona() {
        this.id = 0;
        this.nombre = "";
        this.edad = 0;
        this.fechaNacimiento = null;
        this.dni = "";
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    // Método mostrar()
    public void mostrar() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("DNI: " + dni);
    }

    // Método esMayorDeEdad()
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}