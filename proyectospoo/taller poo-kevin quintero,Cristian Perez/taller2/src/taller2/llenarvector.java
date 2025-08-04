/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

import java.util.Scanner;

/**
 *
 * @author Kevin Sebastian
 */
public class llenarvector {

    public void llenar(int vec[]) {
        Scanner tec = new Scanner(System.in);
        int i, num;
        for (i = 0; i < vec.length; i++) {
            System.out.println("REGISTAR NUMEROS");
            num = tec.nextInt();
            vec[i] = num;

        }

    }

    public void imprimir(int vec[]) {
        for (int i = 0; i<vec.length; i++) {
            System.out.println(""+vec[i]);
            
        }

    }

}
