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

O método equals() é muito importante em coleções do Java, como List, Set e Map, pois essas estruturas utilizam esse método para verificar se dois objetos devem ser considerados iguais. Por isso, quando criamos nossas próprias classes, geralmente precisamos sobrescrever os métodos equals() e hashCode() para que as coleções funcionem corretamente.

### Melhorias realizadas

Gramática

- Corrigido "pra" para "para".
- Corrigido "por que" para "porque" quando usado como explicação.
- Ajustado uso de vírgulas.

Clareza

- Substituído "olhar se é o mesmo objeto" por "verifica se as duas variáveis apontam para o mesmo objeto".
- Explicado que equals() realiza uma comparação lógica do conteúdo.

Formatação

- Separação em parágrafos mais curtos.
- Uso de blocos de código para facilitar a leitura.
- Inclusão de uma seção explicando a relação entre equals() e coleções Java.

## HashCode

O método hashCode() retorna um número inteiro que representa um objeto. Ele é utilizado principalmente por coleções baseadas em hash, como HashSet, HashMap e Hashtable.

O principal objetivo do hashCode() é ajudar o java a encontrar objetos de forma mais rápida, sem precisar comparar todos os elementos da coleção.

Exemplo:

    String nome = "Patrick";
    System.out.println(nome.hashCode());

Saída:

    871255254

### Relação do equals e do hashCode

Existe uma regra muito importante:

    Se dois objetos são iguais pelo método equals(), eles obrigatoriamente devem possuir o mesmo hasCode().

Por isso, sempre que sobrescrevermos (override) o método equals(), geralmente também devemos sobrescrever hashCode().

Em resumo, o hashCode() te diz onde procurar enquanto que o equals() te confirma se aquele é o objeto correto.

## Lista

Em java, uma lista é uma coleção que armazena elementos em sequência, permitindo elementos duplicados e acesso por índices.
A implemenetação mais usada de uma lista é o ArrayList.

    import java.util.ArrayList;
    import java.util.List;

    public class Main {
        public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");

        System.out.println(nomes);
        }
    }

    saída:

    [João, Maria, Pedro]

### Operações em Listas

As principais operações que são realizada em listas são:

- add: Adiciona um elemento a uma lista, que seja do mesmo tipo. Normalmente adiciona esse elemento no fim da lista, mas pode ser passado o índice de onde você quer colocar o novo elemento.

    1- lista.add(elemento);

    2- lista.add(0, elemento);

- remove: Remove um elemento da lista. Normalmente recebe um índice ou um elemento como parâmetro.

    1- lista.remove(0);

    2- lista.remove(elemento);

- contains: Verifica se um elemento passado como parâmentro está na lista.

    lista.contains(5);

- get: Obtém um elemento através do índice.

    lista.get(0);

- size: Retorna a quantidade de elementos da lista.

    lista.size();

### Listas Ordenadas

Quando falamos em ordenação de listas existem métodos que fazem isso de formas diferentes, podendo ser em ordem crescente ou decrescente, por exemplo. Em uma lista de inteiros, geralmente ordenamos em ordem crescente. Em uma lista de strings, geralmente ordenamos em ordem alfabetica.

O método Collections.sort(lista) faz exatamente isso, ordena em ordem alfabetica (strings) e ordem crescente (inteiros).

    List<Integer> idades = new ArrayList<>();
    idades.add(21);
    idades.add(19);
    idades.add(41);
    idades.add(25);

    Collections.sort(idades);

    for (Integer idade : idades) {
        System.out.print(idade + " ");
    }

    saída:  19 21 25 41

## Comparable

Em java, Comparable é uma interface usada para definir a ordem natural dos objetos de uma classe. Ela permite que listas sejam ordenadas com métodos como Collections.sort() ou List.sort(). A própria classe sabe como se ordenar.

### compareTo()

    obj1.compareTo(obj2)

- Número negativo: obj1 vem antes de obj2.
- 0: são considerados iguais para ordenação.
- Número positivo: obj1 vem depois de obj2.

## Comparator

Comparator é uma interface do java usada para definir critérios de ordenação externos a uma classe. Diferente do Comparable, você pode criar vários comparadores diferentes para a mesma classe. A ordenação é definida fora da classe.

### compare()

    int compare(T o1, T o2)

- Maior que 0: o1 vem antes de o2.
- Igual a 0: iguais para ordenação.
- Menor que 0: o1 vem depois de o2.

Uma classe pode implementar apenas um Comparable, mas você pode criar quantos Comparators quiser.

    Comparable = ordem natural do objeto.
    Comparator = ordem personalizada do objeto.
