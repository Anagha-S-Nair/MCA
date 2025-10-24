#include <stdio.h>

int cqueue[30],front=-1,rear=-1,max,count=0;
void enqueue(){
    int item;
    if(front==(rear+1)%max){
        printf("Queue Overflow");
        return;
    }
    printf("Enter the data item: ");
    scanf("%d", &item);
    if(front==-1){ 
        front=rear=0; 
    }
    else{ 
        rear=(rear+1)%max; 
    }
    cqueue[rear]=item;
    count++;
}

void dequeue(){
    int item;
    if(front == -1){
        printf("Queue Underflow");
        return;
    }
    item=cqueue[front];
    if(front==rear){ 
        front=rear=-1; 
    } else{ 
        front=(front+1)%max;
    }
    printf("%d deleted successfully.\n", item);
    count--;
}

void traverse(){
    int i;
    if(front == -1){
        printf("Queue is Empty");
        return;
    }
    printf("The elements are: ");
    for(i=front;i<=rear;i++){
        printf("%d\t",cqueue[i]);
    }
    if(front>rear){
        for(i=front;i<max;i++){
            printf("%d\t",cqueue[i]);
        }
        for(i=0;i<=rear;i++){
            printf("%d\t",cqueue[i]);
        }
    }
}

void countE() {
    if (front == -1 && rear == -1) {
        printf("\nQueue is Empty\n");
        return;
    }
    printf("Total No of elements: %d\n", count);
}

int main() {
    int ch;
    printf("Enter the size : ");
    scanf("%d", &max);
    do {
        printf("\nMenu:\n");
        printf("1. Insertion\n");
        printf("2. Deletion\n");
        printf("3. Traversal\n");
        printf("4. Count\n");
        printf("5. Exit\n");
        printf("Enter Your Choice: ");
        scanf("%d", &ch);

        switch (ch) {
            case 1: enqueue(); break;
            case 2: dequeue(); break;
            case 3: traverse(); break;
            case 4: countE(); break;
            case 5: return 0;
            default: printf("\nInvalid Choice\n"); break;
        }
    } while (ch != 5);
    return 0;
}