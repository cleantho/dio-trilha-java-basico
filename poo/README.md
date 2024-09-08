## [POO - Desafio](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)

### Diagrama UML utilizando [Mermaid](https://mermaid.js.org/):

```mermaid
---
title: Diagrama UML
---
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar() void*
        +pausar() void*
        +selecionarMusica(String nome) void*
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero) void*
        +atender() void*
        +iniciarCorreioVoz() void*
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url) void*
        +adicionarNovaAba() void*
        +atualizarPagina() void*
    }

    class iPhone {        
        +tocar() void
        +pausar() void
        +selecionarMusica(String nome) void
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    ReprodutorMusical <|.. iPhone
    AparelhoTelefonico <|.. iPhone
    NavegadorInternet <|.. iPhone   
```

Referências:
- [ibm.com](https://www.ibm.com/docs/pt-br/rsas/7.5.0?topic=relationships-implements) 

   Relacionamentos de implementos em diagrama de classes UML (Desenvolvendo visualmente relacionamentos entre elementos Java usando diagramas de classes UML)
- [Mermaid](https://mermaid.js.org/) 

    Class diagrams -> Defining Relationship -> Realization