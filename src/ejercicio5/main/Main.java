package ejercicio5.main;

import java.time.LocalDate;
import ejercicio5.model.Persona;

public class Main {
    public static void main(String[] args) {


        //Carga de datos
        Persona persona1 = new Persona();
        persona1.setDni("45976631");
        persona1.setNombre("Francisco");
        persona1.setFechaNac(LocalDate.of(2004, 9, 18));
        persona1.setProvincia("Jujuy");


        //constructor por defecto
        Persona persona2 = new Persona(
            "45123321",
            "José",
            LocalDate.of(2002, 10, 4),
            "Jujuy"
        );

        //constructor parametrizado
        Persona persona3 = new Persona(
            "23955446",
            "Camila",
            LocalDate.of(2010, 11, 9)
        );

        //constructor parametrizado
        persona1.mostrarDatos();
        System.out.println("------------");

        persona2.mostrarDatos();
        System.out.println("------------");

        persona3.mostrarDatos();
        System.out.println(persona3.mayorEdad());

    }

}

