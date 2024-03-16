package lista_package.testes;
import lista_package.*;

import java.util.ArrayList;
import java.util.Vector;

public class TesteVector {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        System.out.println("tamanho da classe Vetor: "+vetor.mostrarTamanhoDoArray());
        for (int i=0; i<vetor.mostrarTamanhoDoArray(); i++) {
            Objeto objeto = new Objeto();
            objeto.setNome("Objeto"+i);
            vetor.adiciona(objeto);
        }
//        Objeto objeto1 = new Objeto();
//        objeto1.setNome("testeEstoura");
//        vetor.adiciona(objeto1);
        System.out.println("tamanho da classe Vetor: "+vetor.mostrarTamanhoDoArray());

        Vector vetorTeste = new Vector();
        System.out.println("tamanho da classe Vector: "+vetorTeste.size());
        for (int i=0; i<1000; i++) {
            vetorTeste.add(vetor.pega(i));
        }
        Objeto objeto = new Objeto();
        vetorTeste.add(objeto);
        System.out.println("tamanho da classe Vector: "+vetorTeste.size());

        ArrayList<Object> vetorArrayList = new ArrayList<Object>();
        System.out.println("Tamanho do vetor da classe ArrayList: "+vetorArrayList.size());
        for (int i=0; i<vetorTeste.size();i++){
            vetorArrayList.add(vetorTeste.get(i));
        }
        System.out.println("Tamanho do vetor da classe ArrayList: "+vetorArrayList.size());

    }
}
