/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metro;

/**
 *
 * @author Kevin Sebastian
 */
public class metodo3 {

    public float descuentopromo(float precio, int codigos, int num, int cedula) {
        String cedulaStr = String.valueOf(cedula);

        metodo4 sum = new metodo4();
        int toal2 = sum.cedulaganadora(num, cedulaStr);

        int ultimodigitocodigo = codigos % 100;

        if (ultimodigitocodigo == num) {

            precio -= precio * 0.10f;
        }

        //int total2 = sum.cedulaganadora(num, cedulaStr);
        if (toal2 == 1) {

            precio -= precio * 1f;
        }

        return precio;
    }
}
