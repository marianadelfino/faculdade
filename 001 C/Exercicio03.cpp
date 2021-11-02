//Aula 02 - VETORES
//Exercício 03
/* Faça um programa que leia 10 valores em vetA, 10 valores em vetB e construa um vetor chamado vetC que contenha os elementos de vetA e vetB intercalados. */
/* Este exercício significa que o primeiro elemento do vetA, seguido pelo primeiro elemento do vetB até nA elemento do vetA seguido nB elemento do vetB */
#include <stdio.h>

int main() {
	
	//Declaração de variáveis 
	int vetorA[10];
	int vetorB[10];
	int vetorC[20];
	int indiceVetor = 0; 
	
	printf("Digite 10 valores para vetor A e 10 valores para vetor B \n"); 
	
	for(indiceVetor = 0; indiceVetor < 10; indiceVetor++){
		
		printf("\nVetor A: ");
		scanf("%d", &vetorA[indiceVetor]);
		
		printf("Vetor B: ");
		scanf("%d", &vetorB[indiceVetor]);
	}
	
	for(indiceVetor = 0; indiceVetor < 10; indiceVetor++){	
		vetorC[indiceVetor * 2] = vetorA[indiceVetor];
		vetorC[(indiceVetor * 2) + 1] = vetorB[indiceVetor]; 	
	}
	
	printf("\nVetor C: "); 
	for (indiceVetor = 0; indiceVetor < 20; indiceVetor++){
		printf("\t%d", vetorC[indiceVetor]); 	
	}
}
