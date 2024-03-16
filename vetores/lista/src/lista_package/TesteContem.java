package lista_package;

public class TesteContem {
    public static void main(String[] args) {
        Vetor lista = new Vetor();
        Objeto a1 = new Objeto();
        Objeto a2 = new Objeto();
        Objeto a3 = new Objeto();

        a1.setNome("orochi");
        a2.setNome("orochi");
        a3.setNome("pedro");

        lista.adiciona(a1);
        System.out.println(lista);
        System.out.println(lista.contem(a2));


    }
}
