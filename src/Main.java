import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao, idade;
        String nome;

        do {
            System.out.println("\n==============================");
            System.out.println("      CADASTRO DE PESSOAS");
            System.out.println("==============================");
            System.out.println("(1) Cadastrar pessoa");
            System.out.println("(2) Listar pessoas");
            System.out.println("(3) Remover pessoa");
            System.out.println("(4) Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();

                    System.out.print("\nDigite o nome: ");
                    nome = scanner.nextLine();

                    System.out.print("Digite a idade: ");
                    idade = scanner.nextInt();

                    Pessoa pessoa = new Pessoa(nome, idade);
                    pessoas.add(pessoa);

                    System.out.println("\n✅ Pessoa cadastrada com sucesso!");
                    break;

                case 2:
                    System.out.println("\n========== PESSOAS CADASTRADAS ==========");

                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        for (Pessoa p : pessoas) {
                            System.out.println(p);
                        }
                    }

                    System.out.println("=========================================");
                    break;

                case 3:
                    scanner.nextLine();

                    System.out.print("\nDigite o nome da pessoa que deseja remover: ");
                    nome = scanner.nextLine();

                    boolean removido = false;

                    for (int i = 0; i < pessoas.size(); i++) {
                        if (pessoas.get(i).getNome().equalsIgnoreCase(nome)) {
                            pessoas.remove(i);
                            removido = true;
                            System.out.println("\n✅ Pessoa removida com sucesso!");
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("\n❌ Pessoa não encontrada.");
                    }

                    break;

                case 4:
                    System.out.println("\nEncerrando o programa...");
                    break;

                default:
                    System.out.println("\n❌ Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
}