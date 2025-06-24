import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        var number = sc.nextInt();
        var keepVerify = true;

        while (keepVerify) {
            System.out.println("Informe o número para verificação");
            var toVerify = sc.nextInt();
            if (toVerify < number) {
                System.out.printf("Informe um número maior que %s\n", number);
                continue;
            }
            var result = toVerify % number;     
            keepVerify = toVerify % number == 0;
            System.out.printf("%s %% %s = %s \n", toVerify, number, result);

        }
    }
    
}
