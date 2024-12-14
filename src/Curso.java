// Classe Curso
class Curso {
    private double mediaAprovacao;
    private double mediaRecuperacao;

    public Curso(double mediaAprovacao, double mediaRecuperacao) {
        this.mediaAprovacao = mediaAprovacao;
        this.mediaRecuperacao = mediaRecuperacao;
    }

    public double getMediaAprovacao() {
        return mediaAprovacao;
    }

    public double getMediaRecuperacao() {
        return mediaRecuperacao;
    }
}
