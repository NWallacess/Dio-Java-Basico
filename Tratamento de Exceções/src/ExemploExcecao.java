import java.util.NumberFormat;


public class ExemploExcecao {
    public static void main(String[] args){

        Number valor = Double.value0f("a1.75");

        valor = NumberFormat.getInstance().parce("a1.75");

        System.out.println(valor);


    }
}

