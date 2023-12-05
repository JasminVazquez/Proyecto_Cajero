import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

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
            entrada.nextLine(); 
            
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
        entrada.nextLine(); 
        
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = entrada.nextLine();
        
        Cliente nuevoCliente = new Cliente(identificador, nombre, direccion);
        
        clientes.add(nuevoCliente);
        
        System.out.println("¡Registro exitoso!");
    }

    // Función para iniciar sesión como cliente existente
    public static void iniciarSesionCliente() {
        System.out.println("\nInicio de sesión:");

        System.out.print("Ingrese el identificador del cliente: ");
        int identificadorCliente = entrada.nextInt();
        entrada.nextLine(); 
        
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
    entrada.nextLine(); 

    switch (opcionOperacion) {
        case 1:
            System.out.println("\nCreación de nueva cuenta de débito:");
            System.out.print("Ingrese el tipo de cuenta (Cuenta de Ahorro o Cuenta de Cheques): ");
            String tipoCuenta = entrada.nextLine();
        
            // Crear una nueva cuenta de débito asociada al cliente actual
            CuentaDebito nuevaCuenta = new CuentaDebito(tipoCuenta, cliente, generarNumeroCuenta());
            cuentas.add(nuevaCuenta);
        
            System.out.println("¡Cuenta de débito creada exitosamente!");
            break;
            
        case 2:
            System.out.println("\nUso de cuenta de débito existente:");
            System.out.print("Ingrese el número de cuenta de débito: ");
            int numeroCuentaExistente = entrada.nextInt();
            entrada.nextLine(); 
        
            // Buscar la cuenta de débito en la lista utilizando su número
            CuentaDebito cuentaExistente = buscarCuentaPorNumero(numeroCuentaExistente);
        
            if (cuentaExistente != null && cuentaExistente.getCliente().equals(cliente)) {
                System.out.println("¡Usted está utilizando la cuenta: " + cuentaExistente.getNumeroCuenta() +
                        " - " + cuentaExistente.getTipo() + "!");
                // Implementar operaciones adicionales utilizando esta cuenta
            } else {
                System.out.println("La cuenta no existe o no está asociada a este cliente.");
            }
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
// Función para generar un número de cuenta único
public static int generarNumeroCuenta() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(91) + 10; // Genera un número aleatorio entre 0 y 90 y luego suma 10
        return numeroAleatorio;
}

// Función para buscar una cuenta de débito por su número
public static CuentaDebito buscarCuentaPorNumero(int numeroCuenta) {
    for (CuentaDebito cuenta : cuentas) {
        if (cuenta.getNumeroCuenta() == numeroCuenta) {
            return cuenta;
        }
    }
    return null; // Retorna null si no se encuentra la cuenta
}

    // Función para inicializar datos de ejemplo
    public static void inicializarDatos() {
        // Crear algunos clientes y cuentas de débito de ejemplo
        Cliente cliente1 = new Cliente(1, "Carlos", "Calle A");
        Cliente cliente2 = new Cliente(2, "María", "Calle B");
        

        CuentaDebito cuenta1 = new CuentaDebito("Cuenta de Ahorro", cliente1, 101);
        CuentaDebito cuenta2 = new CuentaDebito("Cuenta de Cheques", cliente1, 102);
        CuentaDebito cuenta3 = new CuentaDebito("Cuenta de Ahorro", cliente2, 201);
        CuentaDebito cuenta4 = new CuentaDebito("Cuenta de Cheques", cliente2, 202);
        

        clientes.add(cliente1);
        clientes.add(cliente2);
        
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
        cuentas.add(cuenta4);
        
    }

    // Agregar métodos para operaciones del cajero (retiro, transferencia, imprimir ticket, etc.)
}
