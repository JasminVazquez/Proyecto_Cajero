
public class Transferencia extends Clase_Abstractaa {

    @Override
    public void Transacciones() {
    			System.out.print("Cuanto quieres Transferir: ");
                Transferencia();
                System.out.print("Ingrese numero de cuenta: ");
                Numero_cuenta();
                if (transferencia <= getSaldo()) {
                    transacciones = getSaldo();
                    setSaldo(transacciones - transferencia);
                    System.out.println("====================================");
                    System.out.println("====================================");
                    System.out.println("\t\tDebito\t\t");
                    System.out.println("Se relalizo una Transferencia el " + fechaActual);
                    System.out.println("Monto : $" + transferencia);
                    System.out.println("Cuenta destino: "+ numero_cuenta);
                    System.out.println("Saldo actual: $" + getSaldo());
                    System.out.println("====================================");
                } else {
                    System.out.println("=====================");
                    System.out.println("Saldo insuficiente");
                    System.out.println("=====================");
               
        	
                }
    			
    }
}