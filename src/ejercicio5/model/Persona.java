package ejercicio5.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    //atributos
    private String dni;
    private String nombre;
    private LocalDate fechaNac;
    private String provincia;

    //calcular la edad
    public int calcularEdad() {
        return Period.between(fechaNac, LocalDate.now()). getYears();
    }

    //para saber si es mayor de 18 años
    public boolean mayorEdad() {
        return calcularEdad() >= 18;
    }
    
    //Mostrar los datos de la persona
    public void mostrarDatos(){
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNac);
        System.out.println("Provincia: " + provincia);
        System.out.println("Edad: " + calcularEdad() + " años");
        
        if (mayorEdad()) {
        System.out.println("La persona es mayor de edad");
     } else {
        System.out.println("La persona no es mayor de edad");
     }
    }

    // Constructor por defecto
    public Persona() {
    }

    //constructor parametrizado
    public Persona(String dni, String nombre, LocalDate fechaNac, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.provincia = provincia;
    }

    //constructor parametrizado con atributo
    public Persona(String dni, String nombre, LocalDate fechaNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.provincia = "Jujuy";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

}  
