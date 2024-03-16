package lista_package.testes;

import lista_package.Objeto;
import lista_package.Vetor;

public class TesteAdicionaPorPosicao {
    public static void main(String[] args) {
        Vetor lista = new Vetor();
        Objeto a1 = new Objeto();
        Objeto a2 = new Objeto();
        Objeto a3 = new Objeto();
        Objeto a4 = new Objeto();

        a1.setNome("rafael");
        a2.setNome("paulo");
        a3.setNome("ana");
        a4.setNome("CJ");

        lista.adiciona(a1);
        lista.adiciona(0, a2);
        lista.adiciona(1, a3);

        System.out.println(lista);

//        lista.adiciona(2, a4);
//        System.out.println(lista);
//        lista.mostrarTamanhoDaLista();
    }
}
