package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main (String[] args){
/*      analisarCandidato(1900.);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        System.out.println("Processo Seletivo");*/
        String[] candidatos = {"Felipe", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato (String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas <3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados () {
        String[] candidatos = {"Felipe", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int i=0; i < candidatos.length; i++){
            System.out.println("O candidato de nº "+  (i+1) + " é " + candidatos[i]);
        }
        System.out.println("Forma abreviada da interação for each");
        for (String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados< 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("o candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++ ;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGA PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGA PARA CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDAR DEMAIS CANDIDATOS");
        }
    }
}
