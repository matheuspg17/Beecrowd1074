# Resolução exercício Beecrowd1074

## Descrição do projeto
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.

## Como Funciona
1. O usuário insere a quantidade total de casos de teste, salva na variável `controle`.
2. Uma estrutura de repetição `for` é executada de acordo com o valor de `controle` para receber cada `numero`.
3. Uma estrutura condicional encadeada (`if / else if / else`) analisa as propriedades do valor:
   - Se negativo e par: Imprime `"EVEN NEGATIVE"`.
   - Se negativo e ímpar: Imprime `"ODD NEGATIVE"`.
   - Se positivo e par: Imprime `"EVEN POSITIVE"`.
   - Se positivo e ímpar: Imprime `"ODD POSITIVE"`.
   - Caso não atenda a nenhuma dessas condições (ou seja, o valor é zero): Imprime `"NULL"`.