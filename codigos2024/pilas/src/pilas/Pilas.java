
package pilas;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Pilas {
    public void menu(){
        pila ope = new pila();
        Scanner tec = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n-----MENU-----");
            System.out.println("1. iniciar la pila");
            System.out.println("2. agregar elemento");
            System.out.println("3. eliminar elemento");
            System.out.println("4. consurltar pila");
            System.out.println("5. determinar longitud de la pila");
            System.out.println("6. verificar si la pila esta vacia");
            System.out.println("7. salir");
            System.out.println("seleccione una opcion");
            opcion= tec.nextInt();
            switch(opcion){
                case 1:
                    ope.inicializar();
                    break;
                case 2:
                    System.out.println("ingresar elemento a la pila: ");
                    int elemento = tec.nextInt();
                    ope.insertar(elemento);
                    break;
                case 3:
                    ope.eliminar();
                    break;
                case 4:
                    ope.consultar();
                    break;
                case 5:
                    System.out.println("la pila tiene " + ope.obtenerlongitud() +  " elementos");
                    break;
                case 6:
                    if (ope.esvacia()) {
                        System.out.println("la pila esta vacia");
                    }else{
                        System.out.println("la pila no esta vacia");
                    }
                    break;
                case 7:
                    System.out.println("saliendo del programa");
                default:
                    System.out.println("opcion invalida");
                
            }

        } while (opcion!=7);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilas menu = new Pilas();
        menu.menu();
        // TODO code application logic here
    }

}
