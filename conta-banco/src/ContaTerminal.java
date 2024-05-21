import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o numero !");
        int numero = scan.nextInt();
        System.out.println("Por favor, digite o numero da Agencia !");
        String agencia = scan.next();
        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = scan.next();
        System.out.println("Por favor, digite o saldo !");
        double saldo = scan.nextDouble();
        System.err.println("Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque");
        scan.close();
    }
}
