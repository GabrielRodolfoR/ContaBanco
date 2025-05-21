public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        System.out.println("Bem-vindo ao banco Java!");

        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Gabriel Rodolfo";
        double saldo = 237.48;

        System.out.println("Para prosseguir, digite o número da Agência: ");

        System.out.println("====== DADOS DA CONTA ======");
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é: "
                + agencia + ", conta nº " + numero + ". Seu saldo de: R$" + saldo + " já está disponível para saque!");
        System.out.println("============================");
    }
}
