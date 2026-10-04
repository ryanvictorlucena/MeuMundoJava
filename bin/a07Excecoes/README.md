# Exceções

Exceções são condições que você coloca no seu programa para tratar casos especiais onde pode acontecer algo que não seja esperado, como uma entrada inválida por exemplo. Todas as exceções do java derivam da classe throwable, a classe mãe de tudo. A subclasse Erro também faz parte dessa familia, onde esses erros não podem ser tratados pelo programa, você deve encerrar seu programa e identificar o erro para poder concerta-lo. Na subclasse Exception ao contrário do erro, existem situações que podem ser previstas e tratadas. Em resumo, não respónsabilidade do código lidar com o erro, mas é respónsabilidade do desenvolvedor prever e tratar exceções.

## RunTimeException

Em java é uma subclasse de Exception, ela representa exceções não verificadas. São tratadas obrigatoriamente por try/catch ou declaradas com throw. As RunTimeException e suas subclasses não precisam ser declaradas nem tratadas. O compilador não te obriga a isso, mas elas podem acontecer em tempo de execução, um exemplo disso é

    int[] numeros = {1, 2, 3};
    System.out.println(numeros[5]);

Você cria um array de inteiros com 3 posições, mas quer imprimir quem está na posição 5, que nesse caso não existe nesse array. O compilador não reclama disso, mas esse código quebra em tempo de execução.

Exemplos de RunTimeException:

    - NullPointerException → quando você tenta acessar métodos/atributos de um objeto nulo.

    - ArrayIndexOutOfBoundsException → quando acessa um índice inválido em um array.

    - ArithmeticException → divisão por zero.

    - IllegalArgumentException → quando um argumento inválido é passado para um método.

Para tratar exceções usamos o bloco try/catch. Esse bloco trata situações inesperadas que podem ocorrer durante e execução do programa. Ele permite a capitura de erros para evitar que o programa seja interrompido.

    try {
        "Código que pode lançar uma exceção"
    } catch (TipoDaExcecao e) {
        "Tratamento da exceção"
    }

Também temos o bloco finally que é opcional - pode ser usado ou não - ele vai ser executado independente de ocorrer ou não uma exceção. O finally é um bloco de código que geralmente é usado para fechamento.

    try {
        "Código que pode lançar uma exceção"
    } catch (TipoDaExcecao e) {
        "Tratamento da exceção"
    } finally {
        System.out.println("Finalizando bloco...");
    }

Vários catch podem ser utilizados, em casos onde podem ter erros de tipos diferentes, por exemplo.

## Exceções: Unchecked

Exceções do tipo unchecked são exceções que não precisam der tratadas obrigatoriamente pelo compilador. Isso que dizer que você não precisa de um try/catch ou throws. Essas exceçõs geralmente indicam erros lógicos ou de programação que poderiam ser evitados com um código mais correto.

## Exceções: Checked

Ao contrário das exceções do tipo unchecked, o compilador te obriga a trata-las seja com try/catch ou com throws. Elas representam situações que podem acontecer, mas não são necessariamente um erro de programação, são aqueles erros esperados, como por exemplo uma entrada inválida. Caso aconteca de você não tratar uma situação dessa, o código não vai compilar.

## Exceção customizada

É possível criar sua própria exceção, sendo do tipo unchecked ou checked. Você cria e pode definir seu tratamento baseado na lógica do sistema, essa classe deve ser uma extensão da classe Exception ou RunTimeException e funciona da mesma maneira que as exceções já existentes, se for do tipo checked é obrigado trata-las e se for do tipo unchecked não.
