package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos);
    }

    static void entrandoEmContato(String candidato) {
         int tentativasRealizadas = 1;
         boolean continuarTentando = true;
         boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        }while (continuarTentando && tentativasRealizadas <3);

    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidato, informando o indice do elemento");

        for(int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de numero " + i + " é o " + candidatos[i]);

            System.out.println("Forma abreviada de interação, for each!");
        }

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi o " + candidato);
        }
    }

    static void selecaoCadidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "MIRELA", "DANIELA", "JOÃO"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
