import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua altura (ex: 1,50)");
        var heigth = sc.nextDouble();
        System.out.println("Digite o seu peso");
        var weigth = sc.nextDouble();
        var imc = weigth/(heigth*heigth);
        var message = "";

       if (imc <= 18.5){
            message = "Abaixo do peso";
       } else if (imc < 25){
            message = "Peso Ideal";
       } else if (imc < 30) {
            message = "Levemente acima do peso";
       } else if (imc < 35) {
            message = "Obesidade Grau I";
       } else if (imc < 40) {
            message = "Obesidade Grau II (Severa)";
       } else {
            message = "Obesidade III (Mórbida)";
       }

       System.out.printf("Seu IMC é %.2f, siginifica que está: %s", imc, message);
        
    }
    
}
