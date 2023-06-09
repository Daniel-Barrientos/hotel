package model.VO;

/**
 *
 * @author Hp
 */
public class Tipohabitacion {
    private Integer id;
    private String descripcion;
    private Integer tarifa;
    private Integer cantidad;

    public Tipohabitacion() {
    }

    public Tipohabitacion(Integer id, String descripcion, Integer tarifa, Integer cantidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.tarifa = tarifa;
        this.cantidad = cantidad;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
