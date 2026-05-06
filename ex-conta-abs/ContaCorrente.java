public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        if(super.saldo>=valor){
            super.saldo -= valor;
        }
    }

}
