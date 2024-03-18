package lista_package;

public class Vetor {

    /* O que deve ser implementado:
     * Adiciona um dado aluno no fim da lista; ok
     * Pega o aluno de uma dada posição; ok
     * Remove o aluno de uma dada posição; ok
     * Verifica se um dado aluno está armazenado; ok
     * Informa o número de alunos armazenados; ok
     * */
    private Aluno[] alunos = new Aluno[1000];
    private int numeroDeElementos = 0;

    // adiciona o aluno na posição mais próxima disponível
    public void adiciona(Aluno aluno) {
        // uma maneira muito mais eficiente de adicionar no final da lista (caso a fila esteja compactada à esquerda)
        this.garanteEspaco();
        this.alunos[numeroDeElementos] = aluno;
        this.numeroDeElementos++;
    }

    // MÉTODOS PRIVADOS DA CLASSE
    private boolean posicaoValida(int posicao) {
        return posicao < this.alunos.length && posicao >= 0;
    }

    private boolean posicaoVazia(int posicao) {
        return this.alunos[posicao] == null;
    }

    private void garanteEspaco() {
        if (this.numeroDeElementos == this.alunos.length) {
            Aluno[] novaLista = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
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
                for (int i = this.numeroDeElementos - 1; i >= posicao; i--) {
                    this.alunos[i + 1] = this.alunos[i];
                }
                this.alunos[posicao] = aluno;
                this.numeroDeElementos++;
            }
        } else {
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
                System.out.println(this.alunos[posicao].getNome()+" removido");
                for (; posicao <= this.numeroDeElementos; posicao++) {
                    this.alunos[posicao] = this.alunos[posicao + 1];
                }
                this.numeroDeElementos--;
            }
        } else {
            System.out.println("Posicao informada é inválida");
        }
    }

    public void remove(Aluno aluno) {
        for (int i=0; i<numeroDeElementos;i++){
            if (this.alunos[i] == aluno){
                this.alunos[i] = null;
                for (int a = i; a<=this.numeroDeElementos; a++){
                    this.alunos[a] = this.alunos[a+1];
                }
                this.numeroDeElementos--;
            }
        }
    }

    // verifica se existe ou nao um aluno numa dada posição na lista
    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.numeroDeElementos; i++) {
            if (this.alunos[i] == aluno) {
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
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] != null) {
                builder.append(this.alunos[i]);
                if (this.alunos[i + 1] != null) {
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

    public int mostrarTotalDeElementos() {
        return this.numeroDeElementos;
    }

    public int mostrarTamanhoDoArray() {
        return this.alunos.length;
    }

}
