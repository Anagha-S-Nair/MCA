#include <stdio.h>
#include <stdlib.h>
#define MAX 100
int parent[MAX],n = 0;

void createSets()
{
    printf("Enter number of elements: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
        parent[i] = i;
    printf("Created %d disjoint sets.\n", n);
}
int find(int x)
{
    if (parent[x] != x)
        parent[x] = find(parent[x]);
    return parent[x];
}
void unionOperation()
{
    int x, y;
    printf("Enter 2 elements to union: ");
    scanf("%d %d", &x, &y);
    int rootx = find(x);
    int rooty = find(y);

    if (rootx == rooty)
        printf("%d and %d are already in the same set.\n", x, y);
    else
    {
        parent[rooty] = rootx;
        printf("Union done.\n");
    }
}
void findOperation()
{
    int x;
    printf("Enter element to find: ");
    scanf("%d", &x);
    printf("Root of %d is %d\n", x, find(x));
}
void display()
{
    printf("Element | Parent\n");
    for (int i = 0; i < n; i++)
        printf("%d  |  %d\n", i, find(i));
}
int main()
{
    int choice;
    do
    {
        printf("\nMenu:\n");
        printf("1. Create sets\n");
        printf("2. Find\n");
        printf("3. Union\n");
        printf("4. Display\n");
        printf("5. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
            case 1: createSets(); break;
            case 2: findOperation(); break;
            case 3: unionOperation(); break;
            case 4: display(); break;
            case 5: printf("Exiting...\n"); break;
            default: printf("Invalid choice.\n");
        }

    } while (choice != 5);

    return 0;
}