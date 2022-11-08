
package ClaseAbstracta;

public class Circulo implements Figura, Dibujable, Rotable {
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, double x, double y) {
        this.radio = radio;
    }
    
    

    @Override
    public double calcularArea() {
        double pi =3.1416;
        double rdo= pi*radio*radio;
        return rdo;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un circulo");
      }

    @Override
    public double rotar() {
        System.out.println("Hola, estoy rotando un Circulo");
        return 0;
    }
    
}

    
    

