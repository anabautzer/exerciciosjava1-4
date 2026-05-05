public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        if(saldo>=valor){
            System.out.println("Sacando "+ valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

}
