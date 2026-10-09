# Coleções

Uma coleção é uma estrutura utilizada para armazenar e manipular grupos de objetos. As coleções fazem parte do Java Collections Framework (JCF), que fornece classes e interfaces para organizar dados de diferentes formas.

Principais interfaces:

- List: permite elementos duplicados e mantém a ordem de inserção.
- Set: não permite elementos duplicados.
- Queue: utilizada para processamento em fila.
- Map: armazena pares chave-valor.

## Método Equals

Quando queremos comparar se dois inteiros são iguais, podemos usar o operador de igualdade (==):

    int i = 2;
    System.out.println(i == 2);
    
Isso retornará true, pois a variável i possui o valor 2, que é igual a 2.

Quando queremos fazer essa comparação de igualdade com objetos, como string, o operador == não é a melhor opção, pois ele compara referências de memoria, ou seja, ele vai olha se as duas variáveis apontam para o mesmo objeto.

Por exemplo:

    String nome1 = "Patrick";
    String nome2 = new String("Patrick");
    System.out.println(nome1 == nome2);

Nesse caso, será exibido false, porque nome1 e nome2 referenciam objetos diferentes, mesmo ambas contendo o mesmo texto.

Para que a igualdade possa ser comparada de maneira correta entre as trings, utilizamos o método equals(). Esse método compara a igualdade lógica definida pela classe. Para a classe String, por exemplo, ele compara o conteúdo do texto armazenado nos objetos.

    String nome1 = "Patrick";
    String nome2 = new String("Patrick");
    System.out.println(nome1.equals(nome2))

Agora terá uma saida true, pois o conteúdo das duas strings é exatamente o mesmo.

## Relação com coleções
