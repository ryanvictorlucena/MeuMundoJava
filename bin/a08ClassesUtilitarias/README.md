# Classes Utilitárias

Geralmente refere-se a métodos estáticos de apoio, simplificando operações comuns sem a necessidade de instanciar objetos. Funcionam como ferramentas auxiliares para manipulação de dados e outras operações.

## Wrappers

São objetos que encapsulam tipos primitivos (byte, short, int, long, float, double, char, boolean), aqueles tipos que só gardam um valor na memória. Um wrapper é criado mudando a inicial do tipo para maiúscula, com exceção do tipo inteiro e caracter (int -> Integer e char -> Character).

Existem métodos auxiliares muito úteis que em algum momento serão necessários

    - Métodos parse, alteram uma string númerica para um número, por exemplo:

        int i = Integer.parseInt("1");

    - ValueOF, converte uma string para objeto wrapper correspondente, por exemplo:

        Float f = Float.valueOf("2,5");

    - ToString, converte um valor númerico para string:

        String texto = Integer.toString(123);
    
    - isDigit, retorna um booleano indicando se algo é um dígito ou não.

    - isUpperCase/isLowerCase, retorna um booleano indicando se algo está em maiúsculo ou mininusculo.

    - toUpperCase/toLowerCase, muda algo passado como parametro para maiúsculo ou minusculo, respectivamente.
    