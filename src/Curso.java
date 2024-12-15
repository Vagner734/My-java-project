import java.util.ArrayList;
import java.util.List;

class Curso {
    private String nome;
    private double mediaAprovacao;
    private double mediaRecuperacao;
    private List<String> disciplinas; // Lista de disciplinas

    public Curso(String nome, double mediaAprovacao, double mediaRecuperacao) {
        this.nome = nome;
        this.mediaAprovacao = mediaAprovacao;
        this.mediaRecuperacao = mediaRecuperacao;
        this.disciplinas = new ArrayList<>(); // Inicializa a lista de disciplinas
    }

    public String getNome() {
        return nome;
    }

    public double getMediaAprovacao() {
        return mediaAprovacao;
    }

    public double getMediaRecuperacao() {
        return mediaRecuperacao;
    }

    public List<String> getDisciplinas() {
        return disciplinas; // Retorna a lista de disciplinas
    }

    public void addDisciplina(String disciplina) {
        disciplinas.add(disciplina); // Adiciona uma disciplina à lista
    }
}
