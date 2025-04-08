
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bem vindo ao seu banco!");
        System.out.println("Digite o número da sua conta:");
        numero = entrada.nextInt();
        System.out.println("Digite o número da agência:");
        entrada.nextLine();
        agencia = entrada.nextLine();
        System.out.println("Digite o seu nome:");
        nomeCliente = entrada.nextLine();
        System.out.println("Digite o saldo da sua conta:");
        saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque");

        entrada.close();
    }
}
