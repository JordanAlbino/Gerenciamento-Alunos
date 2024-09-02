package GerenciarAluno;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         Escola sistema = new Escola();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Adicionar Nota");
            System.out.println("3. Listar Alunos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Aluno: ");
                    String nome = scanner.nextLine();
                    sistema.adicionarAluno(nome);
                    break;
                case 2:
                    System.out.print("Nome do Aluno: ");
                    nome = scanner.nextLine();
                    System.out.print("Nota: ");
                    double nota = scanner.nextDouble();
                    sistema.adicionarNota(nome, nota);
                    break;
                case 3:
                    sistema.listarAlunos();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
