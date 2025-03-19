#include <stdio.h>
#include <stdlib.h>

typedef struct{
	int tam;
	int* vet;
	int max;
}Stack;

Stack* newStack(int max){
	Stack* ptr = (Stack*) malloc(sizeof(Stack));
	ptr->tam = 0;
	ptr->max = max;
	ptr->vet = (int*) malloc(max * sizeof(int));
	return ptr;
}

void delStack(Stack* s){
	free(s);
}

void push(Stack* s, int elem){
	int ultimo = s->tam;
	s->vet[ultimo] = elem;
	s->tam = ultimo + 1;
}

void pop(Stack* s){
	s->tam = s->tam - 1;
}

void info(Stack* s){
	int tam = s->tam;
	for(int i = 0; i < tam; i++){
		printf("%d ",s->vet[i]);
	}

	printf("\n");
}

int main(){
	Stack* stack = newStack(15);

	for(int i = 0; i < 15; i++){
		push(stack,i);
	}

	info(stack);

	for(int i = 0; i < 14; i++){
		pop(stack);
		info(stack);
	}
}

