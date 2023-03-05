package ClasesAnidadas;
import P6.Asignatura;
import P7.DepartamentoAnidado.ProfesorAnidado;

public class ManejadoraP7 {

    public static void main(String[] args) {

        //Creación del departamento.
        DepartamentoAnidado informatica = new DepartamentoAnidado("Informática", 5);

        // Creación de profesores
        ProfesorAnidado profesor1 = new ProfesorAnidado("Gabriela", "Pérez", new Asignatura[] {Asignatura.PROG, Asignatura.OFI}, informatica, "F");
        ProfesorAnidado profesor2 = new ProfesorAnidado("Alberto", "Seoane", new Asignatura[] {Asignatura.BBDD}, informatica,"M");
        ProfesorAnidado profesor3 = new ProfesorAnidado("Carlos", "González", new Asignatura[] {Asignatura.LMSGI, Asignatura.SISTO}, informatica,"M");

        // Añadimos los profesores al departamento de informática
        informatica.añadirProfesor(profesor1);
        informatica.añadirProfesor(profesor2);
        informatica.añadirProfesor(profesor3);

        // Mostramos el contenido del departamento de informática y de los profesores
        System.out.println(informatica);
        System.out.println("\n" + profesor1);
        System.out.println(profesor2);
        System.out.println(profesor3);
        System.out.println("-----------------------------------------------------");

    }
}