package lista_package.testes;
import lista_package.*;


public class TesteDeTempoDoContem {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        long inicio = System.currentTimeMillis();

//        Adicionando 100.000 alunos e verificando se
//        foram realmente adicionados

//        for (int i=0; i<100000; i++) {
//            Objeto objeto = new Objeto();
//            objeto.setNome("objeto"+i);
//            vetor.adiciona(objeto);
//            if (!vetor.contem(objeto)){
//                System.out.println("Erro: Vetor nao adicionou o objeto " + objeto);
//            }
//        }

        for (int i=0; i<100000; i++) {
            Aluno aluno = new Aluno();
            if (vetor.contem(aluno)) {
                System.out.println("Erro: vetor adicionou o objeto " + aluno);
            }
        }

        long fim = System.currentTimeMillis();
        double tempoGasto = (fim-inicio)/1000.0;
        System.out.println("tempo de execução em segundos: "+tempoGasto);
    }
}
