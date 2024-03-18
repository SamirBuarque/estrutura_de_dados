package lista_package.testes;
import lista_package.*;

import java.util.ArrayList;

public class TesteVetorTipoString {
    public static void main(String[] args) {
        ArrayList<String> vetorTipoString = new ArrayList<String>();

        vetorTipoString.add("Java");
        vetorTipoString.add("Python");
        vetorTipoString.add("C#");
        System.out.println(vetorTipoString);

        Aluno alunoTeste = new Aluno();
        alunoTeste.setNome("objeto teste");

//        vetorTipoString.add(objetoTeste);
//        System.out.println(vetorTipoString);

        System.out.println(vetorTipoString.get(1));

//        Vetor vetor = new Vetor();
//        vetor.adiciona("PHP");
//        Objeto objeto = (Objeto) vetor.pega(0);

    }
}
