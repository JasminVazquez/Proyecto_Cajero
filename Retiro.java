
public class Retiro extends Clase_Abstractaa {
    @Override
    public void Transacciones() {
    	
    			 System.out.print("Cuanto deseas retirar: ");
    		        Retiro();
    		        if (retiro <= getSaldo()) {
    		            transacciones = getSaldo();
    		            setSaldo(transacciones - retiro);
    		            System.out.println("====================================");
<<<<<<< HEAD
    		            System.out.println("====================================");
    		            System.out.println("\tDebito\t");
    		            System.out.println("Se relalizo una retiro el " + fechaActual );
=======
    		            System.out.println("=================BBVA===============");
						System.out.println("=========Sucursal Chapultepec=======");
    		            System.out.println("				Debito				");
    		            System.out.println("Se relalizo un retiro el 31/10/2023");
						System.out.println("Id Retiro: 12901");
>>>>>>> baba084178db337776105a4d2083f4fac34ebfc7
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
