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
        System.out.println(lista.informarQuantidade());

        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista.informarQuantidade());
        lista.remove(8);
        System.out.println(lista.informarQuantidade());
        System.out.println(lista);
        System.out.println(lista.informarQuantidade());
        lista.remove(0);
        System.out.println(lista.informarQuantidade());
    }
}
