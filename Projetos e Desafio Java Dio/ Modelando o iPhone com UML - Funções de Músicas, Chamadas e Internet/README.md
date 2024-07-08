## Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet

```mermaid
classDiagram
    class ReprodutorMusical {
        +selecionarMusica(String musica)
        +pausar()
        +tocar()
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +atualizarPaginas()
        +adicionarNovaAba()
        +exibirPaginas(String url)
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
´´´ 