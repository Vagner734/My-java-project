// Classe Curso
public class Curso {
    private String nome;
    private int qtdSemestres;
    private Professor coordenador;

    public Curso(String nome, int qtdSemestres, Professor coordenador) {
        this.nome = nome;
        this.qtdSemestres = qtdSemestres;
        this.coordenador = coordenador;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdSemestres() {
        return qtdSemestres;
    }

    public Professor getCoordenador() {
        return coordenador;
    }
}
