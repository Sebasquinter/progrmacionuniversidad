
package sistema_gimnasio.modelo;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class administrador extends persona{
    
    private String codigoad;
    private String usuario_admin="admin1";
    private String contraseña_admin="admin123";

    public administrador() {
        super();
    }

    public administrador(String codigoad, String usuario_admin, String contraseña_admin) {
        this.codigoad = codigoad;
        this.usuario_admin = usuario_admin;
        this.contraseña_admin = contraseña_admin;
    }

    public administrador(String codigoad, String usuario_admin, String contraseña_admin, String nombre, String apellido, String cedula, String email, String edad, String sexo, String nacionalidad) {
        super(nombre, apellido, cedula, email, edad, sexo, nacionalidad);
        this.codigoad = codigoad;
        this.usuario_admin = usuario_admin;
        this.contraseña_admin = contraseña_admin;
    }

    public String getCodigoad() {
        return codigoad;
    }

    public void setCodigoad(String codigoad) {
        this.codigoad = codigoad;
    }

    public String getUsuario_admin() {
        return usuario_admin;
    }

    public void setUsuario_admin(String usuario_admin) {
        this.usuario_admin = usuario_admin;
    }

    public String getContraseña_admin() {
        return contraseña_admin;
    }

    public void setContraseña_admin(String contraseña_admin) {
        this.contraseña_admin = contraseña_admin;
    }
    
    public void realizar_inscripcion(){
        
    }
    public void modificar_inscripcion(){
        
    }
    public void eliminar_inscripciom(){
        
    }
    public void listar_incripcion(){
        
    }
    public void registrar_entrenador(){
        
    }
    public void modificar_entrenador(){
        
    }
    public void eliminar_entrenador(){
        
    }
    public void listar_entrenador(){
        
    }
    public void asignar(){
        
    }

    @Override
    public String toString() {
        return super.toString()+"administrador{" + "codigoad=" + codigoad + ", usuario_admin=" + usuario_admin + ", contrase\u00f1a_admin=" + contraseña_admin + '}';
    }
    
    

    @Override
    public String calcularmensualidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
