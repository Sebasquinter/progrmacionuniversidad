/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;

import java.util.Scanner;

/**
 *
 * @author Kevin Sebastian
 */
public class control {
    public int [] registrarveiculos(int registro){
        int registros[];
        
        return registros = new int [registro];
    }
    public void ingresar_registro(int registros[]){
        
        Scanner tec = new Scanner (System.in);
        for (int i = 0; i < registros.length; i++) {
            System.out.println("ingrese el codigo de tipo de vehiculos para el registro: "+(i+1));
            registros[i] = tec.nextInt();
        }
                
    }
    public int cantidad_vehiculos(int registros[]){
        int totalmotos=0,totalautomoviles=0,totalcamiones=0;
        
        int totalrecaudomotos=0,totalrecaudautomoviles=0,totalrecaudocaminones=0;
        
        for (int i = 0; i < registros.length; i++) {
            switch(registros[i]){
                case 1:
                    totalmotos++;
                    totalrecaudomotos = totalrecaudomotos+2500;
                    break;
                case 2 :
                    totalautomoviles ++;
                    totalrecaudautomoviles = totalrecaudautomoviles + 19800;
                    break;
                case 3 :     
                    totalcamiones ++;
                    totalrecaudocaminones = totalrecaudocaminones + 62500;
                    break;
                default:
                    System.out.println("codigo invalido en el registro #");
            }
            
        }
        int totalrecaudado = totalrecaudomotos+totalrecaudautomoviles+totalrecaudocaminones;
        imprimir(totalmotos,totalrecaudomotos,totalautomoviles,
                totalrecaudautomoviles,totalcamiones,totalrecaudocaminones,totalrecaudado);
        return totalrecaudado;
    }
    public void imprimir (int totalmotos,int totalrecaudomotos,int totalautomoviles,
                int totalrecaudautomoviles,int totalcamiones,int totalrecaudocaminones,int totalrecaudado){
        System.out.println("cantidad de motos: "+totalmotos);
        System.out.println("total recaudado por motos: "+totalrecaudomotos);
        
        System.out.println("cantidad de automoviles: "+totalautomoviles);
        System.out.println("total recaudado por automoviles: "+totalrecaudautomoviles);
        
        System.out.println("cantidad de camiones: "+totalcamiones);
        System.out.println("total recaudado camiones: "+totalrecaudocaminones);
        
        System.out.println("total recaudado en el dia: "+totalrecaudado);
        
    }
    
}
