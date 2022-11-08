package Logica;

public class OOP {

    public static void main(String[] args) {

        Alumno al1 = new Alumno();// Alulmno vacia, la usaremos para crear metodos
        Alumno al2 = new Alumno(320, "Ana", "Castello");

        System.out.println("La id del alumno 2 es: " + al2.getId());
        System.out.println("El nombre es: " + al2.getNombre());
        System.out.println("El apellido es: " + al2.getApellido());

        al1.setId(565564);
        al1.setNombre("Ani");
        al1.setApellido("Previde");
        System.out.println("------------------------------");
        System.out.println("La id del alumno 1 es: " + al1.getId());
        System.out.println("El nombre es: " + al1.getNombre());
        System.out.println("El apellido es: " + al1.getApellido());
//Aca cambio el valor del ID del alumno 2
        System.out.println("------------------------------");
        al2.setId(20);
        System.out.println("La id del alumno 2 es: " + al2.getId());
        System.out.println("El nombre es: " + al2.getNombre());
        System.out.println("El apellido es: " + al2.getApellido());

    }
}
