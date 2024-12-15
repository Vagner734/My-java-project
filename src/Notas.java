public class Notas {
    private double nota1;
    private double nota2;
    private double nota3;
    private double peso1;
    private double peso2;
    private double peso3;
    private Curso curso; // referência ao objeto Curso

    // Construtor
    public Notas(double nota1, double nota2, double nota3, double peso1, double peso2, double peso3, Curso curso) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.peso1 = peso1;
        this.peso2 = peso2;
        this.peso3 = peso3;
        this.curso = curso;
    }

    public double calcularMedia() { 
        if (nota1 == 0 || nota2 == 0 || nota3 == 0) { // Verifica se as notas são zero
            return -1; // ou lança uma exceção, dependendo da lógica desejada
        }
        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        return media; // Adicionado ponto e vírgula
    }

    public String getSituacao() { 
        double media = calcularMedia();
        if (media >= curso.getMediaAprovacao()) {
            return "APROVADO"; 
        } else if (media >= curso.getMediaRecuperacao()) {
            return "EM RECUPERAÇÃO"; 
        } else {
            return "REPROVADO"; 
        }
    }
}
