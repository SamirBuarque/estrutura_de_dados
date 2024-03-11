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
        for (int i=0; i < this.alunos.length; i++) {
            if (this.alunos[i] == null) {
                this.alunos[i] = aluno;
                this.contador += 1;
                break;
            }
        }
    }

    // adiciona um aluno na lista dada uma posição (se a posição já estiver ocupada, o aluno será alocado no espaço
    // mais próximo
    public void adiciona(int posicao, Aluno aluno) {
        // verifica se o numero informado pelo usuário é válido
        if (posicao < this.alunos.length && posicao >= 0) {
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
        if (posicao < this.alunos.length && posicao >= 0) {
            //System.out.println(this.alunos[posicao]);
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
    public boolean contem(int posicao) {
        // verifica se a posicao informada é valida ou nao
        if (posicao < this.alunos.length && posicao >= 0) {
            // verifica se a posição informada está vazia ou nao
            if (this.alunos[posicao] == null) {
                System.out.println("Não existe aluno na posição informada.");
                return false;
            } else {
                System.out.println("Existe aluno na posição informada");
                return true;
            }
        } else {
            System.out.println("Posicao informada é inválida");
            return false;
        }
    }

    public int informarQuantidade() {
        return this.contador;
    }
    public String toString() {
        return Arrays.toString(alunos);
    }

}
