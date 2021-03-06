# HellsTriangle
Projeto solução à atividade proposta pela Conquest ONE

# Como funciona
Dado um triangulo de numeros, encontra a soma máxima total do topo à base

Exemplo:
```
   6   
  3 5  
 9 7 1 
4 6 8 4
```
Neste triangulo o total é: 6 + 5 + 7 + 8 = 26

Condições:
Um número só pode ser somado com o outro (da linha de baixo) que estiver mais próximo a ele.
Por examplo: O número 3 na segunda linha só pode ser somado com 9 e com 7, mas, não pode ser somado com 1.

O código receberá um array multidimensional como entrada.
O triangulo acima pode ser representado da seguinte maneira:
exemplo = [[6],[3,5],[9,7,1],[4,6,8,4]]

A linguagem escolhida para desenvolvimento desta solução é Java por questões de maior afinidade e por oferecer rescursos de testes de forma mais rápida e organizada.

# Exemplo
A aplicação deve ser compilada utilizando Maven com a seguinte instrução "mvn clean compile assembly:single ", isto deve gerar o arquivo "HellTriangle.jar" na pasta "target" no mesmo nível de diretório do projeto.

Você pode executar o arquivo com a seguinte instrução "java -jar HellTriangle.jar" usando o prompt de comando.

Isto deve reproduzir a seguinte tela:

![Import](teste1.PNG)

Preencha com um array no seguinte formato: [[x],[y,z],[m,n,o],...]

Por exemplo: [[6],[3,5],[9,7,1],[4,6,8,4]]

Obtendo o seguinte resultado

![Import](teste2.PNG)