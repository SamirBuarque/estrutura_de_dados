package lista_package;

public class Objeto {
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

    public boolean equals(Objeto obj) {
        // se as referencias sao iguais, os objetos sao os mesmos
        if (this == obj) {
            return true;
        }
        // se o objeto é nulo ou nao é uma instancia da classe objeto, retorna falso
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Objeto outroObjeto = (Objeto) obj;
        return nome.equals(outroObjeto.nome);
    }
}
