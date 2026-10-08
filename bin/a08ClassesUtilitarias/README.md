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

## String

Em java strings são imutáves, ou seja, não pode ser alterada. Quando fazemos uma operação onde modificamos uma string, na verdade um novo objeto em memória é criado e o valor antigo é perdido, por exemplo:

    String nome = "Ryan";
    nome.concat(" Victor");
    System.out.println(nome);

    saida:
    Ryan

Para que uma alteração seja feita, aquele valor de nome deve ser sobrescrito pelo novo valor, por exemplo:

    String nome = "Ryan";
    nome = nome.concat(" Victor");
    System.out.println(nome);

    saida:
    Ryan Victor

A referência ao objeto de memória que antes estava associado a nome = "Ryan", agora passa a referênciar um novo objeto, nome = "Ryan Victor".

### StringBuilder

Uma classe utilitária criada para lidar com essas situações de imutabilidade de strings em java. Permite a manipulação de texto de forma mutável, ou seja, o conteúdo pode ser alterado sem a necessidade de criar um novo objeto. É recomendado usar o StringBuilder quando não há multiplas threads acessando o mesmo objeto, um exemplo de uso:

    StringBuilder sb = new StringBuilder("Meu");
    sb.append(" mundo").append(" java");
    System.out.println(sb.toString());

    saida:
    Meu mundo java

### StringBuffer

Assim como o StringBuilder é uma classe utilitária que permite a manipulação de texto, podendo altera-los. Mas, é usada geralmente em situações onde várias threads podem acessar o mesmo objeto. Um exemplo de uso de StringBuffer (que por sinal é parecido com o StringBuilder):

    StringBuffer sb = new StringBuffer("Meu");
    sb.append(" mundo").append(" java");
    System.out.println(sb.toString());

    saida:
    Meu mundo java

### Expressões Regulares - Regex

Uma linguagem utilizada para buscar, validar e manipular textos usando padrões.

- Pattern: É uma classe que compila a expressão regular.

    String texto = "a";
    Pattern pattern = Pattern.compile(texto);

Aqui o pattern representa o padrão de busca "a".

- Matcher: É a classe que aplica o padrão em um texto.

    Matcher matcher = pattern.matcher("banana");

Aqui o matcher vai aplicar o padrão "a" sobre a string banana. Para encontrar as ocorrências usamos o método find()

    while (matcher.find()) {
        System.out.print(matcher.group()) --> retorna o conteúdo encontrado
        System.out.print(matcher.start()) --> retorna a posição onde a ocorrência começa
        System.out.print(matcher.end()) --> retorna a posição após o imediato ultimo caractere encontrado
    }
