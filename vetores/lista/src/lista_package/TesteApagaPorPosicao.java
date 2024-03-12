package lista_package;

public class TesteApagaPorPosicao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("aluno1");
        a2.setNome("aluno2");

        Vetor lista = new Vetor();

        lista.adiciona(8, a1);
        lista.adiciona(a2);
        lista.mostrarTamanhoDaLista();

        System.out.println(lista);

        lista.remove(102);
        lista.mostrarTamanhoDaLista();
        lista.remove(8);
        lista.mostrarTamanhoDaLista();
        System.out.println(lista);
        lista.mostrarTamanhoDaLista();
        lista.remove(0);
        lista.mostrarTamanhoDaLista();
    }
}
