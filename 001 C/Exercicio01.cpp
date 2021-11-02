//Aula 02 - VETORES
//Exercício 01 
/* Faça um programa que leia 10 valores do tipo inteiro em um vetor e calcule a soma desses 10 valores. Exibir a soma para o usuário. */

#include < stdio.h >

  int main() {

    //Declaração de variáveis
    int vetorInteiros[10];
    static int somaInteiros;
    int indiceVetor = 0;

    for (int indiceVetor = 0; indiceVetor < 10; indiceVetor++) {
      printf("Digite o valor %d ", indiceVetor + 1);
      scanf("%d", & vetorInteiros[indiceVetor]);
      somaInteiros = somaInteiros + vetorInteiros[indiceVetor];
    }

    printf("Soma total: %d", somaInteiros);
  }
