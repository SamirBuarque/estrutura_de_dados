package lista_package.testes;

import lista_package.Aluno;
import lista_package.Vetor;

public class TesteAdicionaPorPosicao {
    public static void main(String[] args) {
        Vetor lista = new Vetor();
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();

        a1.setNome("rafael");
        a2.setNome("paulo");
        a3.setNome("ana");
        a4.setNome("CJ");

        lista.adiciona(a1);
        lista.adiciona(0, a2);
        lista.adiciona(1, a3);

        System.out.println(lista);

//        lista.adiciona(2, a4);
//        System.out.println(lista);
//        lista.mostrarTamanhoDaLista();
    }
}
