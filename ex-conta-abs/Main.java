import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta c;
        System.out.println("Digite qual é a conta?");
        while (true){
            int opcao = Integer.parseInt(sc.nextLine());
            if (opcao == 1){
                c = new ContaCorrente(5, 5000);
                break;
            } else if (opcao == 2) {
                c = new ContaPoupanca(4, 2000);
                break;
            }
        }
        while (true){
            System.out.println("Digite sua opção entre 1 e 3");
            int opcao = Integer.parseInt(sc.nextLine());
            if (opcao == 1) {
                c.depositar(500);
                System.out.println("Depositando: " + c.saldo);
                break;
            } else if (opcao == 2) {
                c.sacar(500);
                System.out.println("Sacando: " + c.saldo);
                break;
            } else {
                System.out.println("Finalizando");
                break;
            }
        }
    }
}
