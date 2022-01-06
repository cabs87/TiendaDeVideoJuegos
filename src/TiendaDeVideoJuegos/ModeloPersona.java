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
public class ModeloPersona {
   public ArrayList<ModeloPersonas> getPersonas(){
        Connection con = Conectar.getConexion();
        Statement stmt;
        ResultSet rs;
        
        ArrayList<ModeloPersonas> listaPersonas = new ArrayList<>();
        
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * FROM personas");
            
            while(rs.next()){
                ModeloPersonas persona = new ModeloPersonas();
                persona.setPers_nombres(rs.getString("pers_nombres"));
                listaPersonas.add(persona);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersonas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPersonas;
    }  
}
