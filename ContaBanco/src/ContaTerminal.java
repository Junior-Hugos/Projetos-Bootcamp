import java.rmi.dgc.DGC;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta!");
        String agencia = scanner.next();

        System.out.println("Por favor, Digite o seu Nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, Digite o seu Sobrenome!");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, qual o valor quer sacar!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + " " + sobrenomeCliente
                + ", Obrigado por criar uma conta em nosso banco, A sua agência é "
                + numero + " e a sua conta é " + agencia + " e seus saldo é R$ " + saldo
                + " e já está disponível para saque!");

    }
}
