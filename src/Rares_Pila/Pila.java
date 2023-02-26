package Rares_Pila;
/**
 *
 * @author Rares-Andrei Ana
 */

//Clase genérica Pila, para evitar crear más clases Pila en caso de querer usar otro tipo de dato.
public class Pila <E>{
    //Declaramos una variable "numElementos" de tipo entero, será el número de elementos que tengamos.
    private int numElementos = 0;
    //Declaramos una variable "cabeza" de tipo Nodo, será el siguiente elemento a extraer.
    private Nodo <E> cabeza = null;
    
    //Constructor vacío de la clase Pila.
    public Pila(){
        
    }
    //Constructor de la clase Pila que exige una array de tipo genérico.
    public Pila(E [] array){
        //Recorremos la Array exigida.
        for (int i = 0; i < array.length; i++) {
            //Por cada posición de la Array añadimos sus datos uno a uno en nuestra Pila.
            apilar(array[i]);
        }
    }
    
    //Método para añadir Nodos, que exige un parámetro "dato" de tipo genérico.
    public void apilar(E dato){
        //Declaramos una variable "nodo" de tipo Nodo, que almacena el parámetro exigido.
        Nodo nodo = new Nodo(dato);
        //Asignamos a "nodo" la última posición (Puntero de cabeza).
        nodo.setPuntero(cabeza);
        //Establecemos que "nodo" es nuestra nueva "cabeza".
        cabeza = nodo;
        //Incrementamos en uno el valor de "numElementos".
        numElementos++;
    }
    
    //Método para retirar nuestro ultimo Nodo.
    public E desapilar(){
        //Declaramos una variable "nodo" de tipo Nodo, que almacena "cabeza".
        Nodo <E> nodo = cabeza;
        //Aignamos la posición de "cabeza" al siguiente, es decir a "null".
        cabeza = cabeza.getPuntero();
        //Reducimos en uno el valor de "numElementos".
        numElementos--;
        //Devolvemos nodo (el dato que estuvise en cabeza).
        return nodo.getDato();
        
    }
    
    //Método para devolver el número de elemnos de la Pila.
    public int numeroElementos(){
        //Devolvemos "numElementos".
        return numElementos;
    }
    //Método para comprobar que haya 0 elementos.
    public boolean vacio(){
        //En caso de que "numElementos" sea igual a 0 devolvemos un booleano "true".
        if(numElementos == 0){
            //Salimos del método devolviendo un true.
            return true;
        }
        //En caso de nunca entrar en el "if" devolveremos un booleano "false".
        return false;
    }
    //Método para imprimir la Pila.
    public void imprimir(){
        //Declaramos una variable "nodo" de tipo Nodo, que almacena "cabeza".
        Nodo <E> nodo = cabeza;
        //Recorremos toda la Pila.
        for(int i = 0; i < numElementos; i++){
            //Mostramos por consola el Nodo indicado.
            System.out.println(nodo.getDato());
            //Apuntamos el puntero al siguiente Nodo.
            nodo = nodo.getPuntero();
        }
    }
    //Método para mirar la "cabeza" de la Pila.
    public E mirarCabeza(){
        //Devolvemos el dato de "cabeza".
        return cabeza.getDato();
    }
}
