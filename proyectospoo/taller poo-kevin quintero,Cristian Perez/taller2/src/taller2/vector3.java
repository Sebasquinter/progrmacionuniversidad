/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author Kevin Sebastian
 */
public class vector3 {
    public static boolean perfecto (int num){
        int sumadivisores =1;
        
        for (int i = 2; i <= num/2; i++) {
            if (num % i==0) {
                sumadivisores += i;
                
            }
            
        }
        
        return sumadivisores == num ;

        
    }
    public static void numeroperfecto(int vec[]){
         System.out.println("los numeros perfectos");
         for (int i = 0; i < vec.length; i++) {
             boolean numeroperfecto = perfecto(vec[i]);
             if (numeroperfecto) {
                 
                 System.out.println(""+vec[i]);
                 
             }
            
        }
         
    }
    
}
