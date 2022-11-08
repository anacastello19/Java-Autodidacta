package Encapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {
        Alumno al= new Alumno();
        Alumno al2= new Alumno(12, "Pepa", "Pig");
        
        System.out.println("id: "+al2.getId());
        System.out.println("Nombre: "+ al2.getNombre());
        System.out.println("Apellido: "+ al2.getApellido());
    }
}
