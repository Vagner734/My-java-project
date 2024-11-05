package Atividade0002;

// Classe Estudante
class Estudante extends Pessoa {
    private String matricula;
    private Curso curso;
    private double[] notas;
    private Double notaRecuperacao;

    public Estudante(String nome, String cpf, String endereco, String telefone, String matricula, Curso curso) {
        super(nome, cpf, endereco, telefone);
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new double[3]; // Para 3 notas
    }

    public String getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Double getNotaRecuperacao() {
        return notaRecuperacao;
    }

    public void setNotaRecuperacao(Double notaRecuperacao) {
        this.notaRecuperacao = notaRecuperacao;
    }

    public double calcularMedia() {
        double media = (notas[0] + notas[1] + notas[2]) / 3;
        return media;
    }

    public String getSituacao() {
        double media = calcularMedia();
        if (media >= 7) {
            return "APROVADO";
        } else if (media >= 2.5) {
            return "EM RECUPERAÇÃO";
        } else {
            return "REPROVADO";
        }
    }

    @Override
    public void printData() {
        System.out.println("Estudante " + nome + " - Cpf: " + cpf + " - End.: " + endereco +
                " - Tel.: " + telefone + " - Matrícula: " + matricula);
    }
}
