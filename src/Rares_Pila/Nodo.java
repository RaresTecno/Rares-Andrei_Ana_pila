package Rares_Pila;
/**
 *
 * @author Rares-Andrei Ana
 */

//Clase genérica Nodo, para evitar crear más clases Nodo en caso de querer usar otro tipo de dato.
public class Nodo <E>{ 
    //Declaramos una variable "dato" de tipo genérico(en este caso E), será la información guardada de nuestro Nodo.
    private E dato;
    //Declaramos una variable "puntero" de tipo Nodo, será la posición de nuestro Nodo.
    private Nodo puntero;
    
    //Constructor de la clase Nodo que exige un parámetro "dato" de tipo genérico.
    public Nodo (E dato){
        //Asignamos el parámetro exigido a la variable "dato" de nuestra clase.
        this.dato = dato;          
    }
    
    //Getter de la variable "dato".
    public E getDato(){
        //Devolvemos la variable "dato" de nuestra clase.
        return this.dato;
    }
    //Getter de la variable "puntero".
    public Nodo getPuntero(){
        //Devolvemos la variable "puntero" de nuestra clase.
        return this.puntero;
    }
    
    //Setter de la variable "puntero" que exige un parámetro "puntero" de tipo Nodo.
    public void setPuntero(Nodo puntero){
        //Asignamos el parámetro exigido a la variable "puntero" de nuestra clase.
        this.puntero = puntero;
    }   
}
