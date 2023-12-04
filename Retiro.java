
public class Retiro extends Clase_Abstractaa {
    @Override
    public void Transacciones() {
    	
    			 System.out.print("Cuanto deseas retirar: ");
    		        Retiro();
    		        if (retiro <= getSaldo()) {
    		            transacciones = getSaldo();
    		            setSaldo(transacciones - retiro);
    		            System.out.println("====================================");
    		            System.out.println("====================================");
    		            System.out.println("\tDebito\t");
    		            System.out.println("Se relalizo una retiro el " + fechaActual );
    		            System.out.println("Retiraste : " + retiro);
    		            System.out.println("Tu saldo actual es: " + getSaldo());
    		            System.out.println("====================================");
    		        } else {
    		            System.out.println("=====================");
    		            System.out.println("Saldo insuficiente.");
    		            System.out.println("=====================");
    
       
    }
}
}
