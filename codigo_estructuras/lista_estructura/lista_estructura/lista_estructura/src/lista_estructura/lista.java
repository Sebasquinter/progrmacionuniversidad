package lista_estructura;


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
   
   // Método auxiliar para validar si una cadena es un número entero
   private boolean esNumeroEntero(String valor) {
       try {
           Integer.parseInt(valor);
           return true;
       } catch (NumberFormatException e) {
           return false;
       }
   }
   
   public void agregaralfinal(String valor){
       if (esNumeroEntero(valor)) {
           agregaralfinal(Integer.parseInt(valor));
       } else {
           System.out.println("Error: Debe ingresar un número entero.");
       }
   }
   
   private void agregaralfinal(int valor){
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
   
   public void agregaralinicio(String valor){
       if (esNumeroEntero(valor)) {
           agregaralinicio(Integer.parseInt(valor));
       } else {
           System.out.println("Error: Debe ingresar un número entero.");
       }
   }
   
   private void agregaralinicio(int valor){
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