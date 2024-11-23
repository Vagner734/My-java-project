package Atividade0002;

import java.util.ArrayList;
import java.util.List;

// Classe principal (main)
public class Main {
    private static List<Log> logs = new ArrayList<>();

    public static void main(String[] args) {
        // Criando cursos e coordenadores
        Coordenador coordenador1 = new Coordenador("Dr. Marcos", "777.777.777-77", "Rua A, Bairro X", "(71) 99991111", 10101);
        Curso curso1 = new Curso("Engenharia de Software", 8, coordenador1);

        // Criando professores
        Professor professor1 = new Professor("Luis Araujo", "000.000.000-00", "Rua X, Bairro U", "(71) 987662577", 12345);
        Professor professor2 = new Professor("Maria Oliveira", "111.111.111-11", "Rua Y, Bairro V", "(71) 988887766", 67890);

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
        double[] notasEstudante1 = {8, 6, 7};
        estudante1.setNotas(notasEstudante1);

        double[] notasEstudante2 = {5, 4, 6};
        estudante2.setNotas(notasEstudante2);

        double[] notasEstudante3 = {3, 2, 1};
        estudante3.setNotas(notasEstudante3);

        double[] notasEstudante4 = {9, 8, 7};
        estudante4.setNotas(notasEstudante4);

        double[] notasEstudante5 = {6, 7, 6};
        estudante5.setNotas(notasEstudante5);

        // Exibindo informações da turma
        System.out.println("=== Detalhes da Turma 1 ===");
        turma1.printTurmaDetails();

        // Estatísticas
        System.out.println("\n=== Estatísticas da Turma ===");
        gerarEstatisticas(turma1);

        // Atribuindo notas de recuperação
        estudante2.setNotaRecuperacao(6.0); // Estudante 2 vai para recuperação
        logAlteracaoNota(estudante2.getNome