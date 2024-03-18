package lista_package;

public class Aluno {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome;
    }

    public boolean equals(Aluno aluno) {
        // se as referencias sao iguais, os objetos sao os mesmos
        if (this == aluno) {
            return true;
        }
        // se o objeto é nulo ou nao é uma instancia da classe objeto, retorna falso
        if (aluno == null || getClass() != aluno.getClass()) {
            return false;
        }
        Aluno outroAluno = (Aluno) aluno;
        return nome.equals(outroAluno.nome);
    }
}
