package lista_package;

public class TesteAdicionaNoFim {
    public static void main(String[] args) {
        Objeto aluno1 = new Objeto();
        Objeto aluno2 = new Objeto();

        aluno1.setNome("João");
        aluno2.setNome("José");

        Vetor lista = new Vetor();

        lista.adiciona(aluno1);
        lista.adiciona(aluno2);

        System.out.println(lista);
        lista.mostrarTamanhoDaLista();
    }
}
