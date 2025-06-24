import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        var number = sc.nextInt();

        for (var i = 1; i<=10; i++ ){
            var result = number * i;
            System.out.printf("%s x %s = %s \n", i, number, result);
        }
    }
    
}
