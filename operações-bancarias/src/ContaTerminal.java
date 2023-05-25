import java.util.Scanner;

public class ContaTerminal {

    public static void main (String[] args)  {
        
        Scanner scan = new Scanner (System.in);

        System.out.println("Por favor, digite seu nome completo: ");
        String nome = scan.next();

        System.out.println("Prazer te receber novamente! Por favor, digite o número da sua conta: ");
        int conta = scan.nextInt();

        System.out.println("Excelente! Agora digite o número da sua agência: " );
        String agencia = scan.next();

        System.out.println("Agora seu saldo atual: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + "conta de número " + conta + " e seu saldo de " + saldo + " já está disponível para saque!");
        }
}