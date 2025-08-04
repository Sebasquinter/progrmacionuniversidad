package tiendas;

import java.util.ArrayList;
import java.util.Scanner;
import metodos2.buscartienda;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Tiendas {

    Scanner tec = new Scanner(System.in);

    public void menur(ArrayList<exito> vec1,ArrayList<olimpica> vec2, ArrayList<los_montes> vec3) {
        buscartienda buscar = new buscartienda();
        metodos_exito meth1 = new metodos_exito();
        metodos_montes meth2=new metodos_montes();
        validarop validar = new validarop();
        int op;
        boolean correcto;

        do {
            System.out.println("******************************");
            System.out.println("\t\tmenu");
            System.out.println("1.registrar tienda exito");
            System.out.println("2.registrar tienda olimpica");
            System.out.println("3.registar tienda los montes");
            System.out.println("4.mostrar tiendad exito");
            System.out.println("5.mostrar tiendas olimpica");
            System.out.println("6.mostara tiendas los montes");
            System.out.println("7.modificar tienda exito");
            System.out.println("8.modificar tienda olimpica");
            System.out.println("9.modificar tienda los montes");
            System.out.println("10. buscar tienda por nit");
            System.out.println("11.eliminar tienda exito");
            System.out.println("12.eliminar tienda olimpica");
            System.out.println("13.eliminar tienda los montes");
            System.out.println("14.salir del programa");
            System.out.println("15. digite una opcion ");
            System.out.println("*******************************");

            op = tec.nextInt();
            correcto = validar.opcion(op);
            while (correcto == false) {
                System.out.println("***************************");
                System.out.println("Wrong");
                System.out.println("***************************");
                System.out.println("\t\tmenu");
                System.out.println("1.registrar tienda exito");
                System.out.println("2.registrar tienda olimpica");
                System.out.println("3.registar tienda los montes");
                System.out.println("4.mostrar tiendad exito");
                System.out.println("5.mostrar tiendas olimpica");
                System.out.println("6.mostara tiendas los montes");
                System.out.println("7.modificar tienda exito");
                System.out.println("8.modificar tienda olimpica");
                System.out.println("9.modificar tienda los montes");
                System.out.println("10.buscar tienda por nit");
                System.out.println("11.eliminar tienda exito");
                System.out.println("12.eliminar tienda olimpica");
                System.out.println("13.eliminar tienda los montes");
                System.out.println("14.salir del programa");
                System.out.println("15.digite una opcion ");
                System.out.println("****************************");

                op = tec.nextInt();
                correcto = validar.opcion(op);
            }
            switch (op) {
                case 1:
                    meth1.agregar_exito1(vec1);
                    break;
                case 2:

                    break;
                case 3:
                    meth2.agregar_montes(vec3);
                    break;
                case 4:
                    meth1.mostrar_exito1(vec1);
                    break;
                case 5:
                    break;
                case 6:
                    meth2.mostrar_montes(vec3);
                    break;
                case 7:
                    meth1.modificar(vec1);
                    break;
                case 8:
                    break;
                case 9:
                    meth2.modificar(vec3);
                    break;
                case 10:
                   buscar.buscar_tienda(vec1, vec2, vec3);
                    break;
                case 11:
                    meth1.elminar(vec1);
                    break;
                case 12:
                    break;
                case 13:
                    meth2.eliminar(vec3);
                    break;
                case 14:
                    break;
                case 15:
                    break;
                    

            }
        } while (op != 15);
        System.out.println("adios...");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<exito> vec1 = new ArrayList<exito>();
        ArrayList<olimpica> vec2 = new ArrayList<olimpica>();
        ArrayList<los_montes> vec3 = new ArrayList<los_montes>();
        
        Tiendas menu = new Tiendas();
        menu.menur(vec1,vec2,vec3);
        Scanner tec = new Scanner(System.in);

        // TODO code application logic here
    }

}
