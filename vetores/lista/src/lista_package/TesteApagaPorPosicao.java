package lista_package;

public class TesteApagaPorPosicao {
    public static void main(String[] args) {
        Objeto a1 = new Objeto();
        Objeto a2 = new Objeto();
        Objeto a3 = new Objeto();
        Objeto a4 = new Objeto();

        a1.setNome("a1");
        a2.setNome("a2");
        a3.setNome("a3");
        a4.setNome("a4");


        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);
    }
}
