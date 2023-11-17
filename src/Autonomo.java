public class Autonomo extends Cliente {
    private String nombre;
    private String apellidos;
    private String dni;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Autonomo{" +
                "codgioCliente=" + codgioCliente +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", codgioCliente=" + codgioCliente +
                ", direccionPostal='" + direccionPostal + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", provincia='" + provincia + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +

                '}';
    }
}
