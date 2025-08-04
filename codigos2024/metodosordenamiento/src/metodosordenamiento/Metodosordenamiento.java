package metodosordenamiento;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Metodosordenamiento {

    public void menu() {
        ListaEnlazada m = new ListaEnlazada();
        Scanner tec = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n--- menu de ordanamiento---");
            System.out.println("1. generar lista aleatoria");
            System.out.println("2. ordenacion por intercambio");
            System.out.println("3. ordenacion por seleccion");
            System.out.println("4. ordenacion por insercion");
            System.out.println("5. ordenacion shell");
            System.out.println("6. ordenacion rapida");
            System.out.println("7. Grafico Comparativo de Algoritmos");
            System.out.println("8. contar elementos en la lista");
            System.out.println("9. eliminar lista generada");
            System.out.println("10. salir");
            System.out.println("digite la opcion a realizar: ");
            op = tec.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese la cantidad de números aleatorios: ");
                    int cantidad = tec.nextInt();
                    m.generarNumerosAleatorios(cantidad);
                    break;
                case 2:
                    m.ordenarPorIntercambio();
                    System.out.print("Lista ordenada por Intercambio: ");
                    m.imprimir();
                    break;
                case 3:
                    m.ordenarPorSeleccion();
                    System.out.print("Lista ordenada por Selección: ");
                    m.imprimir();
                    break;
                case 4:
                    m.ordenarPorInsercion();
                    System.out.print("Lista ordenada por Inserción: ");
                    m.imprimir();
                    break;
                case 5:
                    m.ordenarShell();
                    System.out.print("Lista ordenada por Shell: ");
                    m.imprimir();
                    break;
                case 6:
                    m.ordenarQuickSort();
                    System.out.print("Lista ordenada por Quicksort: ");
                    m.imprimir();
                    break;
                case 7:
                    m.calcularTiemposDeOrdenamiento();
                    System.out.println("Tiempos de ejecucion de algoritmos de ordenamiento:");
                    System.out.println("Intercambio: " + m.getTiempoIntercambio() + " nanosegundos");
                    System.out.println("Selección: " + m.getTiempoSeleccion() + " nanosegundos");
                    System.out.println("Inserción: " + m.getTiempoInsercion() + " nanosegundos");
                    System.out.println("Shell: " + m.getTiempoShell() + " nanosegundos");
                    System.out.println("Quicksort: " + m.getTiempoQuickSort() + " nanosegundos");
                    break;
                case 8:
                    int elementos = m.contarElementos();
                    System.out.println("la lista contiene " + elementos + "elementos");
                    break;
                case 9:
                    m.eliminarLista();
                    break;
                case 10:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (op != 10);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodosordenamiento menu = new Metodosordenamiento();
        menu.menu();
        // TODO code application logic here
    }

}
