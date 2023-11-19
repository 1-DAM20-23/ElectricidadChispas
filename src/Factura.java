import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private Integer codigoFactura;
    private Date fechaFactura;
    private ArrayList<Integer[]> productos;
    private ArrayList<Integer[]> servicios;
    private Integer cliente;



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
}
