import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Criando um doador e adicionando informações
            Doador doador = new Doador("Nome inicial", 123456789);
            System.out.println("Adicionando informações para o doador:");
            doador.adicionarInformacao();

            // Criando um relatório e gerando o relatório
            System.out.println("Adicionando informações para o relatório:");
            System.out.print("Informe a data (YYYYMMDD): ");
            int data = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            System.out.print("Informe o tipo de doação: ");
            String tipoDeDoacao = scanner.nextLine();

            System.out.print("Informe a quantidade: ");
            double quantidade = scanner.nextDouble();

            Relatorio relatorio = new Relatorio(doador.nome, doador.cpf, data, tipoDeDoacao, quantidade);
            relatorio.gerarRelatorio();
        }
    }

  
  }
}