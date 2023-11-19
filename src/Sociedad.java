public class Sociedad extends Cliente{
    private String razonSocial;
    private String cif;

    public  void Sociedad(){
        esAutonomo=false;
    }

    @Override
    public String toString() {
        return "Sociedad{" +
                "codigocliente=" + codigocliente +
                ", razonSocial='" + razonSocial + '\'' +
                ", cif='" + cif + '\'' +
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
