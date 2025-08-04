package tiendas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class metodos_montes {

    public void agregar_montes(ArrayList<los_montes> vec3) {
        Scanner tec = new Scanner(System.in);
        String empleado;
        String nombre;
        int nit;
        String direccion;
        int num_clientes;
        //String empleado, String nombre, int nit, String direccion, int num_clientes
        System.out.println("digite el nombre del empleado del mes");
        empleado = tec.nextLine();
        System.out.println("digite el nombre ");
        nombre = tec.nextLine();
        System.out.println("digite el nit");
        nit = tec.nextInt();
        tec.nextLine();
        System.out.println("digite la direccion");
        direccion = tec.nextLine();
        System.out.println("digite el numero de clientes");
        num_clientes = tec.nextInt();
        los_montes agregar = new los_montes(empleado, nombre, nit, direccion, num_clientes);
        vec3.add(agregar);

    }

    public void mostrar_montes(ArrayList<los_montes> vec3) {
        for (int i = 0; i < vec3.size(); i++) {
            System.out.println("" + (i + 1));
            System.out.println(vec3.get(i));
        }
    }

    public boolean busca(int nit_buscar, ArrayList<los_montes> vec3) {
        for (los_montes tienda : vec3) {
            if (tienda.getNit() == nit_buscar) {
                return true;

            }
        }
        return false;
    }

    public boolean eliminar(ArrayList<los_montes> vec3) {
        boolean encontrado = false;
        Scanner tec = new Scanner(System.in);
        metodos_montes busca = new metodos_montes();
        int nit_buscar;
        System.out.println("digite el numero del nit a eliminar:");
        nit_buscar = tec.nextInt();
        for (int i = 0; i < vec3.size(); i++) {
            if (vec3.get(i).getNit() == nit_buscar) {
                System.out.println("tienda eliminada");
                vec3.remove(i);
                encontrado = true;
                break;
            }

        }
        if (!encontrado) {
            System.out.println("la tienda con el nit " + nit_buscar + " no se encuntra registrado");
        }
        return encontrado;
    }

    public void modificar(ArrayList<los_montes> vec3) {
        metodos_montes busca = new metodos_montes();
        Scanner tec = new Scanner(System.in);
        int op;
        int nit_buscar;
        System.out.println("digite el nit de la tienda a modificar:");
        nit_buscar = tec.nextInt();
        boolean encontrado = busca.busca(nit_buscar, vec3);
        if (encontrado) {
            for (los_montes tienda : vec3) {
                boolean seguirmodificando = true;
                System.out.println("modifando a la tienda con el nit: " + nit_buscar);
                do {
                    System.out.println("¿Qué deseas modificar?");
                    System.out.println("1. empleado del mes");
                    System.out.println("2. direccion");
                    System.out.println("3. numero de clientes");
                    System.out.println("4. salir");
                    System.out.println("Digite una opción:");
                    op = tec.nextInt();
                    tec.nextLine();
                    switch (op) {
                        case 1:
                            System.out.println("ingrese el nombre del nuevo empleado:");
                            String nuevoempleado = tec.nextLine();
                            tienda.setEmpleado(nuevoempleado);
                            break;
                        case 2:
                            System.out.println("ingrese la nueva direccion:");
                            String nuevadireccion = tec.nextLine();
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
        } else {
            System.out.println("la tiennda con el nit " + nit_buscar + " no se encuentra registrado");

        }
    }

}
