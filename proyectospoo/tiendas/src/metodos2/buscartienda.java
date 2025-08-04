
package metodos2;

import java.util.ArrayList;
import java.util.Scanner;
import tiendas.exito;
import tiendas.los_montes;
import tiendas.olimpica;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class buscartienda {
    public void buscar_tienda(ArrayList<exito> vec1, ArrayList<olimpica> vec2, ArrayList<los_montes> vec3) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese el NIT de la tienda a buscar: ");
        int nit_buscar = tec.nextInt();
        
        for (exito tienda : vec1) {
            if (tienda.getNit() == nit_buscar) {
                System.out.println("Tienda Exito encontrada: " + tienda);
                return;
            }
        }
        
        for (olimpica tienda : vec2) {
            if (tienda.getNit() == nit_buscar) {
                System.out.println("Tienda Olimpica encontrada: " + tienda);
                return;
            }
        }

        for (los_montes tienda : vec3) {
            if (tienda.getNit() == nit_buscar) {
                System.out.println("Tienda Los Montes encontrada: " + tienda);
                return;
            }
        }

        System.out.println("Tienda con NIT " + nit_buscar + " no encontrada.");
    }

}
