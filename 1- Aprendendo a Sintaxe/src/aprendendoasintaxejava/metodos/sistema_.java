package aprendendoasintaxejava.metodos;

public class metodoExemploTexto {
    
    public double somar(int num1, int num2){
        //LOGICA - FINALIDADE DO MÉTODO
        return ... ;
    }

    public void imprimir (String texto){
        //LOGICA - FINLIDADE DO METODO
        //AQUI NÃO PRECISA DO RETURN
        //POIS NÃO SERA RETORNADO NENHUM RESULTADO
    }

    //throws Exception : indica que o método ao ser utilizado
    //poderá gerar uma exceção

    public double dividir(int dividendo, int divisor) throws Exception{}

    //este método não pode ser visto por outras classe no projeto
    private void metodoPrivado(){}

    //alguns equivocos estruturais
    public void validar(){
        //esse método deveria retornar algum valor
        //no cqaso boolean (true ou false)
    }
    
    public void calcularEnviar(){
        //um método deve representaruma única responsabilidade
    }

    public void gravarCliente(String nome, String cpf, Integer telefone, ...){
        //este método tem a finalidade de gravar
        //informações de um cliente, por que não criar
        //um objeto cliente e passar como parâmetro ?
        //veja abaixo
    }

    public void gravarCliente(Cliente cliente){

    }
    // ou
    public void gravar(Cliente cliente){
        
    }
}
