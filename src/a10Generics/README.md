# Generics

Generics permitem criar classes, interfaces e métodos que trabalham com tipos parametrizados, aumentando a segurança de tipos e evitando casts desnecessários.

Exemplo sem generics:

    List lista = new ArrayList();
    lista.add("João");
    lista.add("Maria");

    String nome = (String) lista.get(0);

Nesse exemplo o compilador não garante que só haverá String na lista.

Exemplo com generics:

    List<String> lista = new ArrayList<>();

    lista.add("João");
    lista.add("Maria");

    String nome = lista.get(0);

Nesse exemplo o compilador garante que a lista só aceita String.

## Classes genericas

Classes Genéricas (Generics) em Java permitem criar classes, interfaces e métodos que trabalham com diferentes tipos de dados de forma segura, evitando casts desnecessários e erros em tempo de compilação.

Vantagens dos Generics:

- Segurança de tipos em tempo de compilação.
- Menos casts.
- Código mais reutilizável.
- Melhor legibilidade e manutenção.

Convenções dos parâmetros genéricos:

- T Type (Tipo)
- E Element
- K Key (Chave)
- V Value (Valor)
- N Number
- R Result

## Métodos genericos

Métodos Genéricos são métodos que possuem seu próprio parâmetro de tipo T, independentemente da classe ser genérica ou não.

Diferença entre classe generica e método generico:

Na classe genérica o tipo vale para toda a classe; no método genérico o tipo existe apenas durante a execução daquele método.
