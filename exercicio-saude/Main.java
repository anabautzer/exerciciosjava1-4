//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProfissionalSaude p1 = new Medico("Ana", 26, "123.456.789-10", "CRM", "Pediatra", 1, 5000);
            p1.calularSalario();
            p1.exibirInformacoes();
        ProfissionalSaude p2 = new Enfermeiro("Jony", 30, "123.456.789-10", "COREN", "Noturno", 5000);
            p2.calularSalario();
            p2.exibirInformacoes();
        }
    }