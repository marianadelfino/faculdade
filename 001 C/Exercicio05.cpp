//Aula 02 - VETORES
//Exerc�cio 05
/* Fa�a um programa que receba 20 valores informados pelo usu�rio em um vetor vetExercicio e informe ao
usu�rio em que posi��o est� armazenado o maior valor digitado. */

	#include <stdio.h>
	int main(){
		
		//Declara��o de vari�veis 
		int vetor[10]; 
		int posicaoMaior = 0;
		int posicaoMenor = 0;
		int indiceVetor = 0; 
		
		for(indiceVetor = 0; indiceVetor < 10; indiceVetor++){
			printf("Vetor Exercicio: "); 
			scanf("%d", &vetor[indiceVetor]); 
			if(vetor[indiceVetor]> vetor[posicaoMaior]){
				posicaoMaior = indiceVetor; 
			} else if (vetor[indiceVetor]< vetor[posicaoMenor]) {
					posicaoMenor = indiceVetor; 
			}
		}
		printf("\nO maior valor esta na posicao %d", posicaoMaior); 
		printf("\nO maior valor e %d", vetor[posicaoMaior]); 
		
		printf("\nO menor valor esta na posicao %d", posicaoMenor); 
		printf("\nO menor valor e %d", vetor[posicaoMenor]); 
	}
	

