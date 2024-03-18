package lista_package.testes;

import lista_package.Aluno;
import lista_package.Vetor;

public class TesteAdicionaNoFim {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNome("João");
        aluno2.setNome("José");

        Vetor lista = new Vetor();

        lista.adiciona(aluno1);
        lista.adiciona(aluno2);

        System.out.println(lista);
        lista.mostrarTotalDeElementos();
    }
}
