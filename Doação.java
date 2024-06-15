import java.util.Scanner;

class Doacao {
    String nome;
    int cpf;

    public Doacao(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void adicionarInformacao() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva o nome: ");
        nome = teclado.next();
        System.out.println("Escreva o CPF: ");
        cpf = teclado.nextInt();
    }
}
