package Rares_Pila;
/**
 *
 * @author Rares-Andrei Ana
 */

//Clase ejecutable con casos de uso de la pila, donde se prueban varias posibilidades.
public class Main{
    public static void main(String[] args) {
        //Declaramos una variable "pila1" de tipo Pila.
        Pila pila1 = new Pila();
        
        //Añadimos datos a nuestra Pila, al ser de tipo genérico podemos añadir cualquier tipo de dato.
        pila1.apilar(200);
        pila1.apilar(13.2234);
        pila1.apilar(false);
        pila1.apilar('a');
        pila1.apilar("hola");
        
        pila1.imprimir();   //Mostramos la Pila.
        System.out.println("");
        System.out.println("Tenemos "+pila1.numeroElementos()+" elementos."); //Mostramos el número de elementos.
        System.out.println("Pila vacia? "+pila1.vacio());  //Mostramos si la Pila está vacía o no.
        System.out.println("---------------------------");
        //Desapilamos unos cuantos datos.
        pila1.desapilar();
        pila1.desapilar();
        pila1.desapilar();
        pila1.imprimir();   //Mostramos la Pila.
        System.out.println("");
        System.out.println(pila1.mirarCabeza()); //Mostramos cual es la caneza de la Pila.
        System.out.println("");
        System.out.println("Tenemos "+pila1.numeroElementos()+" elementos."); //Mostramos el número de elementos.
        System.out.println("---------------------------");
        //Desapilamos unos cuantos datos.
        pila1.desapilar();
        pila1.desapilar();
        pila1.imprimir();   //Mostramos la Pila (al no tener elementos no muestra nada).
        System.out.println("Tenemos "+pila1.numeroElementos()+" elementos."); //Mostramos el número de elementos.
        System.out.println("Pila vacia? "+pila1.vacio());     //Mostramos si la Pila está vacía o no.   
        System.out.println("---------------------------");
        
        //Declaramos una array "arrayPila" de tipo "Object", para usarla como ejemplo.
        Object [] arrayPila = {4,"hola","dos",12.345};
        //Declaramos una variable "pila2" de tipo Pila apartir de una array de tipo "Object".
        Pila pila2 = new Pila(arrayPila);
        pila2.imprimir();   //Mostramos la Pila.
        System.out.println("---------------------------");
        
        pila2.apilar("Nuevo dato");
        pila2.imprimir();   //Mostramos la Pila.
        System.out.println("");
        System.out.println("Tenemos "+pila2.numeroElementos()+" elementos."); //Mostramos el número de elementos.
        System.out.println("---------------------------");
        //Desapilamos unos cuantos datos.
        pila2.desapilar();
        pila2.desapilar();
        pila2.desapilar();
        pila2.imprimir();   //Mostramos la Pila.
        System.out.println("");
        System.out.println("Tenemos "+pila2.numeroElementos()+" elementos."); //Mostramos el número de elementos.
        System.out.println("Pila vacia? "+pila2.vacio());  //Mostramos si la Pila está vacía o no.
        System.out.println("---------------------------");
    }
}
