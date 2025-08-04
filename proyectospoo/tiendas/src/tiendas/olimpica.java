
package tiendas;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class olimpica extends supermercado {
    private String aniversario;

    public olimpica() {
        super();
    }

    public olimpica(String aniversario, String nombre, int nit, String direccion, int num_clientes) {
        super(nombre, nit, direccion, num_clientes);
        this.aniversario = aniversario;
    }

    public olimpica(String aniversario) {
        this.aniversario = aniversario;
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
        
        return super.toString()+"\naniversario:"+ this.aniversario;
    }

}
