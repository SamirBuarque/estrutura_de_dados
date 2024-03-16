package lista_package;

public class TesteAdicionaPorPosicao {
    public static void main(String[] args) {
        Vetor lista = new Vetor();
        Objeto a1 = new Objeto();
        Objeto a2 = new Objeto();
        Objeto a3 = new Objeto();
        Objeto a4 = new Objeto();

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
        lista.mostrarTamanhoDaLista();
    }
}
