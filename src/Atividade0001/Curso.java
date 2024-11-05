package Atividade0001;

/**
 *
 * @author vagne
 */
// Classe Curso
class Curso {
    private String nome;
    private int qtdSemestres;

    public Curso(String nome, int qtdSemestres) {
        this.nome = nome;
        this.qtdSemestres = qtdSemestres;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdSemestres() {
        return qtdSemestres;
    }
}
