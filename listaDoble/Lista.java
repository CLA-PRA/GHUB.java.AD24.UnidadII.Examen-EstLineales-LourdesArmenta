package listaDoble;

import java.util.ArrayList;
import java.util.List;

import java.util.HashSet;
import java.util.Set;


public class Lista <T>{
     //primer elemento de la lista
     private Nodo<T> cabeza;
     //total de elememtos
     private int tamanio;
     //constructor por defecto
     public Lista() {
         this.cabeza=null;
         this.tamanio=0;
 
     }
     //devuelve el tamaño de la lista
     public int getTamanio() {
         return tamanio;
     }
     public boolean esVacia(){
        
         return (cabeza==null);
 
     }
     /**
      * Agrega un nuevo nodo al final de la lista
      * @param valor
      */
     public void agregar(T valor){
         Nodo<T> nuevo = new Nodo<T>();
         nuevo.setValor(valor);
         if(esVacia()){
            cabeza = nuevo;
         }
         else{
             //Agregar al final de la lista
             Nodo<T> aux = cabeza;
             while (aux.getSiguiente() !=null){
                 aux = aux.getSiguiente();
             }
             aux.setSiguiente(nuevo);
             nuevo.setAnterior(aux);
 
         }
         tamanio++;
         
     }
 
     /**
      * inserta un nuevo nodo en la lista
      * @param valor a agregar
      * @param pos posicion donde se insertará el nodo
      */
     public void insertar(T valor, int pos) throws PosicionIlegalException{
         if(pos>=0 && pos<=tamanio){
             Nodo<T> nuevo = new Nodo<T>();
             nuevo.setValor(valor);
             //el nodo a insertar esta en el comienzo de la lista
             if (pos==0){
                 nuevo.setSiguiente(cabeza);
                 cabeza=nuevo;
             }else{
                 //insertar al final de la lista
                 if(pos == tamanio){
                     Nodo<T> aux = cabeza;
                     while (aux.getSiguiente() !=null){
                         aux = aux.getSiguiente();
                     }
                     aux.setSiguiente(nuevo);
                     nuevo.setAnterior(aux);
                 }
                 //inser en medio de la lista
                 else{
                     Nodo<T> aux = cabeza;
                     for(int i=0; i<=pos-2;i++){
                         aux = aux.getSiguiente();
                     }
                     Nodo<T> siguiente = aux.getSiguiente();
                     aux.setSiguiente(nuevo);
                     nuevo.setSiguiente(siguiente);
                     nuevo.setAnterior(aux);
                     siguiente.setAnterior(nuevo);
 
                 }
             }
             tamanio++; 
 
         } else {
             throw new PosicionIlegalException();
         }
 
     }
 
     public void remover(int pos) throws PosicionIlegalException{
         if(pos>=0 && pos<tamanio){
             if (pos==0){
                 //el nodo a eliminar esta en la primera posiciom
                 cabeza = cabeza.getSiguiente();
                 cabeza.setAnterior(null);
                 tamanio--;
             }
             else{
                 Nodo<T> aux = cabeza;
                 for (int i =0;i<=pos-2;i++){
                     aux = aux.getSiguiente();
                 }
                 Nodo<T> prox = aux.getSiguiente();
                 
                
                if (prox.getSiguiente() != null) {
                    
                    prox.getSiguiente().setAnterior(aux);
                }
                aux.setSiguiente(prox.getSiguiente());
                tamanio--;
 
             }
 
         }
         else{
             throw new PosicionIlegalException();
         }
     }

     public int removerPorValor(T valor){
        if (cabeza == null) {
            return -1; // Lista vacía
        }
    
        // Si el valor está en el primer nodo
        ;
    
        // Buscar el nodo con el valor
        
    
        // Si el valor no se encuentra regresa -1
        
    
        // Eliminar el nodo
        
        return indice; // Índice del nodo eliminado
    }

     
 
     public T getValor(int pos) throws PosicionIlegalException{
         if (pos>=0 && pos<tamanio){
             T valor;
             if(pos ==0){
                 valor = cabeza.getValor();
                 return valor;
 
             }else{
                 Nodo<T> aux = cabeza;
                 for(int i=0;i<=pos-1;i++){
                     aux = aux.getSiguiente();
                 }
                 valor = aux.getValor();
             }
             return valor;
 
         }
         else{
             throw new PosicionIlegalException();
         }
     }
 
     public void limpiar(){
         cabeza = null;
         tamanio = 0;
     }

     public List<T> getLista() {
        List<T> elementos = new ArrayList<>();
       //coloca código faltante
        return elementos;
    }

    public void podarLista(){
        

    }

    public void concatenarListas(Lista<T> otraLista){
        


    }

     
 

}
