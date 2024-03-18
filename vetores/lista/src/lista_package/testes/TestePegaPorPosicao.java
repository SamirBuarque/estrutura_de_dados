package lista_package.testes;

import lista_package.Aluno;
import lista_package.Vetor;

public class TestePegaPorPosicao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");


        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista.pega(0));
        System.out.println(lista.pega(1));
    }
}
