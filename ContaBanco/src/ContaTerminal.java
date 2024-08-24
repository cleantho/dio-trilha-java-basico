import java.util.InputMismatchException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-br"));

        // Exibir as mensagens para o nosso usuário
        // Obter pela Scanner os valores digitados no terminal
        System.out.print(" Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.print(" Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        boolean repeat;
        int numero = 0;
        do {
            repeat = false;
            System.out.print(" Por favor, digite o número da conta: ");
            try {
                numero = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("   Por favor, digite apenas números!");
                repeat = true;
                scanner.next();
            }
        } while (repeat);

        double saldo = 0;
        do {
            repeat = false;
            System.out.print(" Por favor, digite o saldo da conta: ");
            try {
                saldo = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("   Por favor, digite apenas números e vírgula!");
                repeat = true;
                scanner.next();

            }
        } while (repeat);
        
        scanner.close();
        
        // Exibir as mensagens da conta criada
        NumberFormat formatoBr = NumberFormat.getNumberInstance();
        System.out.println("Olá ".concat(nome)
                + ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia)
                + ", conta "
                + numero
                + " e seu saldo "
                + formatoBr.format(saldo)
                + " já está disponível para saque.");
    }
}
