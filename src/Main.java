import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("""
                    ( 1 ) Cadastrar pessoa
                    ( 2 ) Listar pessoas
                    ( 3 ) Remover pessoa
                    ( 4 ) Sair
                    """);
            opcao = scanner.nextInt();

            if(opcao == 4) {
                System.out.println("Encerrando o programa...");
            }

        } while (opcao != 4);

    }
}
