import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0 ;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "  + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                 System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
                 candidatosSelecionados++;
            }
        }

        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }    

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato Realizado com Sucesso");

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " tentativa");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO" 
            + tentativasRealizadas + " REALIZADA!");
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirSelecionados(){
        String [] candidadtos = {"Felipe", "Marcia", "Julia", "Paula", "Augusto"};
        System.out.println("Imprimindo a lista de candidadtos informando o indice do elemento");

        for(int indice = 0; indice < candidadtos.length; indice++){
            System.out.println("O candidadto de nº" + (indice+1) + " é o " + candidadtos[indice]);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void analisarCandidato(double salarioPretentido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretentido){
            System.out.println("Ligar para o candidato");
        } else if ( salarioBase == salarioPretentido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos!");
        }
    }
}
