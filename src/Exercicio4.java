public class Exercicio4 {
    public static void main(String[] args) {
        int valorA = 3;
        int valorB = 7;
        int auxiliar; //declaração de uma variável auxiliar
                auxiliar = valorA; //armazena o valor de 'a' na auxiliar
                valorA = valorB; //passa o valor de 'b' para 'a'
                valorB = auxiliar; //passa o valor da auxiliar (original de 'a') para 'b'
            System.out.println(valorA);
            System.out.println(valorB);
}
}
