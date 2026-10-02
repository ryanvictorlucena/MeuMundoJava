# Excessões

Excessões são condições que você coloca no seu programa para tratar casos especiais onde pode acontecer algo que não seja esperado, como uma entrada inválida por exemplo. Todas as excessões do java derivam da classe throwable, a classe mãe de tudo. A subclasse Erro também faz parte dessa familia, onde esses erros não podem ser tratados pelo programa, você deve encerrar seu programa e identificar o erro para poder concerta-lo. Na subclasse Exception ao contrário do erro, existem situações que podem ser previstas e tratadas. Em resumo, não respónsabilidade do código lidar com o erro, mas é respónsabilidade do desenvolvedor prever e tratar excessões.

## RunTimeException

Em java é uma subclasse de Exception, ela representa excessões não verificadas. São tratadas obrigatoriamente por try/catch ou declaradas com throw. As RunTimeException e suas subclasses não precisam ser declaradas nem tratadas. O compilador não te obriga a isso, mas elas podem acontecer em tempo de execução, um exemplo disso é

    int[] numeros = {1, 2, 3};
    System.out.println(numeros[5]);

Você cria um array de inteiros com 3 posições, mas quer imprimir quem está na posição 5, que nesse caso não existe nesse array. O compilador não reclama disso, mas esse código quebra em tempo de execução.

Exemplos de RunTimeException:

    - NullPointerException → quando você tenta acessar métodos/atributos de um objeto nulo.

    - ArrayIndexOutOfBoundsException → quando acessa um índice inválido em um array.

    - ArithmeticException → divisão por zero.

    - IllegalArgumentException → quando um argumento inválido é passado para um método.
