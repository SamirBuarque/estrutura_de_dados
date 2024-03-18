package lista_package.testes;

import lista_package.Aluno;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        ArrayList<Aluno> listaComGenerics = new ArrayList<Aluno>();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();



        a1.setNome("aluno1");
        a2.setNome("aluno2");
        a3.setNome("aluno3");

        lista.add(a1);
        lista.add(a2);
        lista.add(0,a3);

        listaComGenerics.add(a1);
        listaComGenerics.add(a2);
//        causa erro de compilação
//        listaComGenerics.add("olaf");

        System.out.println(listaComGenerics);


        System.out.println(lista);
        System.out.println(lista.size());

        lista.remove(0);
        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.contains(a1));


    }
}
