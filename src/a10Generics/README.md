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
