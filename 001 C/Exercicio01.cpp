//Aula 02 - VETORES
//Exerc�cio 01 
/* Fa�a um programa que leia 10 valores do tipo inteiro em um vetor e calcule a soma desses 10 valores. Exibir a soma para o usu�rio. */

#include < stdio.h >

  int main() {

    //Declara��o de vari�veis
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
