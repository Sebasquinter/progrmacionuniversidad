/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author Kevin Sebastian
 */
public class vector2 {
    public static boolean primo(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            
            if(num % i == 0){
                return false;
            }
            
        }
        
        
        return true;
    }
    public static void numeroprimo(int vec[]){
        System.out.println("los numeros primos son: ");
        for (int i = 0; i < vec.length; i++) {
            boolean numprimo = primo(vec[i]);
            
            if (numprimo){
                System.out.println(+vec[i]);
            }
            
        }
    }
    
}
