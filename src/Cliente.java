public class Cliente {
    private Integer codgioCliente;
    private  String direccionPostal;
    private String poblacion;
    private String provincia;

    @Override
    public String toString() {
        return "Cliente{" +
                "codgioCliente=" + codgioCliente +
                ", direccionPostal='" + direccionPostal + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", provincia='" + provincia + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    public Integer getCodgioCliente() {
        return codgioCliente;
    }

    public void setCodgioCliente(Integer codgioCliente) {
        this.codgioCliente = codgioCliente;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private String email;
    private String telefono;
}
