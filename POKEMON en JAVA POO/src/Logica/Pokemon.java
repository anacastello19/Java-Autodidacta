/*   Crear una clase  abstracta  llamada Pokemon, 
la cual posee los atributos: 
num_pokedex, nombrePokemon, pesoPokemon, sexo,temporadaQueAparece  y  tipo,  
e  implementa  métodos  para  los  ataques  comunes  que  suele tener    la    mayoría,    
entre    ellos    se    encuentran:    atacarPlacaje(),    atacarArañazo()    y atacarMordisco()*/
package Logica;
public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected  int temporada;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
}
