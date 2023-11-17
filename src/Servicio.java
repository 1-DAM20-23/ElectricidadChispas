public class Servicio {
    private Integer codigoServicio;
    private String nombreServicio;
    private Double precioServicio;

    @Override
    public String toString() {
        return "Servicio{" +
                "codigoServicio=" + codigoServicio +
                ", nombreServicio='" + nombreServicio + '\'' +
                ", precioServicio=" + precioServicio +
                ", tipoIva=" + tipoIva +
                '}';
    }

    public Integer getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(Integer codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public Double getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(Double precioServicio) {
        this.precioServicio = precioServicio;
    }

    public Double getTipoIva() {
        return tipoIva;
    }

    public void setTipoIva(Double tipoIva) {
        this.tipoIva = tipoIva;
    }

    private Double tipoIva;
}
