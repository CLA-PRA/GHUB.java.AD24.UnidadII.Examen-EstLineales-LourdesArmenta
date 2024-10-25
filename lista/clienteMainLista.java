package lista;

public class clienteMainLista {
    public static void main(String[] args) {
        try{
            Lista<Integer> lista = new Lista<Integer>();
            //agregar elementos a la lista
            lista.agregar(12);
            lista.agregar(13);
            lista.agregar(20);
            //imprimir los elementos agregados
            System.out.println("Dato en la posicion 0:"+lista.getValor(0));
            System.out.println("Dato en la posicion 1:"+lista.getValor(1));
            System.out.println("Dato en la posicion 2:"+lista.getValor(2));
            //insertar
            lista.insertar(15, 2);
            //insertar
            lista.insertar(16,3);
             //imprimir los elementos agregados
             System.out.println("Dato en la posicion 0:"+lista.getValor(0));
             System.out.println("Dato en la posicion 1:"+lista.getValor(1));
             System.out.println("Dato en la posicion 2:"+lista.getValor(2));
             System.out.println("Dato en la posicion 3:"+lista.getValor(3));
             System.out.println("Dato en la posicion 4:"+lista.getValor(4));

             //lista.insertar(16,10); //lanza una exception porque es una posicion incorrecta

             lista.remover(0);
             lista.remover(3);
             //verificar los datos despues de la eliminacion
             /* 
             System.out.println("Dato en la posicion 0:"+lista.getValor(0));
             System.out.println("Dato en la posicion 1:"+lista.getValor(1));
             System.out.println("Dato en la posicion 2:"+lista.getValor(2));
             */
            for (int i=0 ; i<lista.getTamanio();i++){
                System.out.println("Dato en la posicion "+i+": "+lista.getValor(i));
            }

            



        }
        catch (PosicionIlegalException e){
            e.printStackTrace();
            
        }

    }

}
