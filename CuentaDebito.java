public class CuentaDebito {
    private String tipo;
    private Cliente cliente;
    private int numeroCuenta;
    private int saldo;
    
    public CuentaDebito(String tipo, Cliente cliente, int numeroCuenta) {
        this.tipo = tipo;
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        saldo=1000;
    }
    
    // Métodos Get y Set para el tipo, cliente y número de cuenta
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
