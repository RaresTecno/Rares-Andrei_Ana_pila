
package Rares_Pila;

/**
 *
 * @author Rares-Andrei Ana
 */
public class Nodo <E>{
    private E dato;
    private Nodo puntero;
    
    public Nodo (E dato){
        this.dato = dato;
        puntero = null;             
    }
    public E getDato(){
        return this.dato;
    }
    
    public Nodo getPuntero(){
        return this.puntero;
    }
    
    public void setPuntero(Nodo puntero){
        this.puntero = puntero;
    }
    
}
