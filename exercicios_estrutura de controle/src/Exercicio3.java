import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        var number1 = sc.nextInt();
        System.out.println("Digite outro valor maior que o primeiro");
        var number2 = sc.nextInt();
        while (number2 < (number1+1)) {
            System.out.printf("Número invalido, digite um número maior que o primeiro, %s \n", number1);
            number2 = sc.nextInt();
        }
        System.out.println("Digite 'P' para PAR ou 'I' para IMPAR");
        var letter = sc.next().toUpperCase();

        while (!(letter.equals("P")) & !(letter.equals("I"))) {
            System.out.println ("Letra invalidade, digite 'P' para 'PAR' ou I para 'IMPAR'");
             letter = sc.next().toUpperCase();
        }
        if (letter.equals("P")) {
            System.out.printf("Estes são os números pares entre o intervalo de %s e %s: \n", number2, number1);
          for (var i = number2; i >= number1; i-=2){
                System.out.print(i + " ");
          }
        } else {
            for (var i = number2; i >= number1; i--){
                if (i % 2 == 1){
                System.out.print(i + " ");
                }
            }
        }

    }
    
}
