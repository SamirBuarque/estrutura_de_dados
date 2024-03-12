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
    private int contador = 0;

    // adiciona o aluno na posição mais próxima disponível
    public void adiciona(Aluno aluno) {
        // uma maneira muito mais eficiente de adicionar no final da lista (caso a fila esteja compactada à esquerda)
        this.alunos[contador] = aluno;
        this.contador++;
    }

    private boolean posicaoValida(int posicao) {
        return posicao < this.alunos.length && posicao >=0;
    }

    // adiciona um aluno na lista dada uma posição (se a posição já estiver ocupada, o aluno será alocado no espaço
    // mais próximo
    public void adiciona(int posicao, Aluno aluno) {
        // verifica se o numero informado pelo usuário é válido
        if (posicaoValida(posicao)) {
            if (this.alunos[posicao] == null) {
                this.alunos[posicao] = aluno;
                this.contador += 1;
            } else {
                System.out.println("Posição informada já está preenchida pelo aluno " + this.alunos[posicao]);
                // caso exista um aluno na posição informada, a função irá adicionar esse aluno nessa posição, e
                // colocará o aluno que estava nela na posição disponível mais próxima
                Aluno temp = this.alunos[posicao];
                this.alunos[posicao] = aluno;
                this.contador += 1;
                for (int i=0; i < this.alunos.length; i++) {
                    if (this.alunos[i] == null) {
                        this.alunos[i] = temp;
                        break;
                    }
                }
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
            return this.alunos[posicao];
        } else {
            System.out.println("Posicao informada é inválida");
            return null;
        }
    }

    // remove um aluno da lista dada uma posição
    public void remove(int posicao) {
        // verifica se a posicao informada é valida ou nao
        if (posicao < this.alunos.length && posicao >= 0) {
            if (this.alunos[posicao] == null) {
                System.out.println("Não há ninguém nessa posição.");
            } else {
                this.alunos[posicao] = null;
                this.contador -= 1;
                System.out.println("Aluno removido");
            }
        } else {
            System.out.println("Posicao informada é inválida");
        }
    }

    // verifica se existe ou nao um aluno numa dada posição na lista
    public boolean contem(Aluno aluno) {
        for (int i=0; i<this.contador; i++) {
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
        if (this.contador == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        // esse -1 é para nao adicionar o ultimo elemento com uma virgula e espaço vazio no final
        for (int i=0; i<this.contador-1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        // adiciona o ultimo elemento sem espaço vazio
        builder.append(this.alunos[this.contador-1]);
        builder.append("]");
        return builder.toString();
    }

    public void mostrarTamanhoDaLista() {
        System.out.println("Tamanho da lista: "+this.contador);
    }

}
