/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metro;

import java.util.Scanner;

/**
 *
 * @author Kevin Sebastian
 */
public class Metro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        metodo1 meth = new metodo1();
        metodo2 po = new metodo2();
        metodo3 de = new metodo3();

        int cedula;
        int cliente = 0;
        float totalpagar = 0;
        int num;
        float mayorcompra = 0;
        int mayorusuario = 0;
        int toal2 = 0;

        int codigos;

        do {
            System.out.println("ingrese el dia del mes en que se abrio la caja: ");
            int dia = tec.nextInt();
            num = meth.metodo_validar(dia);
            if (num >= 1 && num <= 31) {
                System.out.println("---ingreso un dia correcto---");

            } else {
                System.out.println("ingrese un dia valido");

            }
        } while (num <= 1 || num >= 31);

        do {
            cliente++;

            System.out.println("resgistrando al cliente numero: " + cliente);

            System.out.println("");

            System.out.println("ingrese la cedula del cliente o (0) para cerrar el programa : ");
            cedula = tec.nextInt();

            if (cedula != 0) {
                System.out.println("ingrese el nombre del cliente: ");
                String nombre = tec.next();
                System.out.println("ingrese el numero de telefono del cliente: ");
                double tel = tec.nextDouble();
                System.out.println("ingrese el email del cliente: ");
                String correo = tec.next();
                System.out.println("ingrese el sexo del cliente(H-hombre y M-mujer): ");
                char caracter = tec.next().charAt(0);

                System.out.println("ingrese la cantidad de productos a registar: ");
                int cantidad = tec.nextInt();

                float totalPagarCliente = 0;

                for (int i = 0; i < cantidad; i++) {
                    int codigo;

                    do {
                        System.out.println("codigo del producto: ");
                        codigo = tec.nextInt();
                        codigos = po.metodo_verificar(codigo);

                        if (codigos == codigo) {
                            System.out.println("el codigo es valido ");

                        } else {
                            System.out.println("ingrese un codigo valido");
                        }
                    } while (codigos != codigo);

                    System.out.println("ingrese el precio a pagar: ");
                    float precio = tec.nextFloat();
                    float total = de.descuentopromo(precio, codigos, num, cedula);

                    totalPagarCliente += total;
                    totalpagar += total;

                }
                System.out.println("el cliente debe de pagar: " + totalPagarCliente);

                if (totalPagarCliente > mayorcompra) {
                    mayorcompra = totalPagarCliente;
                    mayorusuario = cliente;
                }
            }

        } while (cedula != 0);

        System.out.println("clientes atendidos: " + (cliente - 1));
        System.out.println("total de ventas: " + totalpagar);
        System.out.println("el cliente con la mayor compra fue: " + mayorusuario);
        System.out.println("el valor de la mayor compra fue: " + mayorcompra);

    }
}
