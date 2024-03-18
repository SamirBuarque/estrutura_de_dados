package lista_package.testes;

import lista_package.Aluno;
import lista_package.Vetor;

public class TesteApagaPorPosicao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();

        a1.setNome("a1");
        a2.setNome("a2");
        a3.setNome("a3");
        a4.setNome("a4");


        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);
    }
}
