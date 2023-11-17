public class Producto {
    private Integer codigoProducto;
    private String nombreProducto;
    private String maracaProducto;
    private String modeloProdcuto;

    @Override
    public String toString() {
        return "Producto{" +
                "codigoProducto=" + codigoProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", maracaProducto='" + maracaProducto + '\'' +
                ", modeloProdcuto='" + modeloProdcuto + '\'' +
                ", precioProducto=" + precioProducto +
                '}';
    }

    private Double precioProducto;

    public Integer getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMaracaProducto() {
        return maracaProducto;
    }

    public void setMaracaProducto(String maracaProducto) {
        this.maracaProducto = maracaProducto;
    }

    public String getModeloProdcuto() {
        return modeloProdcuto;
    }

    public void setModeloProdcuto(String modeloProdcuto) {
        this.modeloProdcuto = modeloProdcuto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }
}
