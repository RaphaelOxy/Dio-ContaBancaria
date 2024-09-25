import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome completo: ");
        String NomeCliente = sc.next();
        String Sobrenome = sc.next();
        System.out.println("Por favor, digite o número da Agência!");
        String Ag = sc.next();
        System.out.println("Digite o número da conta: ");
        int nConta = sc.nextInt();
        System.out.println("Saldo: ");
        double Saldo = sc.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Ag + ", conta " + nConta + " e seu saldo " + Saldo + " já está disponível para saque.");


    }
}