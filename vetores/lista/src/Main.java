import lista_package.*;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();

        aluno1.setNome("rafael");
        aluno2.setNome("paulo");
        aluno3.setNome("ana");
        aluno4.setNome("lucian");

        vetor.adiciona(aluno1);
        vetor.adiciona(0, aluno2);
        vetor.adiciona(1, aluno3);
        System.out.println(vetor);

    }
}