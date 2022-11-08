
package ClaseAbstracta;

public class Cuadrado implements Figura, Dibujable{

    private double lado;
    
    public Cuadrado(){
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado, double x, double y) {
        this.lado = lado;
    }
    
    
    @Override
    public double calcularArea() {
        double rdo = lado * lado;
        return rdo;
 
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un cuadrado");
    }   
}
