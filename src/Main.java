// Classe principal (main)
public class Main {
    public static void main(String[] args) {
        // Definindo as médias e criando o curso
        Curso curso1 = new Curso("Engenharia de Software", 6.0, 4.0);
        
        // Adicionando disciplinas ao curso
        curso1.addDisciplina("Programação");
        curso1.addDisciplina("Banco de Dados");
        curso1.addDisciplina("Sistemas Operacionais");

        // Criando professores
        Professor professor1 = new Professor("Luis Araujo", "000.000.000-00", "Rua X, Bairro U", "(71) 987662577", 12345);

        // Criando estudantes
        Estudante estudante1 = new Estudante("Ana", "222.222.222-22", "Rua Z, Bairro W", "(71) 988112233", "2023001", curso1);
        Estudante estudante2 = new Estudante("Bruno", "333.333.333-33", "Rua Z, Bairro W", "(71) 988223344", "2023002", curso1);
        Estudante estudante3 = new Estudante("Carlos", "444.444.444-44", "Rua Z, Bairro W", "(71) 988334455", "2023003", curso1);
        Estudante estudante4 = new Estudante("Daniela", "555.555.555-55", "Rua Z, Bairro W", "(71) 988445566", "2023004", curso1);
        Estudante estudante5 = new Estudante("Eduardo", "666.666.666-66", "Rua Z, Bairro W", "(71) 988556677", "2023005", curso1);

        // Criando turma
        Turma turma1 = new Turma("T1");
        turma1.setCurso(curso1);
        turma1.setSemestre(1);
        turma1.setProfessor(professor1);

        // Adicionando estudantes à turma
        turma1.addEstudante(estudante1);
        turma1.addEstudante(estudante2);
        turma1.addEstudante(estudante3);
        turma1.addEstudante(estudante4);
        turma1.addEstudante(estudante5);

        // Atribuindo notas aos estudantes
        estudante1.setNotas(new double[]{8, 6, 7});
        estudante2.setNotas(new double[]{5, 4, 6});
        estudante3.setNotas(new double[]{3, 2, 1});
        estudante4.setNotas(new double[]{9, 8, 7});
        estudante5.setNotas(new double[]{6, 7, 6});

        // Exibindo informações da turma
        System.out.println("=== Detalhes da Turma 1 ===");
        turma1.printTurmaDetails();

        // Estatísticas
        System.out.println("\n=== Estatísticas da Turma ===");
        gerarEstatisticas(turma1);

        // Atribuindo notas de recuperação
        estudante2.setNotaRecuperacao(6.0); // Estudante 2 vai para recuperação
        logAlteracaoNota(estudante2.getNome());
    }

    public static void gerarEstatisticas(Turma turma) {
        // Implemente o cálculo e exibição das estatísticas aqui
        System.out.println("Estatísticas não implementadas.");
    }

    public static void logAlteracaoNota(String nomeEstudante) {
        // Log para alteração de nota
        System.out.println("Nota de recuperação atribuída ao estudante: " + nomeEstudante);
    }
}
