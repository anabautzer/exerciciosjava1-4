package b;

import a.ABC;

public class Teste extends ABC {
    public static void main(String[] args) {
        Teste a = new Teste(); // tem que fazer o objeto filho para trazer a indo do pai e declarar a variavel
        int ab = a.qualquerCoisa; // declarar uma variavel com valor do atributo do pai, mas não é obrigatório
    }
}
