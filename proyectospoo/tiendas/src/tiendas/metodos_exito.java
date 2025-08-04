package tiendas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class metodos_exito {

    public void agregar_exito1(ArrayList<exito> vec1) {
        Scanner tec = new Scanner(System.in);
        String promocion;
        String nombre;
        int nit;
        String direccion;
        int num_clientes;
        //String promocion, String nombre, int nit, String direccion, int num_clientes
        System.out.println("digite la promocion");
        promocion = tec.nextLine();
        System.out.println("digite el nombre ");
        nombre = tec.nextLine();
        System.out.println("digite el nit");
        nit = tec.nextInt();
        tec.nextLine();
        System.out.println("digite la direccion");
        direccion = tec.nextLine();
        System.out.println("digite el numero de clientes");
        num_clientes = tec.nextInt();
        exito agregar = new exito(promocion, nombre, nit, direccion, num_clientes);
        vec1.add(agregar);

    }

    public void mostrar_exito1(ArrayList<exito> vec1) {
        for (int i = 0; i < vec1.size(); i++) {
            System.out.println("" + (i + 1));
            System.out.println(vec1.get(i));

        }

    }

    public boolean buscar(int nit_bus, ArrayList<exito> vec1) {
        for (exito tienda : vec1) {
            if (tienda.getNit() == nit_bus) {

                return true;

            }

        }

        return false;
    }

    public boolean elminar(ArrayList<exito> vec1) {
        boolean encontrado = false;
        Scanner tec = new Scanner(System.in);
        System.out.println("ingrese el nit de la tienda a eliminar");
        int nit_bus = tec.nextInt();
        for (int i = 0; i < vec1.size(); i++) {
            if (vec1.get(i).getNit() == nit_bus) {
                System.out.println("tienda eliminada " + vec1.get(i));
                vec1.remove(i);
                encontrado = true;
                break;
            }

        }
        if (!encontrado) {
            System.out.println("la tienda con el nit " + nit_bus + " no se encuntra registrado");
        }
        return encontrado;
    }

    public void modificar(ArrayList<exito> vec1) {
        
        metodos_exito buscar = new metodos_exito();
        int op;
        Scanner tec = new Scanner(System.in);
        System.out.println("digite el nit de la tienda a modificar");
        int nit_bus = tec.nextInt();
        boolean encontrado = buscar.buscar(nit_bus, vec1);
        if (encontrado) {
            for (exito tienda : vec1) {
                boolean seguirmodificando = true;
                System.out.println("modificando a la tienda con el nit:" + nit_bus);
                do {
                    System.out.println("¿Qué deseas modificar?");
                    System.out.println("1. promocion");
                    System.out.println("2. direccion");
                    System.out.println("3. numero de clientes");
                    System.out.println("4. salir");
                    System.out.println("Digite una opción:");
                    op = tec.nextInt();
                    tec.nextLine();
                    switch(op){
                        case 1:
                            System.out.println("ingrese la nueva promocion:");
                            String nuevapromocion=tec.nextLine();
                            tienda.setPromocion(nuevapromocion);
                            break;
                        case 2:
                            System.out.println("ingrese la nueva direccion:");
                            String nuevadireccion=tec.nextLine();
                            tienda.setDireccion(nuevadireccion);
                            break;
                        case 3:
                            System.out.println("digite el nuevo numero de clientes");
                            int nuevo_num_clientes = tec.nextInt();
                            tienda.setNum_clientes(nuevo_num_clientes);
                            break;
                        case 4:
                            System.out.println("saliendo");
                            seguirmodificando = false;
                        default:
                            System.out.println("opcion invalida");
                            break;
                        
                    }

                } while (seguirmodificando);

            }

        }else{
            System.out.println("la tiennda con el nit "+  nit_bus+" no se encuentra registrado");
        }

    }

}
