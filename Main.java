import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese su Nombre:	(Ana)");
        String Nombre = entrada.nextLine();
        System.out.println("Ingrese su Numero de cuenta:	(111)");
        String Num_cuenta = entrada.nextLine();
        System.out.println("Ingrese su Nip:		(111)");
        int Nip = entrada.nextInt();
        System.out.println("----------------------------------------------------");
        if(Nombre.equals("Ana") && Num_cuenta.equals("111") && Nip==111) {
        	System.out.println("===============================================");
        	System.out.print(Nombre);
            Clase_Abstractaa mesajero = new Consulta();
            mesajero.setSaldo(1700);
            mesajero.Operaciones();
        }else {
        	System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
        	System.out.println("===============================================");
   
        }
    }
    public String getNombre(){
        return getNombre();
    }
}

