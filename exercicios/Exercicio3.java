import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        var number1 = sc.nextInt();
        System.out.println("Digite outro valor maior que o primeiro");
        var number2 = sc.nextInt();
        while (number1 > number2) {
            System.out.printf("Número invalido, digite um número maior que o primeiro, %s \n", number1);
            number2 = sc.nextInt();
        }
    }
    
}
