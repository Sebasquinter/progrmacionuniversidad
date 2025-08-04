
package sistema_gimnasio.modelo;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public abstract class persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private String edad; 
    private String sexo;
    private String nacionalidad;

    public persona(String nombre, String apellido, String cedula, String email, String edad, String sexo, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
    }

    public persona() {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "persona:" + 
               "\nnombre=" + nombre + 
               "\n apellido=" + apellido +
               "\n cedula=" + cedula + 
               "\n email=" + email + 
               "\n edad=" + edad + 
               "\n sexo=" + sexo + 
               "\n nacionalidad=" + nacionalidad ;
    }
     abstract public String calcularmensualidad();
}
