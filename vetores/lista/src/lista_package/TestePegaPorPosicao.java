package lista_package;
public class TestePegaPorPosicao {
    public static void main(String[] args) {
        Objeto a1 = new Objeto();
        Objeto a2 = new Objeto();

        a1.setNome("Rafael");
        a2.setNome("Paulo");


        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(0, a2);

        System.out.println(lista.pega(0));
    }
}
