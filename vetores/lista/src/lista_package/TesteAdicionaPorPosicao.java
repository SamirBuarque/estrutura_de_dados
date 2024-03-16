package lista_package;

public class TesteAdicionaPorPosicao {
    public static void main(String[] args) {
        Vetor lista = new Vetor();
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();

        a1.setNome("Joao");
        a2.setNome("Maria");
        a3.setNome("Carlos");
        a4.setNome("CJ");

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);

        System.out.println(lista);

        lista.adiciona(2, a4);
        System.out.println(lista);
        //lista.mostrarTamanhoDaLista();
    }
}
