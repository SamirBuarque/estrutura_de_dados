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
    private Objeto[] objetos = new Objeto[1000];
    private int numeroDeElementos = 0;

    // adiciona o aluno na posição mais próxima disponível
    public void adiciona(Objeto objeto) {
        // uma maneira muito mais eficiente de adicionar no final da lista (caso a fila esteja compactada à esquerda)
        this.garanteEspaco();
        this.objetos[numeroDeElementos] = objeto;
        this.numeroDeElementos++;
    }
// MÉTODOS PRIVADOS DA CLASSE
    private boolean posicaoValida(int posicao) {
        return posicao < this.objetos.length && posicao >=0;
    }

    private boolean posicaoVazia(int posicao) {
        return this.objetos[posicao] == null;
    }

    private void garanteEspaco() {
        if (this.numeroDeElementos == this.objetos.length) {
            Objeto[] novaLista = new Objeto[this.objetos.length*2];
            for (int i=0; i < this.objetos.length; i++) {
                novaLista[i] = this.objetos[i];
            }
            this.objetos = novaLista;
        }
    }

    // MÉTODOS PÚBLICOS DA CLASSE

    // adiciona um aluno na lista dada uma posição (se a posição já estiver ocupada, o aluno será alocado no espaço
    // mais próximo
    public void adiciona(int posicao, Objeto objeto) {
        if (posicaoValida(posicao)) {
            if (posicaoVazia(posicao)) {
                System.out.println("A posição informada está vazia. Informe uma posição ocupada por algum aluno para " +
                        "a operação funcionar.");
            } else {
                this.garanteEspaco();
                for (int i = this.numeroDeElementos-1; i >= posicao; i--) {
                    this.objetos[i+1] = this.objetos[i];
                }
                this.objetos[posicao] = objeto;
                this.numeroDeElementos ++;
                System.out.println("Aluno adicionado na posição desejada e o aluno que já estava na posição foi " +
                        "movido para a próxima disponível");
            }
        }
        else {
            System.out.println("Posição informada é inválida.");
        }
    }

    // retorna o aluno dada uma posição na lista
    public Object pega(int posicao) {
        // verifica se a posicao informada é valida ou nao
        if (posicaoValida(posicao)) {
            if (posicaoVazia(posicao)) {
                System.out.println("Não existe ninguém na posição informada.");
                return null;
            } else {
                return this.objetos[posicao];
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
                for (;posicao<=this.numeroDeElementos; posicao++) {
                    this.objetos[posicao] = this.objetos[posicao+1];
                }
                this.numeroDeElementos --;
                System.out.println("Aluno removido");
            }
        } else {
            System.out.println("Posicao informada é inválida");
        }
    }

    // verifica se existe ou nao um aluno numa dada posição na lista
    public boolean contem(Objeto objeto) {
        for (int i=0; i<this.numeroDeElementos; i++) {
            if (this.objetos[i] == objeto) {
                return true;
            }


//            // compara os dois objetos. Se os atributos são iguais, os objetos sao iguais.
//             if (objeto.equals(this.objetos[i])) {
//                 return true;
//            }
        }
        return false;
    }

    public String toString() {
        if (this.numeroDeElementos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        // esse -1 é para nao adicionar o ultimo elemento com uma virgula e espaço vazio no final
        for (int i=0; i< this.objetos.length; i++) {
            if (this.objetos[i] != null){
                builder.append(this.objetos[i]);
                if (this.objetos[i+1] != null) {
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
        System.out.println("Tamanho da lista: "+this.numeroDeElementos);
    }

    public int mostrarTamanhoDoArray() {
        return this.objetos.length;
    }

}
