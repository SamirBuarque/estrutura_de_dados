package lista_package;
import java.util.Scanner;

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

    @Override
    public boolean equals(Object obj) {
        // se as referencias sao iguais, os objetos sao os mesmos
        if (this == obj) {
            return true;
        }
        // se o objeto é nulo ou nao é uma instancia da classe objeto, retorna falso
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aluno outroAluno = (Aluno) obj;
        return nome.equals(outroAluno.nome);
    }
}
