import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese su Nombre:(Ana)");
        String Nombre = entrada.nextLine();
        
        System.out.println("Ingrese Banco que proporciona servicio: ");
        String Banco = entrada.nextLine();
        
        System.out.println("Ingrese su Numero de cuenta:(111)");
        String Num_cuenta = entrada.nextLine();
        
        System.out.println("Ingrese su Nip:	(111)");
        int Nip = entrada.nextInt();
        
        System.out.println("----------------------------------------------------");
        if (Nombre.equals("a") && Num_cuenta.equals("1") && Nip == 1) {
            System.out.println("===============================================");
            System.out.println("Buenas tardes esta en un cajero automatico de " + Banco);
            System.out.println("Bienvenido, " + Nombre);
           
            Clase_Abstractaa mensajero = new Consulta();
            mensajero.setSaldo(1700);
            mensajero.Operaciones();
        }else {
        	System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
        	System.out.println("===============================================");
   
        }
    }
    public String getNombre(){
        return getNombre();
    }
    public String getBanco( String Banco){
        return Banco;
    }
  
}

