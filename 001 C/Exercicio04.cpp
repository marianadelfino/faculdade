//Aula 02 - VETORES
//Exerc�cio 04
/* Fa�a um programa que leia 10 valores em vetA e construa um vetor chamado vetB que contenha os elementos de vetA em ordem inversa. ATEN��O: n�o
basta exibir os valores ao contr�rio, � preciso que o PRIMEIRO valor armazenado em vetB seja o �ltimo valor de vetA. */

	#include <stdio.h>
	int main() {
		
		//Declara��o de vari�veis 
		int vetA[10];
		int vetB[10];
		int indiceVetor = 0; 
		
		for (indiceVetor = 0; indiceVetor < 10; indiceVetor++){		
			printf("Vetor A: ");
			scanf("%d", &vetA[indiceVetor]); 			
			vetB[indiceVetor] = vetA[9 - indiceVetor];	
		}
		
				
		for (indiceVetor = 0; indiceVetor < 10; indiceVetor++){					
			vetB[indiceVetor] = vetA[9 - indiceVetor];	
		}
		
		printf("\nVetor B: "); 
		for (indiceVetor = 0; indiceVetor < 10; indiceVetor++){		 			
		printf("\t%d", vetB[indiceVetor]); 
		}
		
	}


