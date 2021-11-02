//Aula 02 - VETORES
//Exercício 02
/* Faça um programa que leia 10 valores do tipo inteiro em um vetor chamado vetA e construa um vetor chamado vetB que contenha cada elemento de vetA multiplicado por 3. Exibir os dois vetores. */

#include < stdio.h >

  int main() {

    //Declaração de variáveis
    int vetA[10];
    int vetB[10];
    int indiceVetor = 0;
    int somaValoresA;
    int somaValoresB;

    for (int indiceVetor = 0; indiceVetor < 10; indiceVetor++) {

      printf("\nDigite o valor para o Vetor A: ");
      scanf("%d", & vetA[indiceVetor]);

      vetB[indiceVetor] = 3 * vetA[indiceVetor];
      printf("Valor para o Vetor B: %d ", vetB[indiceVetor]);
      printf("");

      somaValoresA = somaValoresA + vetA[indiceVetor];
      somaValoresB = somaValoresB + vetB[indiceVetor];

    }

    printf("\nSoma total Vetor A: %d", somaValoresA);
    printf("\nSoma total Vetor B: %d", somaValoresB);
  }
