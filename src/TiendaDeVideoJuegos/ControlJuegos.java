package TiendaDeVideoJuegos;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Artca
 */
public class ControlJuegos {
    private Conectar conectar;
    private ModeloJuegos modelo;
    private Connection con;
    
    public ControlJuegos(){
      conectar = new Conectar();
      modelo = new ModeloJuegos();
    }
    
    public void insertar(String viju_titulo,String viju_nombre,String viju_ano,String viju_protagonistas,String viju_director,String viju_productor,String viju_tecnologia,Integer viju_precio_alquiler,Integer viju_stock){
        PreparedStatement ps;
        String sql;
        modelo.setViju_titulo(viju_titulo);
        modelo.setViju_nombre(viju_nombre);
        modelo.setViju_ano(viju_ano);
        modelo.setViju_protagonistas(viju_protagonistas);
        modelo.setViju_director(viju_director);
        modelo.setViju_productor(viju_productor);
        modelo.setViju_tecnologia(viju_tecnologia);
        modelo.setViju_precio_alquiler(viju_precio_alquiler);
        modelo.setViju_stock(viju_stock);
    try{
        con = conectar.getConexion();
        sql = "insert into video_juegos(viju_titulo, viju_nombre, viju_ano, viju_protagonistas, viju_director, viju_productor, viju_tecnologia, viju_precio_alquiler, viju_stock) values(?,?,?,?,?,?,?,?,?)";
        ps = con.prepareStatement(sql);
        ps.setString(1,modelo.getViju_titulo());
        ps.setString(2, modelo.getViju_nombre());
        ps.setString(3, modelo.getViju_ano());
        ps.setString(4, modelo.getViju_protagonistas());
        ps.setString(5, modelo.getViju_director());
        ps.setString(6, modelo.getViju_productor());
        ps.setString(7, modelo.getViju_tecnologia());
        ps.setInt(8, modelo.getViju_precio_alquiler());
        ps.setInt(9, modelo.getViju_stock()); 

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se han insertado los datos");
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null, "Error de conexion " + e.getMessage());
      }
   }
}  
