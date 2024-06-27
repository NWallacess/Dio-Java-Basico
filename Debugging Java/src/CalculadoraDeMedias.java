import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] alunos = {"Camila","Lucas", "Bruna","Pedro"};

        double media = calcularMediaDaTurma(alunos, scan);

        System.out.printf("Media da turma %.1f",media);
    }

    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner){

        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do alunos %s: ", aluno);
            double nota = scanner.nextDouble();
            soma+= nota;
        }
        return soma/ alunos.length;
    }
}