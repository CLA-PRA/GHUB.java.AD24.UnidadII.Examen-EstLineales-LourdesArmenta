package lista;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;


public class ClienteMainList {
    public static void main(String[] args) {
        try{
            List<Integer> lista = new LinkedList<Integer>();
            List<Integer> lista2 = new ArrayList<Integer>();
            //agregar tres elementos a la lista
            lista.add(12);
            lista.add(15);
            lista.add(20);

            System.out.println("Dato que se encuentra en la posicion 0: "+lista.get(0));
            System.out.println("Dato que se encuentra en la posicion 1: "+lista.get(1));
            System.out.println("Dato que se encuentra en la posicion 2: "+lista.get(2));

            lista.add(1,13);
            lista.add(3,16);

            //mostrar los elementos despues de las inseciones
            System.out.println("Dato que se encuentra en la posicion 0: "+lista.get(0));
            System.out.println("Dato que se encuentra en la posicion 1: "+lista.get(1));
            System.out.println("Dato que se encuentra en la posicion 2: "+lista.get(2));
            System.out.println("Dato que se encuentra en la posicion 3: "+lista.get(3));
            System.out.println("Dato que se encuentra en la posicion 4: "+lista.get(4));

            System.out.println();

            for(int i=0;i<lista.size();i++){
                System.out.println("Dato que se encuentra en la posicion "+i+": "+lista.get(i));
            }

            //remover elementos
            lista.remove(0);
            lista.remove(3);

            //mostrar los elementos despues de la eliminacion
            System.out.println("Dato que se encuentra en la posicion 0: "+lista.get(0));
            System.out.println("Dato que se encuentra en la posicion 1: "+lista.get(1));
            System.out.println("Dato que se encuentra en la posicion 2: "+lista.get(2));

            //ahora utilizamos el ArrayList
            lista2.add(10);
            lista2.add(15);
            lista2.add(24);

            for(int i=0;i<lista2.size();i++){
                System.out.println("Dato que se encuentra en la posicion "+i+": "+lista2.get(i));
            }

            //Itera para imprimit cada uno de los elementos
            for(Integer aux:lista2){
                System.out.println("Elemento "+aux);
            }


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
