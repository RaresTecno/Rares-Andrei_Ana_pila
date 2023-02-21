
package Rares_Pila;

/**
 *
 * @author WEB1-02
 */
public class Pila <E>{
    private int numElementos = 0;
    private Nodo <E> cabeza = null;
    
    public Pila(){
        //Esto es una prueba
    }
    public Pila(E [] array){ //Para crear una pila ya con objetos
        
    }
    public void apilar(E dato){
//        Nodo <E> nuevoNodo = new Nodo<>(dato);
        
        numElementos++;
    }
    
    public void desApilar(){
        
    }
    public int numeroElementos(){
        return numElementos;
    }
    public E vacio(){
        
    }
    public void imprimir(){
        
    }
    public E mirarCabeza(){
        if(numElementos == 0){
            System.out.println("La pila está vacía");
            return null;
        }
        return cabeza.getDato();
    }
}
