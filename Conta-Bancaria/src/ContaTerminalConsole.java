import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Nome do Cliente:");
        String nome = scanner.next();

        System.out.println("Número da agência:");
        String agencia = scanner.next();

        System.out.println("Número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println(nome +", sua conta foi criada com sucesso na agência "+ agencia +" e conta "+ conta +" com saldo inicial de R$"+ saldo +".");
        
    }
}
