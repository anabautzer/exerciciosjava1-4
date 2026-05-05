public class ContaPoupanca extends Conta{
    protected double taxa = 2.0;

    public ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Saque realizado: " + (valor - taxa));
        }
    }
}
