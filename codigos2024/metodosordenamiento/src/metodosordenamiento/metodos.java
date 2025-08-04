package metodosordenamiento;

import java.util.LinkedList;
import java.util.Random;

public class metodos {
    private LinkedList<Integer> lista;

    public metodos() {
        lista = new LinkedList<>();
    }

    public LinkedList<Integer> getLista() {
        return lista;
    }

    public void generarNumerosAleatorios(int cantidad) {
        lista.clear();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            lista.add(random.nextInt(100)); // Números aleatorios entre 0 y 99
        }
        System.out.println("Lista generada: " + lista);
    }

    public void ordenarPorIntercambio() {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }

    public void ordenarPorSeleccion() {
        for (int i = 0; i < lista.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j) < lista.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = lista.get(minIndex);
            lista.set(minIndex, lista.get(i));
            lista.set(i, temp);
        }
    }

    public void ordenarPorInsercion() {
        for (int i = 1; i < lista.size(); i++) {
            int key = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j) > key) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, key);
        }
    }

    public void ordenarShell() {
        int n = lista.size();
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = lista.get(i);
                int j;
                for (j = i; j >= gap && lista.get(j - gap) > temp; j -= gap) {
                    lista.set(j, lista.get(j - gap));
                }
                lista.set(j, temp);
            }
        }
    }

    public void ordenarQuickSort(int low, int high) {
        if (low < high) {
            int pi = particion(low, high);
            ordenarQuickSort(low, pi - 1);
            ordenarQuickSort(pi + 1, high);
        }
    }

    private int particion(int low, int high) {
        int pivot = lista.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (lista.get(j) <= pivot) {
                i++;
                int temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }
        int temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(high));
        lista.set(high, temp);
        return i + 1;
    }

    public void compararOrdenamientos() {
        LinkedList<Integer> copiaLista = new LinkedList<>(lista);

        // Ordenación por Intercambio
        LinkedList<Integer> listaIntercambio = new LinkedList<>(copiaLista);
        ordenarPorIntercambio();
        System.out.println("Intercambio: " + listaIntercambio);

        // Ordenación por Selección
        lista = new LinkedList<>(copiaLista);
        ordenarPorSeleccion();
        System.out.println("Seleccion: " + lista);

        // Ordenación por Inserción
        lista = new LinkedList<>(copiaLista);
        ordenarPorInsercion();
        System.out.println("Insercion: " + lista);

        // Ordenación Shell
        lista = new LinkedList<>(copiaLista);
        ordenarShell();
        System.out.println("Shell: " + lista);

        // Ordenación Quicksort
        lista = new LinkedList<>(copiaLista);
        ordenarQuickSort(0, lista.size() - 1);
        System.out.println("Quicksort: " + lista);
    }
}