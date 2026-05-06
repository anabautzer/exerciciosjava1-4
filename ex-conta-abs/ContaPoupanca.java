public class ContaPoupanca extends Conta{
    protected double taxa = 2.0;

    public ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (super.saldo > valor + taxa) { // boa prática para saber de onde vem
            super.saldo -= valor - taxa;
        }
    }
}
