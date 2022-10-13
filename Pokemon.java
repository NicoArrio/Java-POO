
package Logica;

public abstract class Pokemon {
    
    //---es abstracto xq no tiene aplicacion---
    
    //ATRIBUTOS
    //solo las hijas tienen acceso
    protected int numPokedex;
    protected String Nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    /*
    todos los pokemon que usemos van
    a tener estas caracteristicas 
    bases y heredarlas.
    */
    
    //METODOS
    //solo las hijas tienen acceso
   
    protected abstract void atacarPlacaje();
    
    protected abstract void atacarAraniazo();
    
    protected abstract void atacarMordisco();
    /*
    camelcase:arranca con minuscula y 
    la primera palabra con mayuscula y
    tbien tiene el verbo en infinitivo
    */
    
}
