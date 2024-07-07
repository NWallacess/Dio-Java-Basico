//Importando bibliotecas
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        //Criando inputs

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Ola, " + nomeCliente + "!\nPrezado poderia informar seu numero de conta para a consulta do saldo?");
        int numeroConta = scanner.nextInt();

        System.out.println("Por gentileza, poderia informar támbem o numero da agencia? ");
        String numeroAgencia = scanner.next();

        double saldo = 500.00f;

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque!");
        
    
    
    }
}