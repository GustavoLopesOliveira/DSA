#include <stdio.h>
#include <stdlib.h>

typedef struct{
	int max;
	int tam;
	int* vet;
}FilaLinear;

FilaLinear* newFilaLinear(int max){
	FilaLinear* ptr = (FilaLinear*) malloc(sizeof(FilaLinear));
	ptr->tam = 0;
	ptr->max = max;
	ptr->vet = (int*) malloc(max * sizeof(int));

	return ptr;
}

void delFilaLinear(FilaLinear* fila){
	free(fila);
}

void push(FilaLinear* fila, int elem){
	int tam = fila->tam;
	fila->vet[tam] = elem;
	fila->tam = fila->tam + 1;
}

void pop(FilaLinear* fila){
	for(int i = 0; i < fila->tam - 1; i++){
		fila->vet[i] = fila->vet[i+1];
	}
	fila->tam = fila->tam - 1;
}

void info(FilaLinear* fila){
	int tam = fila->tam;

	for(int i = 0; i < tam; i++){
		printf("%d ",fila->vet[i]);
	}

	printf("\n");
}

int main(){
	
	FilaLinear* fila = newFilaLinear(15);

	for(int i = 0; i < 15; i++){
		push(fila,i);
	}

	info(fila);

	for(int i = 0; i < 14; i++){
		pop(fila);
		info(fila);
	}

	delFilaLinear(fila);
}
