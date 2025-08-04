package listadoble_estructura;

class ListaEnlazadaDoble {
    private Nodo cabeza;
    private Nodo cola;
    private int tamaño;

    public ListaEnlazadaDoble() {
        this.cabeza = null;
        this.cola = null;
        this.tamaño = 0;
    }

    // Método para agregar un nodo al inicio de la lista
    public void agregarAlInicio(String valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
        tamaño++;
    }

    // Método para agregar un nodo al final de la lista
    public void agregarAlFinal(String valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cola == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.anterior = cola;
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
        tamaño++;
    }

    // Método para eliminar el primer nodo de la lista
    public void eliminarPrimero() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
        } else {
            cabeza = cabeza.siguiente;
            if (cabeza != null) {
                cabeza.anterior = null;
            } else {
                cola = null;
            }
            tamaño--;
        }
    }

    // Método para eliminar el último nodo de la lista
    public void eliminarUltimo() {
        if (cola == null) {
            System.out.println("La lista está vacía");
        } else {
            cola = cola.anterior;
            if (cola != null) {
                cola.siguiente = null;
            } else {
                cabeza = null;
            }
            tamaño--;
        }
    }

    // Método para visualizar la lista de principio a fin
    public void listarDePrincipioAFinal() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Método para visualizar la lista de fin a principio
    public void listarDeFinAPrincipio() {
        Nodo actual = cola;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }

    // Método para obtener el tamaño de la lista
    public int getTamaño() {
        return tamaño;
    }

    // Método para verificar si la lista está vacía
    public boolean vacia() {
        return cabeza == null;
    }
}

