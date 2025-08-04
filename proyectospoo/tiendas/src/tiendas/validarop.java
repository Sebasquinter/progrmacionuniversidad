
package tiendas;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class validarop {
    public boolean opcion(int op){
        if(op <=0 || op> 15){
            return false; 
        }else{
            return true;
        }
    }

}
