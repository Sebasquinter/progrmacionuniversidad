
package sistema_gimnasio.modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class gym {
    private ArrayList<cliente>clientes = new ArrayList<cliente>();
    private ArrayList<entrenador>entrenadores = new ArrayList<entrenador>();
    private ArrayList<administrador>administradores = new ArrayList<administrador>();

    
    public gym(){
        this.administradores=new ArrayList<administrador>();
        this.clientes= new ArrayList<cliente>();
        this.entrenadores= new ArrayList<entrenador>();
    }

    public ArrayList<cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(ArrayList<entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    public ArrayList<administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<administrador> administradores) {
        this.administradores = administradores;
    }
    /**
     * 
    */
    public int verificarcredenciales(String usuario,String contraseña){
        administrador o = new administrador();
        entrenador e= new entrenador();
        cliente c = new cliente();
        if (o.getUsuario_admin().equalsIgnoreCase(usuario) && o.getContraseña_admin().equalsIgnoreCase(contraseña)) {
            return 1;
        }else if(c.getUsuario().equalsIgnoreCase(usuario) && c.getContraseña().equalsIgnoreCase(contraseña)){
            return 2;
        }else if(e.getEnusuarioen().equalsIgnoreCase(usuario)&& e.getEncontraseñaen().equalsIgnoreCase(contraseña)){
            return 3;
        }
            return 4;
        
    }
    public boolean verificarcedula(String cedula){
        for (int i = 0; i < clientes.size(); i++) {
            if (cedula.equalsIgnoreCase(clientes.get(i).getCedula())) {
                return true;
            }
        }
        return false;
    }
    public void registrar(){
        String usuario,contraseña,nombre,  apellido,  cedula,  email,  edad,  sexo, nacionalidad,codigo;
        Scanner tec = new Scanner (System.in);
        System.out.println("digite el nombre del cliente: ");
        nombre=tec.nextLine();
        System.out.println("digite el apellido del client: ");
        apellido = tec.nextLine();
        
        System.out.println("digite la cedula del cliente: ");
        cedula= tec.nextLine();
        tec.nextLine();
        boolean re = verificarcedula(cedula);
        while(re==true){
            cedula = tec.nextLine();
            tec.nextLine();
            re=verificarcedula(cedula);
        }
        System.out.println("digite el codigo del cliente:");
        codigo=tec.nextLine();
        System.out.println("digite el email del cliente: ");
        email = tec.nextLine();
        System.out.println("digite la edad del cliente: ");
        edad=tec.nextLine();
        System.out.println("digite el sexo del cliente: ");
        sexo=tec.nextLine();
        System.out.println("digite la nacionalidad: ");
        nacionalidad=tec.nextLine();
        System.out.println("digite el usuario para el cliente: ");
        usuario= tec.nextLine();
        System.out.println("digite la contrsaeña para el cliente: ");
        contraseña= tec.nextLine();
        
    }

    public void registrar(String nombre, String apellido, String cedula, String email, String edad, String opradio, String nacionalidad, String codigo, String valor_mensualidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
