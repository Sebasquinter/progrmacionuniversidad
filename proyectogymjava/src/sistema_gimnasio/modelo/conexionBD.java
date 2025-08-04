
package sistema_gimnasio.modelo;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class conexionBD {
   private static Connection  conn;
 private static final String driver="com.mysql.jdbc.Driver";
   
    /* metodo para conectar a la base de datos*/
public  conexionBD(){
   conn = null;
 
  try{
     Class.forName(driver);
     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_clientes","root","");
     if(conn != null){
         System.out.println("Conexion Establecida..");
     }
     
   } catch (ClassNotFoundException | SQLException e){
       System.out.println("Error al conectar"+e);
   }
 }
 /*Metodo que retorna la coneccion*/
 public Connection getConnection(){
  return conn;
}
  /*Metodo para desconectarnos de la base de datos*/
public void desconectar(){
  conn = null;
  if(conn==null){
      System.out.println("Conexion Terminada");
  }
 }



    
   

}
