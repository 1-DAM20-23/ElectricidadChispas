import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //BBDD
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Factura> listaFacaturas = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        ArrayList<Servicio> lsitaServicios = new ArrayList<>();
        //VARIABLES

        int opcion =0;
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
                    System.out.println(listaClientes);
                }break;
                case 2:{
                    System.out.println(listaProductos);
                }break;
                case 3:{
                    System.out.println(listaFacaturas);
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
                            /*
                            System.out.println("Nombre:");
                            scnTeclado = new Scanner(System.in);
                             String dato = scnTeclado.nextLine();
                            new Autonomo().setNombre(dato);
                            listaClientes.add(dato);
                            System.out.println("Apellidos:");
                            scnTeclado = new Scanner(System.in);
                            dato = scnTeclado.nextLine();
                            new Autonomo().setApellidos(dato);
                            listaClientes.add(dato);
                            System.out.println("Dni:");
                            scnTeclado = new Scanner(System.in);
                            dato = scnTeclado.nextLine();
                            new Autonomo().setDni(dato);
                            listaClientes.add(dato);
                            System.out.println("Direccion Postal:");
                            scnTeclado = new Scanner(System.in);
                            dato = scnTeclado.nextLine();
                            new Autonomo().setDireccionPostal(dato);
                            listaClientes.add(dato);
                            System.out.println("Poblacion:");
                            scnTeclado = new Scanner(System.in);
                            dato = scnTeclado.nextLine();
                            new Autonomo().setPoblacion(dato);
                            listaClientes.add(dato);
                            System.out.println("Provincia:");
                            scnTeclado = new Scanner(System.in);
                            dato = scnTeclado.nextLine();
                            new Autonomo().setProvincia(dato);
                            listaClientes.add(dato);
                            System.out.println("Email:");
                            scnTeclado = new Scanner(System.in);
                            dato = scnTeclado.nextLine();
                            new Autonomo().setEmail(dato);
                            listaClientes.add(dato);
                            System.out.println("Telefono:");
                            scnTeclado = new Scanner(System.in);
                            dato = scnTeclado.nextLine();
                            new Autonomo().setApellidos(dato);
                            listaClientes.add(dato);
                            */
                        }
                        case 2:{
                            System.out.println("Nombre empresa:");
                            System.out.println("Cif:");
                            System.out.println("Direccion Postal:");
                            System.out.println("Poblacion:");
                            System.out.println("Provincia:");
                            System.out.println("Email:");
                            System.out.println("Apellidos:");
                            System.out.println("Telefono:");
                        }
                    }
                }break;
            }
        }while (opcion!=0);
    }

}