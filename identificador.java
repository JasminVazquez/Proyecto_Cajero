
import java.util.UUID; // Importa la clase UUID

public class identificador {
    
    public static String generarIdentificadorTransaccion() {
        UUID uuid = UUID.randomUUID(); // Genera un UUID aleatorio
        return uuid.toString(); // Convierte el UUID a String y lo devuelve como identificador de transacción
    }
    
    // Ejemplo de uso
    public static void main(String[] args) {
        String identificadorTransaccion = generarIdentificadorTransaccion();
        System.out.println("Identificador de transacción: " + identificadorTransaccion);
    }
}
