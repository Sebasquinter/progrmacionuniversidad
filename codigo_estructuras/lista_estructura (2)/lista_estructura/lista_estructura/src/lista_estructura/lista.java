package lista_estructura;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class lista {

   private nodo inicio;
   private int tamaño;
   
   public lista(){
       super();
   }

    public lista(nodo inicio, int tamaño) {
        this.inicio = inicio;
        this.tamaño = tamaño;
    }
   
   public boolean vacia(){
       return inicio == null;
   }
   public int gettamaño(){
       return tamaño;
       
   }
   public void agregaralfinal(int valor){
       nodo nuevo = new nodo();
       nuevo.setValor(valor);
       
       if(vacia()){
           inicio = nuevo;
           
       }else{
           nodo aux = inicio;
           while(aux.getSiguiente()!=null){
               aux=aux.getSiguiente();
           }
           aux.setSiguiente(nuevo);
       }
       
       tamaño++;
       
       
   }
   public void agregaralinicio(int valor){
       nodo nuevo = new nodo();
       nuevo.setValor(valor);
       if (vacia()) {
           
           inicio = nuevo;
           
           
       }else{
           nuevo.setSiguiente(inicio);
           
           inicio = nuevo;
       }
       tamaño++;
               
   }
   public void listar(){
        if (!vacia()) {
            nodo aux = inicio;
            int i = 0;
            while(aux != null){
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            }
        }
    } 
   public void eliminarPrimero() {
       if (vacia()){
           System.out.println("La lista esta vacia.");
           return;
       }
       inicio = inicio.getSiguiente();
       
       tamaño--;
   }
   
   public void eliminarUltimo() {
       if (vacia()){
           System.out.println("La lista esta vacia");
           return;
       }
       
       if (inicio.getSiguiente() == null) {
           inicio = null;
       } else {
           nodo nodo = inicio;
           nodo contador = null;
           
           while (nodo.getSiguiente() != null) {
               contador = nodo;
               nodo = nodo.getSiguiente();
           }
           
           contador.setSiguiente(null);
    
       }
       
       tamaño--;
   }

}


