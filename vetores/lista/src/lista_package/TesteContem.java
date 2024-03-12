package lista_package;

public class TesteContem {
    public static void main(String[] args) {
        Vetor lista = new Vetor();
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        a1.setNome("orochi");
        a2.setNome("orochi");
        a3.setNome("pedro");

        lista.adiciona(a1);
        System.out.println(lista);
        System.out.println(lista.contem(a2));


    }
}
