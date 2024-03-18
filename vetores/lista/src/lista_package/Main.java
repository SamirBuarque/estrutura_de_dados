package lista_package;

import lista_package.*;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        for (int i=1; i<=15; i++) {
            Aluno aluno = new Aluno();
            aluno.setNome("Aluno"+i);
            vetor.adiciona(aluno);
        }

        System.out.println(vetor);
        System.out.println("Total de alunos: "+vetor.mostrarTotalDeElementos());

        vetor.remove(2);
        vetor.remove(3);

        Aluno aluno16 = new Aluno();
        Aluno aluno17 = new Aluno();
        aluno16.setNome("Aluno16");
        aluno17.setNome("Aluno17");

        System.out.println("Lista após remover os 2 alunos");
        System.out.println(vetor);

        vetor.adiciona(2, aluno16);
        vetor.adiciona(3, aluno17);
        System.out.println("Lista após adicionar 2 novos alunos");
        System.out.println(vetor);
        System.out.println("Total de alunos: "+vetor.mostrarTotalDeElementos());

    }
}