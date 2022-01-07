package TiendaDeVideoJuegos;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Artca
 */
public class ControlPersonas {
    private Conectar conectar;
    private ModeloPersonas modelo;
    private Connection con;
    
    public ControlPersonas(){
        conectar = new Conectar();
        modelo = new ModeloPersonas();
    }
    
    public void insertar(String pers_sexo,String pers_nombres,String pers_apellidos,String pers_documento,String pers_edad,String pers_direccion,String pers_telefono,String pers_celular,String pers_correo_electronico){
        PreparedStatement ps;
        String sql;
        modelo.setPers_sexo(pers_sexo);
        modelo.setPers_nombres(pers_nombres);
        modelo.setPers_apellidos(pers_apellidos);
        modelo.setPers_documento(pers_documento);
        modelo.setPers_edad(pers_edad);
        modelo.setPers_direccion(pers_direccion);
        modelo.setPers_telefono(pers_telefono);
        modelo.setPers_celular(pers_celular);
        modelo.setPers_correo_electronico(pers_correo_electronico);
        try{
            con = conectar.getConexion();
            sql = "insert into personas(pers_sexo, pers_nombres, pers_apellidos, pers_documento, pers_edad, pers_direccion, pers_telefono, pers_celular, pers_correo_electronico) values(?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,modelo.getPers_sexo());
            ps.setString(2, modelo.getPers_nombres());
            ps.setString(3, modelo.getPers_apellidos());
            ps.setString(4, modelo.getPers_documento());
            ps.setString(5, modelo.getPers_edad());
            ps.setString(6, modelo.getPers_direccion());
            ps.setString(7, modelo.getPers_telefono());
            ps.setString(8, modelo.getPers_celular());
            ps.setString(9, modelo.getPers_correo_electronico());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexion " + e.getMessage());
        }
 } 
}
