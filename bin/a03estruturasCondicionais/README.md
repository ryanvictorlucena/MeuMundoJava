# Estruturas condicionais

Blocos com resultado verdadeiro ou falso, se a condição for atendida o bloco é executado.
A condição que fica dentro dos parenteses do if e do else if sempre tem que retornar um booleano, true ou false.

## If -> se

    if (condição) {
        comando a ser executado
    }

Se isso for verdadeiro execute o bloco dentro dele, senão...

## Else -> senão

    else {  
        comando a ser executado
    }

Se o bloco de cima não for executado, faça esse.

## Else if -> senão se

    else if (condição) {
        comando a ser executado
    }

Geralmente usado quando tem mais de uma condições que deve ser executadas somente se a condição principal não for atendida.

## Óperador ternário

Associa um valor diretamente a uma variavel

    (condição) ? verdadeiro : falso

recomendado quando tem um simples if else pra um caso onde referência o valor diretamente a uma variável.

## Tabela verdade

- and/ e/ && = Verdadeiro se ambas as condições são verdade, caso alguma seja falsa, o resultado final será falso;

- or/ ou/ || = Verdadeiro se pelo menos uma das condições é verdadeira, só é falso se ambas forem falsa.

## Switch

Usado geralmente pra deixar o codigo mais compacto, visto que usando if else ele ficaria gigantesco.

switch(variavel) {
    case seja isso:
        faça isso;
        break;
    ...
    default:
        por padrão faça isso;
        break;
}
