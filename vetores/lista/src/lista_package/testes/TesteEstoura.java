package lista_package.testes;
import lista_package.*;
public class TesteEstoura {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        long inicio = System.currentTimeMillis();

        for (int i=0; i<=100001; i++) {
            Aluno aluno = new Aluno();
            vetor.adiciona(aluno);
        }
        System.out.println(vetor.mostrarTamanhoDoArray());
        long fim = System.currentTimeMillis();
        double tempoGasto = (fim-inicio)/1000.0;
        System.out.println("tempo de execução em segundos: "+tempoGasto);
    }
}
