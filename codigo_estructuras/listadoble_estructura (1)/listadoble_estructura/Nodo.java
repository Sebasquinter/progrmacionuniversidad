package listadoble_estructura;

class Nodo {
    String valor;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(String valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }
}