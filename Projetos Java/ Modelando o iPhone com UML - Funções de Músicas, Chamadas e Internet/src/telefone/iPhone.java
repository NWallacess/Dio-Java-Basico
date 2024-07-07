package telefone;
import reprodutor_musical.*;
import aparelho_telefonico.*;
import navergador_na_internet.*;

public class iPhone implements ReprodutorMusical,AparelhoTelefonico,NavegarNaInternet {
    public static void main(String[] args) {
        
    }

    //imports funcionalidades reprodutor_musical
    public void pausar(){}

    public void tocar(){}

    public void selecionarMusica(String musica){
        System.out.println("Reproduzindo Musica"+musica);
    }
    //imports funcionalidades navergador_na_internet
    public void adicionarNovaAba(){}

    public void exibirPaginas(String url){
        System.out.println("Carrendo pagina "+url);
    }

    public void atualizarPaginas(){}
    //imports funcionalidades aparelho_telefonico
    public void ligar(String numero){
        System.out.println("Discando... Numero: "+numero);
    }

    public void atender(){}

    public void iniciarCorreioVoz(){}


}
