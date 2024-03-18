package lista_package.testes;
import lista_package.*;
public class TesteRemoveObjeto {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();

        aluno1.setNome("objeto1");
        aluno2.setNome("objeto2");
        aluno3.setNome("objeto3");
        aluno4.setNome("objeto4");

        vetor.adiciona(aluno1);
        vetor.adiciona(aluno2);
        vetor.adiciona(aluno2);
        vetor.adiciona(aluno4);

        System.out.println(vetor);

        vetor.remove(aluno2);
        System.out.println(vetor);

    }
}
