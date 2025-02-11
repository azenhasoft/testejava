import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CadastroDados {

    public static void main(String[] args) {
        // Mapa para armazenar os dados (chave -> valor)
        Map<String, String> dados = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Incluir dado");
            System.out.println("2 - Alterar dado");
            System.out.println("3 - Excluir dado");
            System.out.println("4 - Consultar dado");
            System.out.println("5 - Sair");

            System.out.print("Digite a opção desejada: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    incluirDado(dados, scanner);
                    break;
                case "2":
                    alterarDado(dados, scanner);
                    break;
                case "3":
                    excluirDado(dados, scanner);
                    break;
                case "4":
                    consultarDado(dados, scanner);
                    break;
                case "5":
                    System.out.println("Saindo do programa.");
                    scanner.close(); // Fechar o scanner
                    return; // Encerra o programa
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    // Função para incluir um novo dado
    private static void incluirDado(Map<String, String> dados, Scanner scanner) {
        System.out.print("Digite a chave para o novo dado: ");
        String chave = scanner.nextLine();
        System.out.print("Digite o valor para o novo dado: ");
        String valor = scanner.nextLine();
        dados.put(chave, valor);
        System.out.println("Dado incluído com sucesso!");
    }

    // Função para alterar um dado existente
    private static void alterarDado(Map<String, String> dados, Scanner scanner) {
        System.out.print("Digite a chave do dado que deseja alterar: ");
        String chave = scanner.nextLine();
        if (dados.containsKey(chave)) {
            System.out.print("Digite o novo valor para o dado: ");
            String novoValor = scanner.nextLine();
            dados.put(chave, novoValor);
            System.out.println("Dado alterado com sucesso!");
        } else {
            System.out.println("Dado não encontrado.");
        }
    }

    // Função para excluir um dado existente
    private static void excluirDado(Map<String, String> dados, Scanner scanner) {
        System.out.print("Digite a chave do dado que deseja excluir: ");
        String chave = scanner.nextLine();
        if (dados.containsKey(chave)) {
            dados.remove(chave);
            System.out.println("Dado excluído com sucesso!");
        } else {
            System.out.println("Dado não encontrado.");
        }
    }

    // Função para consultar um dado existente
    private static void consultarDado(Map<String, String> dados, Scanner scanner) {
        System.out.print("Digite a chave do dado que deseja consultar: ");
        String chave = scanner.nextLine();
        if (dados.containsKey(chave)) {
            System.out.println("Valor do dado: " + dados.get(chave));
        } else {
            System.out.println("Dado não encontrado.");
        }
    }
}
