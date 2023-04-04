package Logica;
public class EjercicioIntegrador {
    
    public static void main(String[] args) {
        Squirtle squi= new Squirtle();
        Charmander charman= new Charmander();
        Bulbasaur bulba= new Bulbasaur();
        Pikachu pika= new Pikachu();
        
        squi.atacarAraniazo();
        squi.atacarHidrobomba();
        charman.atacarAscusas();
        charman.atacarPunioFuego();
        bulba.atacarDrenaje();
        bulba.atacarParalizar();
        pika.atacarPunioTrueno();
        pika.atacarRayoCarga();
        
    }
}
