
package tiendas;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class los_montes extends supermercado {
    private String empleado;

    public los_montes() {
        super();
    }

    public los_montes(String empleado, String nombre, int nit, String direccion, int num_clientes) {
        super(nombre, nit, direccion, num_clientes);
        this.empleado = empleado;
    }

    public los_montes(String empleado) {
        this.empleado = empleado;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
    
    

    @Override
    public double vender() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double cajero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String mostrar(){
        return super.toString()+"\n empleado del mes: "+this.empleado;
    }
    

}
