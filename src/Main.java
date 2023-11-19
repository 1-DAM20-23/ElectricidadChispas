import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    //VARIABLES
    public static Scanner scnTeclado;
    public static int opcion = 0;
    public static String dato;
    public static int posicion;
    public static int codigoCliente = 0;

    public static int codigoProducto = 0;

    public static int codigoServicios = 0;

    public static int codigoFactura = 0;
    //BBDD
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();


    public static ArrayList<Factura> listaFacturas = new ArrayList<>();
    public static ArrayList<Producto> listaProductos = new ArrayList<>();
    public static ArrayList<Servicio> listaServicios = new ArrayList<>();

    public static void main(String[] args) {



        //MENU
        do {

            System.out.println("Menu:");
            System.out.println("-----------------------------------------------------------------");
            System.out.print("1. clientes       ");
            System.out.print("5. nuevo cliente    ");
            System.out.println("9. borrar cliente   ");
            System.out.print("2. productos      ");
            System.out.print("6. Nuevo producto   ");
            System.out.println("10. borrar producto ");
            System.out.print("3. servicios      ");
            System.out.print("7. nueva servicio   ");
            System.out.println("11. borrar servicio ");
            System.out.print("4. facturas       ");
            System.out.print("8. nuevo factura    ");
            System.out.println("0. salir          ");

            scnTeclado = new Scanner(System.in);
            opcion = scnTeclado.nextInt();

            switch (opcion) {
                case 1: {
                    listar("Clientes", listaClientes);
                    break;
                }
                case 2: {
                    listar("Productos", listaProductos);
                    break;
                }
                case 3: {
                    listar("Servicios", listaServicios);
                    break;
                }
                case 4: {
                    listar("Facturas", listaFacturas);
                    break;
                }
                case 5: {
                    crearCliente();
                    break;
                }


                case 6: {
                    crearProducto();
                    break;
                }
                case 7: {
                    crearServicio();
                    break;
                }
                case 8: {
                    crearFactura();
                    break;
                }
                case 9: {
                    borrarCliente();
                    break;
                }
                case 10: {
                    borrarProducto();
                    break;
                }
                case 11: {
                    borraServicio();
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
            if (listaClientes.get(contador - 1).esAutonomo) {
                Autonomo t = (Autonomo) listaClientes.get(contador - 1);
                System.out.println(t.getNombre());
            } else {
                Sociedad t = (Sociedad) listaClientes.get(contador - 1);
                System.out.println(t.getRazonSocial());
            }
        }
        System.out.println("0. Salir");
        System.out.println("Cliente a borrar:");
        scnTeclado = new Scanner(System.in);
        posicion = scnTeclado.nextInt();
        if (posicion == 0) {
            System.out.println("borrado anulado");
        } else if (posicion > 0 && posicion < listaClientes.size()) {
            listaClientes.remove(posicion - 1);
            System.out.println("Cliente borrado");
        }

    }

    public static void crearProducto() {
        System.out.println("Datos del prducto:");
        System.out.println("---------------------------------------");
        listaProductos.add(leerProducto());

    }

    public static void borrarProducto() {
        System.out.println("Seleccione producto a borrar:");
        System.out.println("---------------------------------------");

        for (int i = 1; i <= listaProductos.size(); i++) {
            System.out.print(i + ". ");
            System.out.println(listaProductos.get(i).getNombreProducto());
        }
        System.out.println("0. Salir");
        int intDato = scnTeclado.nextInt();
        if (intDato != 0) {
            listaProductos.remove(intDato - 1);
        }
    }

    public static void crearServicio() {
        System.out.println("Datos del servicio:");
        System.out.println("---------------------------------------");
        listaServicios.add(leerServicio());
    }

    public static void borraServicio() {
        System.out.println("Seleccione servicio a borrar:");
        System.out.println("---------------------------------------");

        for (int i = 1; i <= listaServicios.size(); i++) {
            System.out.print(i + ". ");
            System.out.println(listaServicios.get(i).getNombreServicio());
        }
        System.out.println("0. Salir");
        int intDato = scnTeclado.nextInt();
        if (intDato != 0) {
            listaServicios.remove(intDato - 1);
        }
    }

    public static void crearFactura() {
        System.out.println("DAtos de la Factura:");
        System.out.println("---------------------------------------");
        listaFacturas.add(leerFactura());
    }

    public static void listar(String texto, ArrayList lista) {
        System.out.println("Listado de " + texto + ": ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }

    public static Cliente leerAutonomo() {
        Autonomo autonomoNuevo = new Autonomo();

        autonomoNuevo.setCodigocliente(++codigoCliente);

        dato = scnTeclado.nextLine();
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

        dato = scnTeclado.nextLine();
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

        System.out.println("Telefono:");
        dato = scnTeclado.nextLine();
        sociedadNueva.setTelefono(dato);
        return sociedadNueva;
    }

    public static Producto leerProducto() {
        Producto productoNuevo = new Producto();

        productoNuevo.setCodigoProducto(++codigoProducto);

        dato = scnTeclado.nextLine();
        System.out.println("Nombre: ");
        dato = scnTeclado.nextLine();
        productoNuevo.setNombreProducto(dato);

        System.out.println("Marca: ");
        dato = scnTeclado.nextLine();
        productoNuevo.setMaracaProducto(dato);

        System.out.println("Modelo: ");
        dato = scnTeclado.nextLine();
        productoNuevo.setModeloProdcuto(dato);

        System.out.println("Precio: ");
        Double datoNumeros = scnTeclado.nextDouble();
        productoNuevo.setPrecioProducto(datoNumeros);

        System.out.println("tipo IVA: ");
        int intDato = scnTeclado.nextInt();
        productoNuevo.setTipoIva(intDato);

        return productoNuevo;
    }

    public static Servicio leerServicio() {
        Servicio servicioNuevo = new Servicio();
        servicioNuevo.setCodigoServicio(++codigoServicios);
        dato = scnTeclado.nextLine();

        System.out.println("Nombre: ");
        dato = scnTeclado.nextLine();
        servicioNuevo.setNombreServicio(dato);

        System.out.println("Precio Servicio: ");
        Double datoNumeros = scnTeclado.nextDouble();
        servicioNuevo.setPrecioServicio(datoNumeros);

        System.out.println("Tipo IVA: ");
        int intDato = scnTeclado.nextInt();
        servicioNuevo.setTipoIva(intDato);

        return servicioNuevo;
    }

    public static Factura leerFactura() {
        Factura nuevaFactura = new Factura();
        dato = scnTeclado.nextLine();
        nuevaFactura.setCodigoFactura(++codigoFactura);

        nuevaFactura.setFechaFactura(new Date());

        System.out.println("Seleccione cliente:");
        for (int contador = 1; contador <= listaClientes.size(); contador++) {
            System.out.print(contador + ". ");
            if (listaClientes.get(contador-1).esAutonomo){
                Autonomo t = (Autonomo)listaClientes.get(contador-1);
                System.out.println(t.getNombre());
            }else{
                Sociedad t = (Sociedad) listaClientes.get(contador-1);
                System.out.println(t.getRazonSocial());
            }
        }
            int intDato =scnTeclado.nextInt();

        return nuevaFactura;
    }
}