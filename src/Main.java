import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //VARIABLES
    public static Scanner scnTeclado;
    public static int opcion = 0;
    public static String dato;
    public static int posicion;
    public static int codigoCliente=0;
    //BBDD
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    public static ArrayList<Factura> listaFacturas = new ArrayList<>();
    public static ArrayList<Producto> listaProductos = new ArrayList<>();
    public static ArrayList<Servicio> lsitaServicios = new ArrayList<>();

    public static void main(String[] args) {


        //MENU
        do {

            System.out.println("Menu:");
            System.out.println("-------------------------------------------");
            System.out.print("1. clientes           ");
            System.out.println("6. nuevo cliente    ");
            System.out.print("2. productos          ");
            System.out.println("7. Nuevo producto   ");
            System.out.print("3. facturas           ");
            System.out.println("8. nueva factura    ");
            System.out.print("4. servicios          ");
            System.out.println("9. nuevo servicio   ");
            System.out.print("5. borrar cliente     ");
            System.out.println("10. borrar facatura ");
            System.out.println("               0. salir");

            scnTeclado = new Scanner(System.in);
            opcion = scnTeclado.nextInt();

            switch (opcion) {
                case 1: {
                    listarClientes();
                    break;
                }

                case 2: {
                    break;
                }

                case 3: {
                    break;
                }

                case 4: {

                    break;
                }

                case 5: {
                    borrarCliente();
                    break;
                }
                case 6: {
                    crearCliente();
                    break;
                }
            }
        } while (opcion != 0);
    }
    //Methods
    public static void crearCliente() {
        System.out.println("Datos de cliente:");
        System.out.println("---------------------------------------");
        System.out.print("1. Autonomo   ");
        System.out.println("2. Sociedad");

        scnTeclado = new Scanner(System.in);

        opcion = scnTeclado.nextInt();

        switch (opcion) {
            case 1: {
                listaClientes.add(leerAutonomo());
                break;
            }
            case 2: {
                listaClientes.add(leerSociedad());
                break;
            }
        }
    }
    public static void borrarCliente() {
        System.out.println("seleccione cliente a borrar:");
        System.out.println("---------------------------------------");
        for (int contador = 1; contador <= listaClientes.size(); contador++) {
            System.out.print(contador + ". ");
            if (listaClientes.get(contador-1).esAutonomo) {
                Autonomo t = (Autonomo) listaClientes.get(contador-1);
                System.out.println(t.getNombre());
            } else {
                Sociedad t = (Sociedad) listaClientes.get(contador-1);
                System.out.println(t.getRazonSocial());
            }
        }
        System.out.println("0. Salir");
        System.out.println("Cliente a borrar:");
        scnTeclado = new Scanner(System.in);
        posicion = scnTeclado.nextInt();
        if (posicion==0){
            System.out.println("borrado anulado");
        }else if (posicion > 0 && posicion < listaClientes.size()) {
            listaClientes.remove(posicion-1);
            System.out.println("Cliente borrado");
        }

    }
    public static void listarClientes() {
        System.out.println("Listado de clientes: ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(listaClientes.get(i).toString());
        }
    }
    public static Cliente leerAutonomo() {
        Autonomo autonomoNuevo = new Autonomo();

        autonomoNuevo.setCodigocliente(++codigoCliente);
        autonomoNuevo.esAutonomo=true;

        String dato = scnTeclado.nextLine();
        System.out.println("nombre:");
        dato = scnTeclado.nextLine();
        autonomoNuevo.setNombre(dato);

        System.out.println("Apellidos:");
        dato = scnTeclado.nextLine();
        autonomoNuevo.setApellidos(dato);

        System.out.println("Dni:");
        dato = scnTeclado.nextLine();
        autonomoNuevo.setDni(dato);

        System.out.println("Direccion postal:");
        dato = scnTeclado.nextLine();
        autonomoNuevo.setDireccionPostal(dato);

        System.out.println("Poablacion:");
        dato = scnTeclado.nextLine();
        autonomoNuevo.setPoblacion(dato);

        System.out.println("Provincia:");
        dato = scnTeclado.nextLine();
        autonomoNuevo.setProvincia(dato);

        System.out.println("Email:");
        dato = scnTeclado.nextLine();
        autonomoNuevo.setEmail(dato);

        System.out.println("Telefono:");
        dato = scnTeclado.nextLine();
        autonomoNuevo.setTelefono(dato);
        return autonomoNuevo;
    }

    public static Cliente leerSociedad() {
        Sociedad sociedadNueva = new Sociedad();

        sociedadNueva.setCodigocliente(++codigoCliente);
        sociedadNueva.esAutonomo=false;

        String dato = scnTeclado.nextLine();
        System.out.println("Razon social:");
        dato = scnTeclado.nextLine();
        sociedadNueva.setRazonSocial(dato);

        System.out.println("Cif:");
        dato = scnTeclado.nextLine();
        sociedadNueva.setCif(dato);

        System.out.println("Direccion postal:");
        dato = scnTeclado.nextLine();
        sociedadNueva.setDireccionPostal(dato);

        System.out.println("Poblacion:");
        dato = scnTeclado.nextLine();
        sociedadNueva.setPoblacion(dato);

        System.out.println("Provincia:");
        dato = scnTeclado.nextLine();
        sociedadNueva.setProvincia(dato);

        System.out.println("email:");
        dato = scnTeclado.nextLine();
        sociedadNueva.setEmail(dato);

        System.out.println("Telefonmo:");
        dato = scnTeclado.nextLine();
        sociedadNueva.setTelefono(dato);
        return sociedadNueva;
    }
}