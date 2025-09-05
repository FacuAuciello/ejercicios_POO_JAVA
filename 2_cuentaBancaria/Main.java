//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CuentaBancaria cb = new CuentaBancaria();
        cb.setTitular("Amadeo Flores");
        cb.mostrarSaldo();
        cb.depositar(10000);
        cb.mostrarSaldo();
        cb.retirar(5000);
        cb.mostrarSaldo();
    }
}

class CuentaBancaria{
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
        System.out.println("Titular: " + titular);
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double monto){
        this.saldo+=monto;
        System.out.println("Deposito correcto!. Depositaste: " + monto);
    }
    public void retirar(double monto){
        this.saldo-=monto;
        System.out.println("Retiro exitoso!. Retiraste: " + monto);
    }
    public void mostrarSaldo(){
        System.out.println("Saldo actual: " + saldo);
    }
}
