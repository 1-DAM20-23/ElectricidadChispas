import java.util.Date;

public class Factura {
    private Integer codigoFactura;
    private Date fechaFactura;
    private Double baseImponible;
    private Double tipoIva;

    @Override
    public String toString() {
        return "Factura{" +
                "codigoFactura=" + codigoFactura +
                ", fechaFactura=" + fechaFactura +
                ", baseImponible=" + baseImponible +
                ", tipoIva=" + tipoIva +
                '}';
    }

    public Integer getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(Integer codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Double getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(Double baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Double getTipoIva() {
        return tipoIva;
    }

    public void setTipoIva(Double tipoIva) {
        this.tipoIva = tipoIva;
    }

    public void calcularIva (Double baseImponible){
        if (baseImponible >=0) {
            this.baseImponible *= (1.21);
        }
    }

}
