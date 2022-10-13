
package Logica;


public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    
    
    
    //implementacion de todos los metodos de pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("pikachu hace un ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("pikachu hace un ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("pikachu hace un ataque mordisco");
    }
    
    //implentacion de todos los metodos abstractos de la interf. Electro
    @Override
    public void atacarImpactTrueno() {
        System.out.println("pikachi hace un ataque de impacto trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("pikachu hace un ataque de punio de trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("pikachu hace un ataque de rayo");
    }

    @Override
    public void atacaRayoCarga() {
        System.out.println("pikachu hace un ataque de rayo cargado");
    }
}
