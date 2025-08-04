
package pilas;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class pila {
    private nodo cima;
    private int tamaño;
    
    public pila(){
        this.cima = null;
        this.tamaño=0;
    }
    
    public void inicializar(){
        cima = null;
        tamaño = 0;
        System.out.println("la pila ha sido inicializada");
    }
    public int obtenerlongitud(){
        return tamaño;
    }
    public boolean esvacia(){
        return cima == null;
    }
    
    public void insertar(int dato){
       nodo nuevonodo = new nodo(dato);
       nuevonodo.siguiente = cima;
       cima = nuevonodo;
       tamaño++;
        System.out.println("elemento" + dato + "apilado.");
 
    }
    public void eliminar(){
        if (esvacia()) {
            System.out.println("la pila esta vacia.");
            
        }else{
            int dato = cima.dato;
            cima = cima.siguiente;
            tamaño--;
            System.out.println("elemento " + dato + "eliminado.");
        }
    }
    public void consultar(){
        if (esvacia()) {
            System.out.println("la pila esta vacia");
        }else{
            nodo actual= cima;
            System.out.println("elementos de la pila: ");
            while(actual != null){
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }
    public void mostrarcima(){
        if (esvacia()) {
            System.out.println("la pila esta vacia");
            
        }else{
            System.out.println("el elemnto en la cima es: " + cima.dato);
        }
    }

}
