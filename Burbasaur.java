
package Logica;


public class Burbasaur extends Pokemon implements IPlanta{

    public Burbasaur() {
    }

    //implementacion de todos los metodos de pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Burbasaur hace un ataque de placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Burbasaur hace un ataque de araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Burbasaur hace un ataque de mordisco");
    }

    @Override
    public void ataqueImpactDrenaje() {
        System.out.println("Burbasaur hace un ataque de drenaje");
    }
    
    
    //implentacion de todos los metodos abstractos de la interf. Planta
    @Override
    public void atacarParalizar() {
        System.out.println("Burbasaur hace un ataque de paralizar");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Burbasaur hace un ataque de hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Burbasaur hace un ataque de latigo de cepa");
    }


    
}
