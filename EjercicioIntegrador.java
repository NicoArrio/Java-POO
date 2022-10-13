
package Logica;


public class EjercicioIntegrador {

    public static void main(String[] args) {
        
        //creacion de pokemons en forma de objetos
        Squirtle squir = new Squirtle();
        Charmander charma = new Charmander();
        Burbasaur bulb = new Burbasaur();
        Pikachu pika = new Pikachu();
        
        //demostracion de juego
        squir.atacarAraniazo();
        pika.atacarImpactTrueno();
        bulb.atacarParalizar();
        charma.atacarLanzaLlama();
        //cada uno hace su ataque a su manera
    }
    
}
