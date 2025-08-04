/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gimnasio.controlador;

import sistema_gimnasio.modelo.DAO;
import sistema_gimnasio.modelo.gym;




public class Controlador {
    gym controla = new gym();
    DAO meth = new DAO();
    public int verificarcredenciales(String usuario,String contraseña){
        gym valida = new gym();
        int vali=valida.verificarcredenciales(usuario, contraseña);
        return vali;
        
    }
    public String registrar(String nombre1,String apellido1,String cedula1,String email1,String edad1,String opradio,String nacionalidad1,String codigo1,String valor_mensualidad1){
        meth.registrar(nombre1, apellido1, cedula1, email1, edad1, opradio, nacionalidad1, codigo1, valor_mensualidad1);
        return "n";
    }
    
    
    
    
}
