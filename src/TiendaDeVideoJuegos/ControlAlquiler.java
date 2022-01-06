package TiendaDeVideoJuegos;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Artca
 */
public class ControlAlquiler {
    private Conectar conectar;
    private ModeloAlquiler modelo;
    private Connection con;
    
    public ControlAlquiler(){
      conectar = new Conectar();
      modelo = new ModeloAlquiler();
    }
    public void insertar(Integer viju_id,Integer pers_id,String alju_alquiler_activo,String alju_fecha_inicio_alquiler,String alju_fecha_fin_alquiler){
        PreparedStatement ps;
        String sql;
        modelo.setViju_id(viju_id);
        modelo.setPers_id(pers_id);
        modelo.setAlju_alquiler_activo(alju_alquiler_activo);
        modelo.setAlju_fecha_inicio_alquiler(alju_fecha_inicio_alquiler);
        modelo.setAlju_fecha_fin_alquiler(alju_fecha_fin_alquiler);
    try{
        con = conectar.getConexion();
        sql = "insert into alquiler_juegos(viju_id, pers_id, alju_alquiler_activo, alju_fecha_inicio_alquiler, alju_fecha_fin_alquiler) values(?,?,?,?,?)";
        ps = con.prepareStatement(sql);
        ps.setInt(1, modelo.getViju_id());
        ps.setInt(2, modelo.getPers_id());
        ps.setString(3, modelo.getAlju_alquiler_activo());
        ps.setString(4, modelo.getAlju_fecha_inicio_alquiler());
        ps.setString(5, modelo.getAlju_fecha_fin_alquiler());

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se han insertado los datos");
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null, "Error de conexion " + e.getMessage());
      }
    }
}
