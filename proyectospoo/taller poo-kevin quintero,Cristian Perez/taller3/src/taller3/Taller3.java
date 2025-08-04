/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3;

import java.util.Scanner;

/**
 *
 * @author Kevin Sebastian
 */
public class Taller3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        System.out.println("registre el numero de veiculos que se van a registar: ");
        int registro = tec.nextInt();
        
        control po = new control();
        int[] registro1 = po.registrarveiculos(registro);
        
        po.ingresar_registro(registro1);
        po.cantidad_vehiculos(registro1);
        
        // TODO code application logic here
    }
    
}
