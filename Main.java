package Atividade0001;

/**
 *
 * @author vagne
 */
// Classe principal (main)
public class Main {
    
    public static void main(String[] args) {
        // Criando cursos
        Curso curso1 = new Curso("Engenharia de Software", 8);
        Curso curso2 = new Curso("Ciência da Computação", 8);

        // Criando professores
        Professor professor1 = new Professor("Luis Araujo", "000.000.000-00", "Rua X, Bairro U", "(71) 987662577", 12345);
        Professor professor2 = new Professor("Maria Oliveira", "111.111.111-11", "Rua Y, Bairro V", "(71) 988887766", 67890);

        // Criando estudantes
        Estudante estudante1 = new Estudante("Ana", "222.222.222-22", "Rua Z, Bairro W", "(71) 988112233", "2023001", curso1);
        Estudante estudante2 = new Estudante("Bruno", "333.333.333-33", "Rua Z, Bairro W", "(71) 988223344", "2023002", curso1);
        Estudante estudante3 = new Estudante("Carlos", "444.444.444-44", "Rua Z, Bairro W", "(71) 988334455", "2023003", curso2);
        Estudante estudante4 = new Estudante("Daniela", "555.555.555-55", "Rua Z, Bairro W", "(71) 988445566", "2023004", curso2);
        Estudante estudante5 = new Estudante("Eduardo", "666.666.666-66", "Rua Z, Bairro W", "(71) 988556677", "2023005", curso1);

        // Criando turmas
        Turma turma1 = new Turma("T1");
        turma1.setCurso(curso1);
        turma1.setSemestre(1);
        turma1.setProfessor(professor1);

        Turma turma2 = new Turma("T2");
        turma2.setCurso(curso2);
        turma2.setSemestre(1);
        turma2.setProfessor(professor2);

        // Adicionando estudantes às turmas
        turma1.addEstudante(estudante1);
        turma1.addEstudante(estudante2);
        turma1.addEstudante(estudante3);

        turma2.addEstudante(estudante4);
        turma2.addEstudante(estudante5);

        // Exibindo informações das turmas
        System.out.println("=== Detalhes da Turma 1 ===");
        turma1.printTurmaDetails();

        System.out.println("\n=== Detalhes da Turma 2 ===");
        turma2.printTurmaDetails();
    }
}
