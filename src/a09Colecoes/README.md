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
