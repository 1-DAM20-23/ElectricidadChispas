public class Sociedad extends Cliente{
    private String razonSocial;
    private String cif;

    @Override
    public String toString() {
        return "Sociedad{" +
                "codgioCliente=" + codgioCliente +
                ", razonSocial='" + razonSocial + '\'' +
                ", cif='" + cif + '\'' +
                ", codgioCliente=" + codgioCliente +
                ", direccionPostal='" + direccionPostal + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", provincia='" + provincia + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
