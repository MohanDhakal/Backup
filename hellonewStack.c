#include<stdio.h>
#include<conio.h>
#define maxSize 10

int stack[maxSize];
int tos = -1;

void push();
int pop();
void traverse();

void main(){

	int choice;
   char ch;

	do{
      printf("Select Your Choice: ");
   		printf("\n1. Push");
         printf("\n2. Pop");
         printf("\n3. Traverse\n");

         scanf("%d", &choice);


         switch(choice){
          	case 1: push(); break;
            case 2: pop(); break;
            case 3: traverse(); break;
            default: printf("\nInvalid Choice");



         }

         printf("\nDo you wish to continue?\n");
         fflush(stdin);
         scanf("%c", &ch);


   } while(ch == 'Y' || ch == 'y');

   getch();


}



void push(){
	int item;
	if(tos == maxSize - 1){
   	printf("Stack is full");

   }else{
   	printf("Enter a number to push: \n");
      scanf("%d", &item);
       tos = tos + 1;
       stack[tos] = item;
       printf("Item Pushed");
   }



}

int pop(){

	int item;
 printf("Popped\n");
 if(tos == -1){
    	printf("Stack is Empty.\n");
 	}else{
   item = stack[tos];
   tos = tos - 1;
   printf("%d is deleted", item);
   return item;
   }

}

void traverse(){
	int i;
	if(tos == -1){
    	printf("Stack is Empty.\n");
 	}else{
   printf("Item in Stack: \n");

   for(i=0; i <= tos; ++i){
   	printf("%d\t", stack[i]);

   }



   }
}
