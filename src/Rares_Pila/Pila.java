
package Rares_Pila;

/**
 *
 * @author WEB1-02
 */
public class Pila <E>{
    private int numElementos = 0;
    private Nodo cabeza = null;
    
    public Pila(){
        
    }
    public Pila(E [] array){ //Para crear una pila ya con objetos
        
    }
    public void apilar(E dato){
        
        numElementos++;
    }
    
    public void desapilar(){
        
        numElementos--;
    }
    public int numeroElementos(){
        return numElementos;
    }
    public E vacio(){
        
    }
    public void imprimir(E [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println();
        }
    }
    public Nodo mirarCabeza(){
        
        return this.cabeza;
    }
}
