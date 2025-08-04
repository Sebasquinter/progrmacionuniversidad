/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metro;

/**
 *
 * @author Kevin Sebastian
 */
public class metodo2 {

    public int metodo_verificar(int codigo) {
        String codigoString = Integer.toString(codigo);
        if (codigoString.length() != 4) {
            return 1;
        }
        char primerDigito = codigoString.charAt(0);

        int primerDigitoEntero = Character.getNumericValue(primerDigito);
        if (primerDigitoEntero % 2 == 0) {
            return 1;
        }

        return codigo;
    }

}
