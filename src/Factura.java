import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private Integer codigoFactura;
    private Date fechaFactura;
    private ArrayList<Producto[]> productos;
    private ArrayList<Servicio[]> servicios;
    private Cliente cliente;



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
