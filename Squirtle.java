
package Logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
    

    //implementacion de todos los metodos de pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle hace un ataque de placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle hace un ataque de araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle hace un ataque de mordisco");
    }
    
    //implentacion de todos los metodos abstractos de la interf. Agua
    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle hace un ataque de hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle hace un ataque de burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle hace un ataque de pistola de agua");
    }
    
    
}
