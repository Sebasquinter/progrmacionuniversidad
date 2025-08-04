/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metro;

/**
 *
 * @author Kevin Sebastian
 */
public class metodo4 {

    public int cedulaganadora(int num, String cedulaStr) {
        int suma = 0; 
        for (int i = 0; i < cedulaStr.length(); i++) {
           
            suma += Character.getNumericValue(cedulaStr.charAt(i));
        }

        if (suma == num) {
            return 1;
        } else {
            return 0;
        }

    }

}
