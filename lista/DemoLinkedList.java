package lista;
import java.util.LinkedList;
import java.util.Collections;

public class DemoLinkedList {
    public static void imprimir(LinkedList<Persona> lista){
        for (Persona p : lista){
            System.out.println(p+" - ");

        }
        System.out.println();

    }
    public static void main(String[] args) {
        LinkedList<Persona> lista = new LinkedList<>();
        lista.add(new Persona(1,"Juan",18));
        lista.add(new Persona(2,"Maria",20));   
        lista.add(new Persona(4,"Luis",14));
        lista.add(new Persona(3,"Filiberto",15));

        Persona p1 = new Persona(5,"Lorena",20);
        lista.add(p1);

        imprimir(lista);

        lista.remove(0);
        lista.remove(p1);

        imprimir(lista);

        System.out.println("La cantidad de elementos de la lista "+lista.size());

        p1 = lista.get(1);

        System.out.println("el elemento que se encuentra en la posicion 1 es "+p1.getNombre());

        //busco un elemento,para que esto funcione debemos sobrecargar los métodos equals y hashCode de persona
        //en este caso lo busco por id de persona

        Persona persona = new Persona(3,"Filiberto",15);

        if(lista.contains(persona))
           System.out.println("Este es el elememento buscado "+p1);
        else
            System.out.println("Elemento no encontrado");

        //para que esto funcione, debemos implementar Persona como Comparable
        //y sobreescribir el método CompareTo

        Collections.sort(lista);

        imprimir(lista);


        lista.clear();

        if(lista.isEmpty()){
            System.out.println("La lista esta vacia ");
        }

        





        
    }
    
}
