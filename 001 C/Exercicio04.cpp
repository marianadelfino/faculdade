//Aula 02 - VETORES
//Exercício 04
/* Faça um programa que leia 10 valores em vetA e construa um vetor chamado vetB que contenha os elementos de vetA em ordem inversa. ATENÇÃO: não
basta exibir os valores ao contrário, é preciso que o PRIMEIRO valor armazenado em vetB seja o último valor de vetA. */

	#include <stdio.h>
	int main() {
		
		//Declaração de variáveis 
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


