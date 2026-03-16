public class TestePessoa {
    public static void main(String[] args) {
        Pessoa ps = new Pessoa();
        System.out.println("Nome: " + ps.nomeCompleto("Daniel ", "Costa"));
        System.out.println("Peso: " + ps.pesoEmKilogramas(75000) + " kg");
        System.out.println("Altura: " + ps.alturaEmMetros(171) + " metros");
        ps = new Pessoa();
        System.out.println("Nome: " + ps.nomeCompleto("Aline ", "Costa"));
        System.out.println("Peso: " + ps.pesoEmKilogramas(50000) + " kg");
        System.out.println("Altura: " + ps.alturaEmMetros(150) + " metros");
    }
}