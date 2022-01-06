package TiendaDeVideoJuegos;

/**
 *
 * @author Artca
 */
public class ModeloAlquiler {
    private Integer viju_id;
    private Integer pers_id;
    private String alju_alquiler_activo;
    private String alju_fecha_inicio_alquiler;
    private String alju_fecha_fin_alquiler;

    public Integer getViju_id() {
        return viju_id;
    }

    public void setViju_id(Integer viju_id) {
        this.viju_id = viju_id;
    }

    public Integer getPers_id() {
        return pers_id;
    }

    public void setPers_id(Integer pers_id) {
        this.pers_id = pers_id;
    }

    public String getAlju_alquiler_activo() {
        return alju_alquiler_activo;
    }

    public void setAlju_alquiler_activo(String alju_alquiler_activo) {
        this.alju_alquiler_activo = alju_alquiler_activo;
    }

    public String getAlju_fecha_inicio_alquiler() {
        return alju_fecha_inicio_alquiler;
    }

    public void setAlju_fecha_inicio_alquiler(String alju_fecha_inicio_alquiler) {
        this.alju_fecha_inicio_alquiler = alju_fecha_inicio_alquiler;
    }

    public String getAlju_fecha_fin_alquiler() {
        return alju_fecha_fin_alquiler;
    }

    public void setAlju_fecha_fin_alquiler(String alju_fecha_fin_alquiler) {
        this.alju_fecha_fin_alquiler = alju_fecha_fin_alquiler;
    }
    
    
}
