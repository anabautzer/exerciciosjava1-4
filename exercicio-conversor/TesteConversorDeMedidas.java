import java.util.Scanner;

public class TesteConversorDeMedidas {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        ConversorDeMedidas cm = new ConversorDeMedidas(); // não precisa de um construtor para alterar uma carcteristica
        System.out.println("Escreva um valor em centímetros: ");
        double centimetros = sa.nextDouble();
        System.out.println(centimetros + " em polegadas é " + cm.centimetrosParaPolegadas(centimetros));
        System.out.println("Escreva um valor em polegadas: ");
        double polegadas = sa.nextDouble();
        System.out.println(polegadas + " em centímetros é " + cm.polegadasParaCentimetros(polegadas));
        System.out.println("Escreva um valor em quilómetros: ");
        double quilometros = sa.nextDouble();
        System.out.println(quilometros + " em metros é " + cm.kmParaMetros(quilometros));
        System.out.println("Escreva um valor em metros: ");
        double metros = sa.nextDouble();
        System.out.println(metros + " em quilómetros é " + cm.metrosParaKm(metros));
    }
}
