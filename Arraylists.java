
package arraylists;

//implementacion de paquetes
import java.util.ArrayList;
import java.util.List;

public class Arraylists {

    public static void main(String[] args) {
        
        //inicializamos una lista tipo de arraylist
        /*
        ArrayList: una posicion dinamica de memoria.
        En este caso,guarda personas.
        () referencia a q va a ser una construccion de 
        un nuevo arraylist.
        */
        List<Persona> lista = new ArrayList<Persona> ();
        //metodo para agregar algo nuevo
        //llamamos al constructor con para. de pers.
        lista.add(new Persona(1,"pedro",28));
        lista.add(new Persona(2,"lucas",22));
        lista.add(new Persona(3,"nico",25));
        
        System.out.println("---------FOR---------");
        //recorremos por indice con el bucle for
        for (int i=0;i<lista.size();i++){
            System.out.println("prueba:"+ lista.get(i).getNombre());
            /*de esta lista traeme el elemento que este en el indice 
            donde este parado, y de ese indice traeme el nombre.
            */
        }
        
        System.out.println("---------FOREACH---------");
        //recorro elemento x elemento foreach(significa por cada)
        for(Persona perso:lista){
            System.out.println("Prueba: "+ perso.getNombre());
        /*
        por cada persona(variable auxiliar perso) que este 
        dentro de mi lista, como ya tenemos a la persona
        (perso), directamente traemos el nombre
        */
        }
    }
    
}
