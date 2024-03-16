package lista_package;

import java.util.Arrays;

public class Vetor {

/* O que deve ser implementado:
* Adiciona um dado aluno no fim da lista; ok
* Pega o aluno de uma dada posição; ok
* Remove o aluno de uma dada posição; ok
* Verifica se um dado aluno está armazenado; ok
* Informa o número de alunos armazenados; ok
* */
    private Aluno[] alunos = new Aluno[100];
    private int numeroDeAlunos = 0;

    // adiciona o aluno na posição mais próxima disponível
    public void adiciona(Aluno aluno) {
        // uma maneira muito mais eficiente de adicionar no final da lista (caso a fila esteja compactada à esquerda)
        this.alunos[numeroDeAlunos] = aluno;
        this.numeroDeAlunos++;
    }
// MÉTODOS PRIVADOS DA CLASSE
    private boolean posicaoValida(int posicao) {
        return posicao < this.alunos.length && posicao >=0;
    }

    private boolean posicaoVazia(int posicao) {
        return this.alunos[posicao] == null;
    }

    private void garanteEspaco() {
        if (this.numeroDeAlunos == this.alunos.length) {
            Aluno[] novaLista = new Aluno[this.alunos.length*2];
            for (int i=0; i < this.alunos.length; i++) {
                novaLista[i] = this.alunos[i];
            }
            this.alunos = novaLista;
        }
    }

    // MÉTODOS PÚBLICOS DA CLASSE

    // adiciona um aluno na lista dada uma posição (se a posição já estiver ocupada, o aluno será alocado no espaço
    // mais próximo
    public void adiciona(int posicao, Aluno aluno) {
        if (posicaoValida(posicao)) {
            if (posicaoVazia(posicao)) {
                System.out.println("A posição informada está vazia. Informe uma posição ocupada por algum aluno para " +
                        "a operação funcionar.");
            } else {
                this.garanteEspaco();
                for (int i = this.numeroDeAlunos-1; i >= posicao; i--) {
                    this.alunos[i+1] = this.alunos[i];
                }
                this.alunos[posicao] = aluno;
                this.numeroDeAlunos ++;
                System.out.println("Aluno adicionado na posição desejada e o aluno que já estava na posição foi " +
                        "movido para a próxima disponível");
            }
        }
        else {
            System.out.println("Posição informada é inválida.");
        }
    }

    // retorna o aluno dada uma posição na lista
    public Aluno pega(int posicao) {
        // verifica se a posicao informada é valida ou nao
        if (posicaoValida(posicao)) {
            if (posicaoVazia(posicao)) {
                System.out.println("Não existe ninguém na posição informada.");
                return null;
            } else {
                return this.alunos[posicao];
            }
        } else {
            System.out.println("Posicao informada é inválida");
            return null;
        }
    }

    // remove um aluno da lista dada uma posição
    public void remove(int posicao) {
        // verifica se a posicao informada é valida ou nao
        if (posicaoValida(posicao)) {
            if (posicaoVazia(posicao)) {
                System.out.println("Não há ninguém nessa posição.");
            } else {
                for (;posicao<=this.numeroDeAlunos; posicao++) {
                    this.alunos[posicao] = this.alunos[posicao+1];
                }
                this.numeroDeAlunos --;
                System.out.println("Aluno removido");
            }
        } else {
            System.out.println("Posicao informada é inválida");
        }
    }

    // verifica se existe ou nao um aluno numa dada posição na lista
    public boolean contem(Aluno aluno) {
        for (int i=0; i<this.numeroDeAlunos; i++) {
            /* == compara as referencias do objeto e nao o objeto em si
            if (this.alunos[i] == aluno) {
                return true;
            }
            */

            // compara os dois objetos. Se os atributos são iguais, os objetos sao iguais.
             if (aluno.equals(this.alunos[i])) {
                 System.out.println("O aluno " + aluno.getNome() + " está na lista");
                 return true;
            }
             /*
             if (aluno.getId().equals(this.alunos[i].getId())) {
                 System.out.println("esta no segundo if");
                 return true;
             }*/
        }

        System.out.println(aluno.getNome());
        return false;
    }

    public String toString() {
        if (this.numeroDeAlunos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        // esse -1 é para nao adicionar o ultimo elemento com uma virgula e espaço vazio no final
        for (int i=0; i< this.alunos.length; i++) {
            if (this.alunos[i] != null){
                builder.append(this.alunos[i]);
                if (this.alunos[i+1] != null) {
                    builder.append(", ");
                }
            } else {
                break;
            }
        }
        // adiciona o ultimo elemento sem espaço vazio
//        builder.append(this.alunos[this.numeroDeAlunos-1]);
        builder.append("]");
        return builder.toString();
    }

    public void mostrarTamanhoDaLista() {
        System.out.println("Tamanho da lista: "+this.numeroDeAlunos);
    }

}
