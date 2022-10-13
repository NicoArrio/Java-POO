
package Logica;

public interface IElectrico {
    
    //Recordatorio: no va la implementacion del metodo xq es abstracto
    
    //ciertos metodos (ataques) que otros (elementos) no van a tener 
    public void atacarImpactTrueno();
    public void atacarPunioTrueno();
    public void atacarRayo();
    public void atacaRayoCarga();
}
