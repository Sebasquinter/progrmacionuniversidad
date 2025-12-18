package sistema_gimnasio.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class DAO {
    private ResultSet RS;
    conexionBD cc = new conexionBD();
    Connection con = cc.getConnection();
    private PreparedStatement PS;
    
    public void registrar(String nombre1, String apellido1, String cedula1, String email1, String edad1, String opradio, String nacionalidad1, String codigo1, String valor_mensualidad1) {
        String nombre = nombre1;
        String apellido = apellido1;
        int cedula = Integer.parseInt(cedula1);
        String email = email1;
        int edad = Integer.parseInt(edad1);
        String sexo = opradio;
        String nacionalidad = nacionalidad1;
        int codigo = Integer.parseInt(codigo1);
        int valor_mensualidad = Integer.parseInt(valor_mensualidad1);
        
        System.out.println("Datos a insertar:");
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("cedula: " + cedula);
        System.out.println("email: " + email);
        System.out.println("edad: " + edad);
        System.out.println("sexo: " + sexo);
        System.out.println("nacionalidad: " + nacionalidad);
        System.out.println("codigo: " + codigo);
        System.out.println("valor_mensualidad: " + valor_mensualidad);
        
        String SQL = "INSERT INTO cliente2(nombre, apellido, cedula, email, edad, sexo, nacionalidad, codigo, valor_mensualidad) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = null;
        
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setInt(3, cedula);
            pst.setString(4, email);
            pst.setInt(5, edad);
            pst.setString(6, sexo);
            pst.setString(7, nacionalidad);
            pst.setInt(8, codigo);
            pst.setInt(9, valor_mensualidad);
            
            // Ejecutar la consulta
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se insertó con éxito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        } finally {
            // Cerrar PreparedStatement
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            // Cerrar Connection
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
