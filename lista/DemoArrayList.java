package lista;
import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        //agregar elementos a la lista
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        System.out.println("ArrayList: "+colores);

        //recorrer la estructura atraves de iteradores

        for(String aux:colores){
            System.out.println("Elemento :"+aux);
        }

        for(int i=0;i<colores.size();i++){
            System.out.println("Valo del elemento "+i+": "+colores.get(i));
        }

        //remover elementos a través de su posición en la lista
        String color = colores.remove(1);

        System.out.println("Elemento removido: "+color);

        System.out.println("ArrayList: "+colores);

       //remover elementos a través del contennido del elemento

        colores.remove("azul");

        System.out.println("ArrayList: "+colores);

        colores.add("amarillo");
        //agregar un elemento en una posición determminada
        colores.add(0,"Purpura");
        //modificar el contenido de un elementos
        colores.set(1,"Amarillo");

        //imptimir los elementos despues de las modificaciones
        System.out.println("ArrayList: "+colores);

        colores.set(2,"Amarillo");

        System.out.println("ArrayList: "+colores);

        //consulto un elemento a traves de su posición
        color = colores.get(0);

        System.out.println("Elemento consultado :"+color);

        //color = colores.get(3); //esto lanza una exception de fuera de borde porque la posición no existe

        //System.out.println("Elemento consultado :"+color);

        System.out.println("Tamaño de la estructura = "+colores.size());

        //Ordena los elementos de la colección
        

        Collections.sort(colores);

        for(String i:colores){

            System.out.println(i);
        }


        

    }
    
}
