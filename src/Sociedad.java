public class Sociedad {
    private String razonSocial;
    private String cif;

    @Override
    public String toString() {
        return "Sociedad{" +
                "razonSocial='" + razonSocial + '\'' +
                ", cif='" + cif + '\'' +
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
