import java.util.Scanner;
import Exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int n2 = sc.nextInt();

        try {
            contar(n1, n2);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i < contagem ; i++){
                System.out.println("Imprimindo o número " + (i+1));
            }
        }
    }
}