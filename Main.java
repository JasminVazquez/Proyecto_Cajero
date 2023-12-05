import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<CuentaDebito> cuentas = new ArrayList<>();

    public static void main(String[] args) {
        // Crear clientes y cuentas de débito de ejemplo
        inicializarDatos();

        System.out.println("Bienvenido al Cajero Automático BBVA");

        int opcion;
        do {
            System.out.println("\n1. Registrarse como nuevo cliente");
            System.out.println("2. Iniciar sesión como cliente existente");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer de entrada
            
            switch (opcion) {
                case 1:
                    registrarNuevoCliente();
                    break;
                case 2:
                    iniciarSesionCliente();
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestro servicio. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }

    // Función para registrar un nuevo cliente
    public static void registrarNuevoCliente() {
        System.out.println("\nRegistro de nuevo cliente:");
        System.out.print("Ingrese el identificador del cliente: ");
        int identificador = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer de entrada
        
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = entrada.nextLine();
        
        // Crear un nuevo objeto Cliente con los datos ingresados
        Cliente nuevoCliente = new Cliente(identificador, nombre, direccion);
        
        // Agregar el nuevo cliente a la lista de clientes
        clientes.add(nuevoCliente);
        
        System.out.println("¡Registro exitoso!");
    }

    // Función para iniciar sesión como cliente existente
    public static void iniciarSesionCliente() {
        System.out.println("\nInicio de sesión:");

        System.out.print("Ingrese el identificador del cliente: ");
        int identificadorCliente = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer de entrada
        
        // Buscar el cliente en la lista utilizando su identificador
        Cliente clienteEncontrado = buscarClientePorIdentificador(identificadorCliente);
        
        if (clienteEncontrado != null) {
            System.out.println("¡Bienvenido, " + clienteEncontrado.getNombre() + "!");
            mostrarOpcionesOperaciones(clienteEncontrado);
        } else {
            System.out.println("Cliente no encontrado. Verifique el identificador e intente de nuevo.");
        }
    }
    
// Función para buscar un cliente por su identificador
public static Cliente buscarClientePorIdentificador(int identificador) {
    for (Cliente cliente : clientes) {
        if (cliente.getIdentificador() == identificador) {
            return cliente;
        }
    }
    return null; // Retorna null si no se encuentra el cliente
}

// Función para mostrar las opciones de operaciones disponibles para el cliente
public static void mostrarOpcionesOperaciones(Cliente cliente) {
    System.out.println("\nOpciones disponibles:");
    System.out.println("1. Crear nueva cuenta de débito");
    System.out.println("2. Usar cuenta de débito existente");
    System.out.println("0. Cerrar sesión");

    System.out.print("Ingrese la opción deseada: ");
    int opcionOperacion = entrada.nextInt();
    entrada.nextLine(); // Limpiar el buffer de entrada

    switch (opcionOperacion) {
        case 1:
            // Implementar lógica para crear nueva cuenta de débito
            break;
        case 2:
            // Implementar lógica para usar cuenta de débito existente
            break;
        case 0:
            System.out.println("Sesión cerrada. ¡Hasta luego!");
            break;
        default:
            System.out.println("Opción no válida. Intente de nuevo.");
            mostrarOpcionesOperaciones(cliente); // Mostrar opciones nuevamente
            break;
    }
}

    // Función para inicializar datos de ejemplo
    public static void inicializarDatos() {
        // Crear algunos clientes y cuentas de débito de ejemplo
        Cliente cliente1 = new Cliente(1, "Carlos", "Calle A");
        Cliente cliente2 = new Cliente(2, "María", "Calle B");
        // Agregar más clientes si es necesario...

        CuentaDebito cuenta1 = new CuentaDebito("Cuenta de Ahorro", cliente1, 101);
        CuentaDebito cuenta2 = new CuentaDebito("Cuenta de Cheques", cliente1, 102);
        CuentaDebito cuenta3 = new CuentaDebito("Cuenta de Ahorro", cliente2, 201);
        CuentaDebito cuenta4 = new CuentaDebito("Cuenta de Cheques", cliente2, 202);
        // Agregar más cuentas si es necesario...

        clientes.add(cliente1);
        clientes.add(cliente2);
        // Agregar más clientes a la lista si es necesario...

        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
        cuentas.add(cuenta4);
        // Agregar más cuentas a la lista si es necesario...
    }

    // Agregar métodos para operaciones del cajero (retiro, transferencia, imprimir ticket, etc.)
}
