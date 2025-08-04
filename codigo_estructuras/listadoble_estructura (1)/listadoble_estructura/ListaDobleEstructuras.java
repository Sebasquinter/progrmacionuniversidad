package listadoble_estructura;

import java.util.Scanner;

public class ListaDobleEstructuras {

    public void menu() {
        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();

        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n--------MENU--------");
            System.out.println("1. Insertar al principio de la lista");
            System.out.println("2. Insertar al final de la lista");
            System.out.println("3. Visualizar la lista de principio a fin");
            System.out.println("4. Visualizar la lista de fin a principio");
            System.out.println("5. Mostrar tamaño de la lista");
            System.out.println("6. Mostrar si la lista está vacía");
            System.out.println("7. Eliminar al principio de la lista");
            System.out.println("8. Eliminar al final de la lista");
            System.out.println("9. Salir del programa");
            System.out.println("Elija una opción: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Ingrese el valor a agregar al inicio: ");
                    String valorInicio = scanner.next();
                    lista.agregarAlInicio(valorInicio);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a agregar al final: ");
                    String valorFinal = scanner.next();
                    lista.agregarAlFinal(valorFinal);
                    break;
                case 3:
                    System.out.println("La lista de principio a fin es:");
                    lista.listarDePrincipioAFinal();
                    break;
                case 4:
                    System.out.println("La lista de fin a principio es:");
                    lista.listarDeFinAPrincipio();
                    break;
                case 5:
                    System.out.println("La longitud de la lista es: " + lista.getTamaño());
                    break;
                case 6:
                    if (lista.vacia()) {
                        System.out.println("La lista está vacía");
                    } else {
                        System.out.println("La lista tiene contenido");
                    }
                    break;
                case 7:
                    lista.eliminarPrimero();
                    System.out.println("Se ha eliminado el primer nodo");
                    break;
                case 8:
                    lista.eliminarUltimo();
                    System.out.println("Se ha eliminado el último nodo");
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 9);
    }

    public static void main(String[] args) {
        ListaDobleEstructuras menu = new ListaDobleEstructuras();
        menu.menu();
    }
}

