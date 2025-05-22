import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bem-vindo ao banco Java!");

        // Bloco para coleta de Informações do Usuário
        System.out.println("Para Inciar, digite seu Nome Completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Bem Vindo, " + nomeCliente + ". Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Saldo atual: ");
        double saldo = scanner.nextDouble();

        // Interface de Exbição das informações do cliente:
        System.out.println("====== DADOS DA CONTA ======");
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "
        + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque!");
        System.out.println("============================");

        // Fecha o Scanner
        scanner.close();
    }
}