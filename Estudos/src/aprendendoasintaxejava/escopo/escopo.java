package aprendendoasintaxejava.escopo;

public class escopo {
    //variavel da classe conta
    double saldo = 10.0;

    public void sacar( Double valor){
        //variavel local de método
        double novaSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        //disponivel em toda classe
        System.out.println(saldo);
        //soment o método sacar conhece esta variavel
        System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial(){
        //varivel local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; //começando a variável com valor zero
        for(int x=1; x<=5 ; x++){//x variável de escopo de fluxo
            //esta variável será reiniciada acada execução for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }

    //escopo de fluxo
    //x e valorCalculado nunca estarão disponíveis fora do for
    
    return valorMontante;
    }
}
