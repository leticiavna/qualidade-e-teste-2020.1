Exercício 1

Desenvolvi uma classe que calcula recursivamente o fatorial de um número. 

Para os casos de teste, os valores que escolhi foram os que entram na condição de parada (n é menor ou igual a 1), onde o resultado tem que ser 1 para qualquer um desses casos (0 ou 1).
Depois de testar as condições de parada, testei valores aleatórios, para garantir que o fatorial estava realmente sendo calculado. Os valores que coloquei no teste para cálculo foram 2, 5 e 13.
Usei o *assertEquals* do Junit pra ele realizar as asserções e verificar se os valores passados eram iguais aos calculados.

Escrevi casos de teste que asseguram se são iguais e um outro teste que verifica que, ao passar um valor inválido - um valor negativo, por exemplo - o método da classe retorne uma exceção. Acredito que cobri as linhas de código do método da classe, então parei os testes por aqui.
