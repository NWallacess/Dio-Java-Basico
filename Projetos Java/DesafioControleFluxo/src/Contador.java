import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int parametroUM = 0;
        int paramentroDOIS = 0;
        //Criando inputs
        System.out.println("Informe o primeiro parametro: ");
        parametroUM = scanner.nextInt(); 
    
        System.out.println("Informar o segundo paramento: ");
        paramentroDOIS = scanner.nextInt();

    try{contar(parametroUM, paramentroDOIS);
    }catch(ParamentrosInvalidosException e ){
        System.out.println("Opa, aconteceu um erro!!! O parametro um é maior que o parametro dois. ");
    }

}
              

    static void contar(int paramentro_1, int paramentro_2) throws ParamentrosInvalidosException {
    int contador = paramentro_2-paramentro_1;
        if(contador<0)
            throw new ParamentrosInvalidosException();
        else
    for(int x =1; x<=contador ; x++ ){
        System.out.println("Imprimindo o número "+ x);
        }
    }
}    
