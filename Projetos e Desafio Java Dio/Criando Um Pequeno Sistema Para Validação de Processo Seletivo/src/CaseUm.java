import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class CaseUm {
    public static void main(String[] args) {
        
        ligarPraCandidato("FELIPE");
    }

    static void analisarCanditato(Double pretencaoSalarial){
        double salarioBase = 2000.0;
        if(salarioBase>pretencaoSalarial)
            System.out.println("LIGAR PARA O CANDIDATO.");
        else if(salarioBase==pretencaoSalarial){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }

    static void selecaoDeCanditados(){
        double salarioBase = 2000.0;
        int totalSelecionado = 0;
        int indiceCandidaturas =0;
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        while (totalSelecionado<5 && indiceCandidaturas<candidatos.length) {
            String candidatoAtual = candidatos [indiceCandidaturas++];
            Double pretencaoSalarial = valorPrentendido();
                if(salarioBase<pretencaoSalarial){
                    System.out.println("Canditado "+ candidatoAtual + " tem como pretenção salarial de R$"+pretencaoSalarial+"\nQue pena... Candidato não selecionado");

                }
                else{
                    System.out.println("Canditado "+ candidatoAtual + " tem como pretenção salarial de R$"+pretencaoSalarial+"\nQUE LEGAL!!! Candidato selecionado!");
                    totalSelecionado++;
                }
            
        }
    }

    static double valorPrentendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }    
    
    static void imprimirRH(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        String candidatoSelecionado = "";
        for(int x=0;x<candidatos.length;x++){
            candidatoSelecionado = candidatos[x];
            System.out.println("Canditado "+ candidatoSelecionado+" foi selecionado." );
        }
    }

    static void ligarPraCandidato(String candidato){
        int tentativasRealizadas =1;
        boolean continuarTentando = true;
        boolean atendeu = false;
            do{
                atendeu = tocando();
                continuarTentando = !atendeu;
                if(continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("CONTATO REALIZADO COM SUCESSO");                    
            }while(tentativasRealizadas<=3 && continuarTentando);

        if(atendeu)
		    System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
	}
	
	//método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}


    static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==2;
        return atendeu;
    }
}