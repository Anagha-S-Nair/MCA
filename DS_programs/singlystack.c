#include < stdio.h >
#include < stdlib.h >

struct node
{
    int info;
    struct node *next;
};

struct node *temp, *head, *top;
int nodecount = 0;

void createStack();
void traverse();
void push();
void pop();
void count();
int main()
{
    int ch;
    createStack();

    do
    {
        printf("\n 1. Traverse\t 2. Push\t 3. Pop\t 4. Count\t 5. Exit\n Enter your choice \n");
        scanf("%d", &ch);

        switch (ch)
        {
        case 1:
            traverse();
            break;
        case 2:
            push();
            break;
        case 3:
            pop();
            break;
        case 4:
            count();
            break;
        case 5:
            return 0;
        default:
            printf("\n Invalid choice \n");
            break;
        }
    } while (1);
    return 0;
}

void createStack()
{
    top = NULL;
    printf("\n Stack created successfully \n");
}

void traverse()
{
    if (top == NULL)
    {
        printf("\n List is Empty \n");
        return;
    }
    temp = top;
    printf("\n The Elements are: ");
    while (temp != NULL)
    {
        printf("%d\t", temp->info);
        temp = temp->next;
    }
    printf("\n");
}

void push()
{
    head = (struct node *)malloc(sizeof(struct node));
    printf("Enter the Data item: ");
    scanf("%d", &head->info);
    head->next = top;
    top = head;
    nodecount++;
}

void count()
{
    if (top == NULL)
    {
        printf("\n List is Empty \n");
        return;
    }
    printf("Total No. of Nodes: %d\n", nodecount);
}

void pop()
{
    if (top == NULL)
    {
        printf("\n List is Empty \n");
        return;
    }

    int item;
    temp = top;
    item = temp->info;
    top = top->next;
    free(temp);
    nodecount--;
    printf("%d deleted successfully.\n", item);
}