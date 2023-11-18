import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scnTeclado;

    public static void main(String[] args) {
        //BBDD
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Factura> listaFacaturas = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        ArrayList<Servicio> lsitaServicios = new ArrayList<>();
        //VARIABLES
        int opcion =0;
        String dato;
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

            Scanner scnTeclado = new Scanner(System.in);
            opcion = scnTeclado.nextInt();

            switch (opcion){
                case 1: {
                    for(int i=0 ; listaClientes.size();i++){
                        System.out.println(listaClientes.toString());
                    }
                }break;
                case 2:{

                }break;
                case 3:{

                }break;
                case 4:{
                    System.out.println("Datos de cliente:");
                    System.out.println("---------------------------------------");
                    System.out.print("1. Autonomo   ");
                    System.out.println("2. Sociedad");

                    scnTeclado = new Scanner(System.in);
                    opcion = scnTeclado.nextInt();

                    switch (opcion){
                        case 1:{
                            listaClientes.add(leerAutonomo());
                            scnTeclado = new Scanner(System.in);
                            dato = scnTeclado.nextLine();
                            listaClientes.add(leerAutonomo());
                        }
                        case 2:{
                            listaClientes.add(leerSociedad());
                            scnTeclado = new Scanner(System.in);
                            dato = scnTeclado.nextLine();
                            listaClientes.add(leerSociedad());
                        }
                    }
                }break;
                case 5:{
                    System.out.println("Cliente a borrar:");
                    System.out.println("---------------------------------------");
                    do {
                        int contador =0;
                        System.out.print(listaClientes.get(contador));
                        System.out.print(listaClientes.get(leerAutonomo().getCodgioCliente()));
                        System.out.print(listaClientes.get(leerAutonomo().getCodgioCliente()));
                        contador++;
                    }while (listaClientes<listaClientes.size());

                    }

                    scnTeclado = new Scanner(System.in);
                    dato = scnTeclado.nextLine();
                    if (posicion >= 0 && posicion < listaClientes.size() ){
                        listaClientes.remove(dato);
                    }else




                }break;

            }
        }while (opcion!=0);
    }


    public static Cliente leerAutonomo(){
        Autonomo autonomoNuevo = new Autonomo();
        System.out.println("nombre:");
        String dato = scnTeclado.nextLine();
        autonomoNuevo.setNombre(dato);

        System.out.println("Apellidos:");
        dato = scnTeclado.nextLine();
        autonomoNuevo.setApellidos(dato);

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

    public static Cliente leerSociedad(){
        Sociedad sociedadNueva = new Sociedad();
        System.out.println("Razon social:");
        String dato = scnTeclado.nextLine();
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

        System.out.println("Emamil:");
        dato = scnTeclado.nextLine();
        sociedadNueva.setEmail(dato);

        System.out.println("Telefonmo:");
        dato = scnTeclado.nextLine();
        sociedadNueva.setTelefono(dato);
        return sociedadNueva;
    }
    public static Cliente borrarCliente(){

    }
}