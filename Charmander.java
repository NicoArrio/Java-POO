
package Logica;


public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    //implementacion de todos los metodos de pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander hace un ataque de placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander hace un ataque de araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander hace un ataque de mordisco");
    }

    //implentacion de todos los metodos abstractos de la interf. Fuego
    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander hace un ataque de fuego");
    }

    @Override
    public void atacarLanzaLlama() {
        System.out.println("Charmander hace un ataque de lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander hace un ataque de ascuas");
    }
    
}
