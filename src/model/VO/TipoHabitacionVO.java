package model.VO;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class TipoHabitacionVO {

    private Integer id;
    private String descripcion;
    private Integer tarifa;
    private Integer cantifad;

    public TipoHabitacionVO() {
    }

    public TipoHabitacionVO(Integer id, String descripcion, Integer tarifa, Integer cantifad) {
        this.id = id;
        this.descripcion = descripcion;
        this.tarifa = tarifa;
        this.cantifad = cantifad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTarifa() {
        return tarifa;
    }

    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getCantifad() {
        return cantifad;
    }

    public void setCantifad(Integer cantifad) {
        this.cantifad = cantifad;
    }

}
