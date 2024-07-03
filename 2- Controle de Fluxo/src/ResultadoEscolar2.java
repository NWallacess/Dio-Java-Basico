public class ResultadoEscolar2 {
    public static void main(String[] args){
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    //A condição já esta dentro do processo de atribuição, dispensando a necessiade de criar uma condicional para isso.
    
        int nota2 = 6;
        String resultado2= nota2 >= 7? "Aprovado": nota2>=5 && nota2<7? "Recuperação" : "Reprovado";
        System.out.println(resultado2);



}
}
