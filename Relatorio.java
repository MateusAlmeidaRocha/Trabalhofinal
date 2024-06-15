import java.util.Scanner;
class Relatorio extends Doacao {
    int data;
    String tipoDeDoacao;
    double quantidade;
    String x;

    public Relatorio(String nome, int cpf, int data, String tipoDeDoacao, double quantidade) {
        super(nome, cpf);
        this.data = data;
        this.tipoDeDoacao = tipoDeDoacao;
        this.quantidade = quantidade;
    }

    public void gerarRelatorio() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Você gostaria de ver o relatório? (s/n) ");
        x = teclado.next();
        if (x.equals("s")) {
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Data: " + data);
            System.out.println("Tipo de doação: " + tipoDeDoacao);
            System.out.println("Quantidade: " + quantidade);
        } else if (x.equals("n")) {
            System.out.println("Ok, obrigado por doar");
        }
    }
}
