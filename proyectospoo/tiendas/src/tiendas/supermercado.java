
package tiendas;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public abstract class supermercado {
    private String nombre;
    private int nit;
    private String direccion;
    private int num_clientes;

    public supermercado() {
        super();
    }

    public supermercado(String nombre) {
        this.nombre = nombre;
    }
    
    

    public supermercado(String nombre, int nit, String direccion, int num_clientes) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.num_clientes = num_clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNum_clientes() {
        return num_clientes;
    }

    public void setNum_clientes(int num_clientes) {
        this.num_clientes = num_clientes;
    }
    public abstract double vender();
    public abstract double cajero();

    @Override
    public String toString() {
        return "\n************************\n"+
                "\nsupermercado= " + this.nombre + 
                "\nnit=" + this.nit + 
                "\ndireccion=" + this.direccion + 
                "\nnumero de clientes=" + this.num_clientes;
    }
    
    
    
    
    

}
