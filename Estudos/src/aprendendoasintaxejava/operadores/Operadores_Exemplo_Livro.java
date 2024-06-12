package aprendendoasintaxejava.operadores;

public class Operadores_Exemplo_Livro {
    public static  void main(String[] args){
    // Classe Operadores.java
    
    // Atribuição
    String nome = "Gleyce";
    int idade = 22;
    double peso = 68.5;
    char sexo = 'M';
    boolean doadorOrgão = false;
    
    // Aritméticos
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicação = 20 * 7;
    int divisão = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + ( 20 / 4);

    // Concatenação de textos

    String nomeCompleto = "LINGUAGEM" + "JAVA";
    System.out.println(nomeCompleto);

    //Exemplo concatenção de texto 

    String concatenacao = "?";
    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);
    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);
    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);
    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);
    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);
    
    // Unitarios
    int numero = 5;
    System.out.println( - numero);
    numero = - numero;
    System.out.println( + numero);

    // incrementação ou repetição

    numero = numero + 2;
    System.out.println(numero);
    numero = numero ++;
    System.out.println(numero--);
    System.out.println(numero);

    // trabalhando com booleano
    boolean varivel = false;
    System.out.println(!varivel);
    System.out.println(varivel);
    varivel = !varivel;
    System.out.println(varivel);

    // ternário

    int a, b;

    a = 5;
    b = 6;

    //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    String resultadoA = (a==b) ? "verdadeiro" : "false";
    if(a==b)
        resultadoA = "verdadeiro";
    else
        resultadoA = "falso";
    
    System.out.println(resultadoA);

    // relacionais

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if( numero1 < numero2){
        System.out.println("A nossa condição é verdadeira");
    }
    if(numero1 > numero2){
        System.out.println("A nossa condição é verdadeira");
    }

    // Logicos

    boolean condicao1 = true;
    boolean condicao2 = false;

    if (condicao1 && condicao2) {
        System.out.println("As duas condições são verdadeiras.");
    }

    if (condicao1 || condicao2){
        System.out.println("Uma das condições é verdadeira.");
    }

    }

}
