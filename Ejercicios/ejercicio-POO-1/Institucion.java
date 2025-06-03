import java.util.ArrayList;
import java.util.List;

public class Institucion{

    public static void main(String[] args) {

        System.out.println("Probandoo \n ");

        System.out.println("Persona: \n");
        Persona personita = new Persona(
                "Carlos",
                "Santana",
                "20123456",
                45,
                "Calle Falsa 123",
                "351-1111111");
        personita.mostrarInformacion();
        personita.saludar();


        System.out.println("\nEstudiante: \n");
        Estudiante estudiante1 = new Estudiante(
                "Lucas",
                "Romo",
                "40123456",
                20,
                "Tamarindos 456",
                "355598555",
                "A001",
                "Programación II",
                8.75
        );
        estudiante1.mostrarInformacion();
        estudiante1.estudiar();

        System.out.println("\nModificado:\n");
        estudiante1.setPromedio(9.10);
        System.out.println("Nuevo promedio de " + estudiante1.getNombre() + ": " + estudiante1.getPromedio());
        estudiante1.mostrarInformacion();


        System.out.println("\nProfesor:\n");
        Profesor profesor1 = new Profesor(
                "Raul",
                "Gonzales",
                "AA98",
                20,
                "Cordoba",
                "35678987",
                "Segundo piso",
                35600,
                3
        );
        profesor1.mostrarInformacion();
        profesor1.enseñar();


        System.out.println("\nEmpleado:\n");
        EmpleadoAdministrativo empleado1 = new EmpleadoAdministrativo(
                "Ramoncin",
                "Flores",
                "AB08",
                45,
                "Atenas 86",
                "3541786325",
                "Contador",
                "De 8AM a 4PM",
                1200000
        );
        empleado1.mostrarInformacion();
        empleado1.administrar();


        List<Persona> listapersonas = new ArrayList<>();

        listapersonas.add(personita);
        listapersonas.add(estudiante1);
        listapersonas.add(profesor1);
        listapersonas.add(empleado1);

        System.out.println("\nMostrando array:\n");

        for (Persona p : listapersonas){
            System.out.println("\n----------------------------------------");
            p.mostrarInformacion();
            System.out.println("\n");
        }


    }
}