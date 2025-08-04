package lista_estructura;

//import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Lista_estructura {

    public void menu() {
        lista lista = new lista();

        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n--------MENU--------");
            System.out.println("1. Insertar al principio ");
            System.out.println("2. Insertar al final");
            System.out.println("3. Vizualizar");
            System.out.println("4. Mostrar tamaño de la lista");
            System.out.println("5. Mostrar si la lista esta vacia");
            System.out.println("6. Eliminar al principio");
            System.out.println("7. Eliminar al final");
            System.out.println("0. Salir");
            System.out.println("Elija una opcion");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Ingrese el valor a agregar al inicio: ");
                    int valorInicio = scanner.nextInt();
                    lista.agregaralinicio(valorInicio); 
                    break;
                case 2:
                    System.out.print("Ingrese el valor a agregar al final: ");
                    int valorFinal = scanner.nextInt();
                    lista.agregaralfinal(valorFinal); 
                    break;  
                case 3:
                    System.out.println("La lista tiene " + lista.gettamaño() + " elementos");
                    lista.listar();
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("la longitud de la lista es:"+lista.gettamaño());
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
                case 0:
                    System.out.println("saliendo del programa");

                    break;
                    
                default:
                    System.out.println("Opcion invalida.");
            }

        } while (op != 0);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista_estructura menu = new Lista_estructura();

        

        menu.menu();
        
    }

}
