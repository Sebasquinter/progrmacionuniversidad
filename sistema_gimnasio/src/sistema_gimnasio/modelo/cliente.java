
package sistema_gimnasio.modelo;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class cliente extends persona {
    private String codigo;
    private String usuario;//"cliente";
    private String contraseña;//"cliente123";

    public cliente() {
        super();
    }

    public cliente(String codigo, String usuario, String contraseña) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public cliente(String codigo, String usuario, String contraseña, String nombre, String apellido, String cedula, String email, String edad, String sexo, String nacionalidad) {
        super(nombre, apellido, cedula, email, edad, sexo, nacionalidad);
        this.codigo = codigo;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public cliente(String usuario, String contraseña, String nombre, String apellido, String cedula, String email, String edad, String sexo, String nacionalidad) {
        super(nombre, apellido, cedula, email, edad, sexo, nacionalidad);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void realizar_registro(){
        
    }

    @Override
    public String toString() {
        return super.toString()+"cliente{" + "codigo=" + codigo + ", usuario=" + usuario + ", contraseña=" + contraseña + '}';
    }
    

    @Override
    public String calcularmensualidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
