import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da agência (ex:123-4)");
        var agencia = sc.next();
        System.out.println("Digite o número da conta: (ex:1234)");
        var numero = sc.nextInt();
        System.out.println("Digite o seu nome (ex: Ciclano Santos)");
        sc.next();
        var nomeCliente = sc.nextLine();
        System.out.println("Digite o valor depositado (ex> 1234,56)");
        var saldo = sc.nextFloat();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nomeCliente, agencia, numero, saldo);

    }
}
