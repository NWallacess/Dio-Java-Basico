package aprendendoasintaxejava.metodos;

public class usuario {
    
    public static void main(String[] args) throws Exception{
        
        smartTV smartTV = new smartTV();

       
        System.out.println("TV Ligada ? " + smartTV.ligada);
        System.out.println("Canal Atual : " +smartTV.canal);
        System.out.println("Volume Atual: " +smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV ligada ?"  +smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        System.out.println(" Novo Status -> Volume atual? " +smartTV.volume);

        smartTV.diminuirCanal();
        smartTV.diminuirCanal();
        smartTV.subirCanal();
        smartTV.mudarCanal(13);

        smartTV.desligar();
        System.out.println("Novo Status -> TV ligada ? " +smartTV.ligada);


    }

}
