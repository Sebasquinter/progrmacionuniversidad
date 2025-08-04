package lista_estructura;

import java.util.Scanner;

public class Lista_estructura {

    public void menu() {
        lista lista = new lista();

        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n--------MENU--------");
            System.out.println("1. Insertar al principio de la lista");
            System.out.println("2. Insertar al final de la lista");
            System.out.println("3. Vizualizar la lista");
            System.out.println("4. Mostrar tamaño de la lista");
            System.out.println("5. Mostrar si la lista esta vacia");
            System.out.println("6. Eliminar al principio de la lista");
            System.out.println("7. Eliminar al final de la lista");
            System.out.println("8. Salir del programa");
            System.out.println("Elija una opcion: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Ingrese el valor a agregar al inicio: ");
                    String valorInicio = scanner.next();
                    lista.agregaralinicio(valorInicio);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a agregar al final: ");
                    String valorFinal = scanner.next();
                    lista.agregaralfinal(valorFinal);
                    break;
                case 3:
                    System.out.println("La lista tiene " + lista.gettamaño() + " elementos");
                    lista.listar();
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("La longitud de la lista es:" + lista.gettamaño());
                    break;
                case 5:
                    if (lista.vacia()) {
                        System.out.println("");
                        System.out.println("La lista esta vacia");
                        System.out.println("");
                    } else {
                        System.out.println("");
                        System.out.println("La lista tiene contenido: ");
                        lista.listar();
                        System.out.println("");
                    }
                    break;
                case 6:
                    lista.eliminarPrimero();
                    System.out.println("");
                    System.out.println("Se ha eliminado el primer nodo");
                    System.out.println("");
                    break;
                case 7:
                    lista.eliminarUltimo();
                    System.out.println("");
                    System.out.println("Se ha eliminado el ultimo nodo");
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("Saliendo del programa");

                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (op != 8);

    }

    public static void main(String[] args) {
        Lista_estructura menu = new Lista_estructura();
        menu.menu();
    }
}
