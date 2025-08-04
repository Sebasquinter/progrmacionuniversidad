package metodosordenamiento;

import java.util.LinkedList;
import java.util.Random;

public class ListaEnlazada {
    private nodo cabeza;
    private long tiempoIntercambio;
    private long tiempoSeleccion;
    private long tiempoInsercion;
    private long tiempoShell;
    private long tiempoQuickSort;

    public ListaEnlazada() {
        cabeza = null;
    }

    public void agregar(int dato) {
        nodo nuevo = new nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void generarNumerosAleatorios(int cantidad) {
        cabeza = null;
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            agregar(random.nextInt(100)); // Números aleatorios entre 0 y 99
        }
        System.out.print("Lista generada: ");
        imprimir();
    }

    public void imprimir() {
        nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void ordenarPorIntercambio() {
        if (cabeza == null) return;
        nodo actual = cabeza;
        while (actual != null) {
            nodo siguiente = actual.siguiente;
            while (siguiente != null) {
                if (actual.dato > siguiente.dato) {
                    int temp = actual.dato;
                    actual.dato = siguiente.dato;
                    siguiente.dato = temp;
                }
                siguiente = siguiente.siguiente;
            }
            actual = actual.siguiente;
        }
    }

    public void ordenarPorSeleccion() {
        for (nodo nodo1 = cabeza; nodo1 != null; nodo1 = nodo1.siguiente) {
            nodo min = nodo1;
            for (nodo nodo2 = nodo1.siguiente; nodo2 != null; nodo2 = nodo2.siguiente) {
                if (nodo2.dato < min.dato) {
                    min = nodo2;
                }
            }
            int temp = nodo1.dato;
            nodo1.dato = min.dato;
            min.dato = temp;
        }
    }

    public void ordenarPorInsercion() {
        if (cabeza == null || cabeza.siguiente == null) return;

        nodo ordenada = null;
        nodo actual = cabeza;

        while (actual != null) {
            nodo siguiente = actual.siguiente;
            ordenada = insertarEnOrden(ordenada, actual);
            actual = siguiente;
        }

        cabeza = ordenada;
    }

    private nodo insertarEnOrden(nodo ordenada, nodo nuevo) {
        if (ordenada == null || ordenada.dato >= nuevo.dato) {
            nuevo.siguiente = ordenada;
            ordenada = nuevo;
        } else {
            nodo actual = ordenada;
            while (actual.siguiente != null && actual.siguiente.dato < nuevo.dato) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
        return ordenada;
    }

    public void ordenarShell() {
        int n = obtenerLongitud();
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < n; i++) {
                int temp = obtener(i);  // Obtener el valor en la posición 'i'
                int j;
                for (j = i; j >= intervalo && obtener(j - intervalo) > temp; j -= intervalo) {
                    establecer(j, obtener(j - intervalo));  // Mover el elemento
                }
                establecer(j, temp);  // Colocar el valor temporal en su posición
            }
        }
    }

    // Método para obtener el valor de un nodo en una posición específica
    private int obtener(int index) {
        nodo actual = cabeza;
        for (int i = 0; i < index && actual != null; i++) {
            actual = actual.siguiente;
        }
        return (actual != null) ? actual.dato : -1;
    }

    // Método para establecer el valor de un nodo en una posición específica
    private void establecer(int index, int valor) {
        nodo actual = cabeza;
        for (int i = 0; i < index && actual != null; i++) {
            actual = actual.siguiente;
        }
        if (actual != null) {
            actual.dato = valor;
        }
    }

    // Método para obtener la longitud de la lista enlazada
    private int obtenerLongitud() {
        int longitud = 0;
        nodo actual = cabeza;
        while (actual != null) {
            longitud++;
            actual = actual.siguiente;
        }
        return longitud;
    }

    public void ordenarQuickSort() {
        cabeza = quickSort(cabeza);
    }

    private nodo quickSort(nodo inicio) {
        if (inicio == null || inicio.siguiente == null) return inicio;

        nodo menor = null, igual = null, mayor = null;

        nodo pivote = inicio;
        while (inicio != null) {
            nodo siguiente = inicio.siguiente;
            if (inicio.dato < pivote.dato) {
                inicio.siguiente = menor;
                menor = inicio;
            } else if (inicio.dato > pivote.dato) {
                inicio.siguiente = mayor;
                mayor = inicio;
            } else {
                inicio.siguiente = igual;
                igual = inicio;
            }
            inicio = siguiente;
        }

        menor = quickSort(menor);
        mayor = quickSort(mayor);

        return concatenar(menor, igual, mayor);
    }

    private nodo concatenar(nodo menor, nodo igual, nodo mayor) {
        nodo inicio = menor;

        if (menor != null) {
            nodo temp = menor;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = igual;
        } else {
            inicio = igual;
        }

        if (igual != null) {
            nodo temp = igual;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = mayor;
        }

        return inicio;
    }
    // Método para calcular y almacenar tiempos de cada algoritmo de ordenamiento
    public void calcularTiemposDeOrdenamiento() {
        // Clonar la lista original para cada ordenamiento
        nodo original = copiarLista(cabeza);

        // Ordenación por Intercambio
        cabeza = copiarLista(original);
        long inicio = System.nanoTime();
        ordenarPorIntercambio();
        tiempoIntercambio = System.nanoTime() - inicio;

        // Ordenación por Selección
        cabeza = copiarLista(original);
        inicio = System.nanoTime();
        ordenarPorSeleccion();
        tiempoSeleccion = System.nanoTime() - inicio;

        // Ordenación por Inserción
        cabeza = copiarLista(original);
        inicio = System.nanoTime();
        ordenarPorInsercion();
        tiempoInsercion = System.nanoTime() - inicio;

        // Ordenación Shell
        cabeza = copiarLista(original);
        inicio = System.nanoTime();
        ordenarShell();
        tiempoShell = System.nanoTime() - inicio;

        // Ordenación Rápida (Quicksort)
        cabeza = copiarLista(original);
        inicio = System.nanoTime();
        ordenarQuickSort();
        tiempoQuickSort = System.nanoTime() - inicio;

        // Restaurar la lista original
        cabeza = original;
    }

    // Método auxiliar para copiar la lista enlazada
    private nodo copiarLista(nodo cabezaOriginal) {
        if (cabezaOriginal == null) return null;
        nodo nuevaCabeza = new nodo(cabezaOriginal.dato);
        nodo actualOriginal = cabezaOriginal.siguiente;
        nodo actualNuevo = nuevaCabeza;
        while (actualOriginal != null) {
            actualNuevo.siguiente = new nodo(actualOriginal.dato);
            actualNuevo = actualNuevo.siguiente;
            actualOriginal = actualOriginal.siguiente;
        }
        return nuevaCabeza;
    }

    // Métodos para obtener los tiempos de ejecución
    public long getTiempoIntercambio() { return tiempoIntercambio; }
    public long getTiempoSeleccion() { return tiempoSeleccion; }
    public long getTiempoInsercion() { return tiempoInsercion; }
    public long getTiempoShell() { return tiempoShell; }
    public long getTiempoQuickSort() { return tiempoQuickSort; }

    // Agrega aquí los métodos de ordenamiento: ordenarPorIntercambio, ordenarPorSeleccion, etc.
    // Método para contar los elementos en la lista
    public int contarElementos() {
        int contador = 0;
        nodo actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    // Método para eliminar la lista
    public void eliminarLista() {
        cabeza = null;
        System.out.println("Lista eliminada.");
    }

    
}