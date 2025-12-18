package sistema_gimnasio.modelo;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class entrenador extends persona {

    private String codigoen;
    private String enusuarioen="entrenador";
    private String encontraseñaen="entrenador123";

    public entrenador() {
        super();
    }

    public entrenador(String codigoen, String enusuarioen, String encontraseñaen) {
        this.codigoen = codigoen;
        this.enusuarioen = enusuarioen;
        this.encontraseñaen = encontraseñaen;
    }

    public entrenador(String codigoen, String enusuarioen, String encontraseñaen, String nombre, String apellido, String cedula, String email, String edad, String sexo, String nacionalidad) {
        super(nombre, apellido, cedula, email, edad, sexo, nacionalidad);
        this.codigoen = codigoen;
        this.enusuarioen = enusuarioen;
        this.encontraseñaen = encontraseñaen;
    }

    public String getCodigoen() {
        return codigoen;
    }

    public void setCodigoen(String codigoen) {
        this.codigoen = codigoen;
    }

    public String getEnusuarioen() {
        return enusuarioen;
    }

    public void setEnusuarioen(String enusuarioen) {
        this.enusuarioen = enusuarioen;
    }

    public String getEncontraseñaen() {
        return encontraseñaen;
    }

    public void setEncontraseñaen(String encontraseñaen) {
        this.encontraseñaen = encontraseñaen;
    }
    public void verclientes(){
        
    }

    @Override
    public String toString() {
        return super.toString()+"entrenador{" + "codigoen=" + codigoen + ", enusuarioen=" + enusuarioen + ", encontraseñaen=" + encontraseñaen + '}';
    }
    
    

    @Override
    public String calcularmensualidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
