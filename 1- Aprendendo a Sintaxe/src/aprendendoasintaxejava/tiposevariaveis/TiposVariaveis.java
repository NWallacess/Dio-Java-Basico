package aprendendoasintaxejava.tiposevariaveis;
public class TiposVariaveis {
    public static void main (String[] args){
    byte idade = 123;
	short ano = 2021;
	int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
	long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
	float pi = 3.14F;
	double salario = 1275.33;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal;

    int numero = 5;

    numero = 10;
    //System.out.print(numero);

    final double VALOR_DE_PI = 3.14;
    //VALOR_DE_PI = 3.1415;
    System.out.print(VALOR_DE_PI);
}
}