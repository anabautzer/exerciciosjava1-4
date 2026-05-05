import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente(1, 500);
        ContaPoupanca cp = new ContaPoupanca(1, 500);
        System.out.println("Em qual conta você quer mexer?");
        System.out.println("Conta Corrente (cc) ou Conta Poupança (cp)?");
        String conta = sc.nextLine();
        System.out.println("O que você deseja fazer?");
        System.out.println("Digite 1 para depositar");
        System.out.println("Digite 2 para sacar");
        System.out.println("Digite 3 para sair");
        int opcao = sc.nextInt();
        while (true) {
            if (conta.equals("cc")) {
                if (opcao == 1) {
                    cc.depositar(sc.nextDouble());
                    break;
                } else if (opcao == 2) {
                    cc.sacar(sc.nextDouble());
                    break;
                } else {
                    System.out.println("Finalizando");
                    break;
                }
            }else if (conta.equals("cp")) {
                if (opcao == 1) {
                    cp.depositar(sc.nextDouble());
                    break;
                } else if (opcao == 2){
                    cp.sacar(sc.nextDouble());
                    break;
                } else{
                    System.out.println("Finalizando");
                    break;
                    }
            }

        }
    }
}