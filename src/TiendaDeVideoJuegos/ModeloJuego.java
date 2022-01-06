package TiendaDeVideoJuegos;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Artca
 */
public class ModeloJuego {
    public ArrayList<ModeloJuegos> getJuegos(){
        Connection con = Conectar.getConexion();
        Statement stmt;
        ResultSet rs;
        
        ArrayList<ModeloJuegos> listaJuegos = new ArrayList<>();
        
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * FROM video_juegos");
            
            while(rs.next()){
                ModeloJuegos juego = new ModeloJuegos();
                juego.setViju_nombre(rs.getString("viju_nombre"));
                listaJuegos.add(juego);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ModeloJuegos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaJuegos;
    }    
}
