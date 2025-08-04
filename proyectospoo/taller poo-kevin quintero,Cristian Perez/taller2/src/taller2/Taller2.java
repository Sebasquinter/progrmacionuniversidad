/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

/**
 *
 * @author Kevin Sebastian
 */
public class Taller2 {

    public void menu(int vec[]) {
        Scanner tec = new Scanner(System.in);
        int opcion;
        do {

            System.out.println("----menu----");
            System.out.println("1. ingresar los numeros");
            System.out.println("2. mostar numeros primos ");
            System.out.println("3. mostar numeros perfectos");
            System.out.println("0. salir del programa ");
            System.out.println("Ingrese una opcion: ");

            opcion = tec.nextInt();

            switch (opcion) {
                case 1:
                    llenarvector po= new llenarvector();
                    po.llenar(vec);

                    break;
                case 2:
                    llenarvector im = new llenarvector();
                    im.imprimir(vec);
                    
                    vector2.numeroprimo(vec);
                    

                    break;

                case 3:
                    
                    llenarvector si= new llenarvector();
                    si.imprimir(vec);
                    
                    vector3.numeroperfecto(vec);

                    break;

                case 0:
                    System.out.println("saliendo...");

                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taller2 men = new Taller2();

        Scanner tec = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros que va a registar: ");
        int n = tec.nextInt();
        int vec[] = new int [n];
        men.menu(vec);

        // TODO code application logic here
    }

}
