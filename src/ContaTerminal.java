import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        /*
         * TODO
         * Conhecer e importar a classe Scanner
         * Exibir as mensagens para o usuário
         * Obter pelo Scanner os valores digitados
         * Exibir a mensagem criada
         */

        int numero = 0;
        String agencia = "", nomeCliente = "";
        double saldo = 0;

        System.out.println("Por favor, digite a unidade da sua Agência !");
        numero = sc.nextInt();

        System.out.println("Digite a Agência\n");
        agencia = sc.next();

        System.out.println("Digite o nome do cliente\n");
        nomeCliente = sc.next();

        System.out.println("Digite o saldo\n");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " , conta "
                + numero + " e seu saldo " + saldo + " já está disponível para saque! \n");
    }
}
