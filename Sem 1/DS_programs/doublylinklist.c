//deletion of particular value
#include <stdio.h>
#include <stdlib.h>

// Structure of a node
struct node {
    int data;
    struct node *prev;
    struct node *next;
};

struct node *start = NULL;
int nodecount = 0;

// Function prototypes
void createList();
void insertAtBeginning();
void insertAtEnd();
void insertAtPosition();
void deleteFromBeginning();
void deleteFromEnd();
void deleteByValue(); // NEW PROTOTYPE
void traverseFromBeginning();
void traverseFromEnd();
void displayBoth();
void countNodes();

int main() {
    int choice;

    do {
        printf("\n=== DOUBLY LINKED LIST MENU ===\n");
        printf("1. Create List\n");
        printf("2. Insert at Beginning\n");
        printf("3. Insert at End\n");
        printf("4. Insert at Position\n");
        printf("5. Delete from Beginning\n");
        printf("6. Delete from End\n");
        printf("7. Delete by Value\n"); // NEW MENU OPTION
        printf("8. Traverse from Beginning\n");
        printf("9. Traverse from End\n");
        printf("10. Display from Both Sides\n");
        printf("11. Count Nodes\n");
        printf("12. Exit\n"); // UPDATED EXIT OPTION
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: createList(); break;
            case 2: insertAtBeginning(); break;
            case 3: insertAtEnd(); break;
            case 4: insertAtPosition(); break;
            case 5: deleteFromBeginning(); break;
            case 6: deleteFromEnd(); break;
            case 7: deleteByValue(); break; // CALL TO NEW FUNCTION
            case 8: traverseFromBeginning(); break;
            case 9: traverseFromEnd(); break;
            case 10: displayBoth(); break;
            case 11: countNodes(); break;
            case 12: printf("Exiting...\n"); break;
            default: printf("Invalid choice! Try again.\n");
        }
    } while (choice != 12);

    return 0;
}

// Create a new list by adding the first node
void createList() {
    if (start != NULL) {
        printf("List already created.\n");
        return;
    }

    int val;
    struct node *newnode;

    newnode = (struct node*)malloc(sizeof(struct node));
    if (!newnode) {
        printf("Memory allocation failed.\n");
        return;
    }

    printf("Enter data for first node: ");
    scanf("%d", &val);

    newnode->data = val;
    newnode->prev = NULL;
    newnode->next = NULL;

    start = newnode;
    nodecount = 1;

    printf("List created with first node.\n");
}

// Insert at beginning
void insertAtBeginning() {
    // If start is NULL, treat it as creating the first node
    if (start == NULL) {
        createList();
        return;
    }

    int val;
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    if (!newnode) {
        printf("Memory allocation failed.\n");
        return;
    }
    
    printf("Enter data to insert at beginning: ");
    scanf("%d", &val);

    newnode->data = val;
    newnode->prev = NULL;
    newnode->next = start;
    start->prev = newnode;
    start = newnode;

    nodecount++;
    printf("Node inserted at beginning.\n");
}

// Insert at end
void insertAtEnd() {
    // If start is NULL, treat it as creating the first node
    if (start == NULL) {
        createList();
        return;
    }

    int val;
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    if (!newnode) {
        printf("Memory allocation failed.\n");
        return;
    }
    struct node *temp = start;

    printf("Enter data to insert at end: ");
    scanf("%d", &val);

    newnode->data = val;
    newnode->next = NULL;

    while (temp->next != NULL) {
        temp = temp->next;
    }

    temp->next = newnode;
    newnode->prev = temp;

    nodecount++;
    printf("Node inserted at end.\n");
}

// Insert at a specific position
void insertAtPosition() {
    // If list is empty, treat position 1 as createList
    if (start == NULL) {
        int pos;
        printf("List is empty. Enter position (must be 1): ");
        scanf("%d", &pos);
        if (pos == 1) {
            createList();
        } else {
            printf("Invalid position. List must be initialized at position 1.\n");
        }
        return;
    }

    int pos, val, i;
    struct node *newnode;
    struct node *temp = start;

    printf("Enter data to insert: ");
    scanf("%d", &val);
    printf("Enter position to insert at (1 to %d): ", nodecount + 1);
    scanf("%d", &pos);

    // 1. Check for valid position
    if (pos < 1 || pos > nodecount + 1) {
        printf("Invalid position! Position must be between 1 and %d.\n", nodecount + 1);
        return;
    }

    // 2. Handle Insertion at Position 1 (Beginning)
    if (pos == 1) {
        insertAtBeginning();
        return;
    }
    // 3. Handle Insertion at Position N+1 (End)
    else if (pos == nodecount + 1) {
        insertAtEnd();
        return;
    }
    // 4. Handle Insertion in the Middle (1 < pos < N+1)
    else {
        // Allocate memory for the new node
        newnode = (struct node*)malloc(sizeof(struct node));
        if (!newnode) {
            printf("Memory allocation failed.\n");
            return;
        }
        newnode->data = val;

        // Traverse to the node *before* the insertion point (pos - 1)
        for (i = 1; i < pos - 1; i++) {
            temp = temp->next;
        }
        
        // Pointers for the new node
        newnode->next = temp->next;
        newnode->prev = temp;

        // Pointers for the surrounding nodes
        temp->next->prev = newnode;
        temp->next = newnode;

        nodecount++;
        printf("Node with data %d inserted at position %d.\n", val, pos);
    }
}

// Delete from beginning
void deleteFromBeginning() {
    if (start == NULL) {
        printf("List is empty.\n");
        return;
    }

    struct node *temp = start;

    start = start->next;

    if (start != NULL)
        start->prev = NULL;

    printf("Deleted element: %d\n", temp->data);
    free(temp);
    nodecount--;
    if (nodecount == 0) start = NULL; // Handle case where list becomes completely empty
}

// Delete from end
// void deleteFromEnd() {
//     if (start == NULL) {
//         printf("List is empty.\n");
//         return;
//     }

//     struct node *temp = start;

//     if (temp->next == NULL) {
//         printf("Deleted element: %d\n", temp->data);
//         free(temp);
//         start = NULL;
//         nodecount = 0;
//         return;
//     }

//     while (temp->next != NULL) {
//         temp = temp->next;
//     }

//     printf("Deleted element: %d\n", temp->data);
//     temp->prev->next = NULL;
//     free(temp);
//     nodecount--;
// }
void deleteFromEnd() {
    if (start == NULL) {
        printf("List is empty.\n");
        return;
    }

    if (start->next == NULL) { // only one node
        free(start);
        start = NULL;
    } else {
        struct node *temp = start;
        while (temp->next != NULL)
            temp = temp->next;
        temp->prev->next = NULL;
        free(temp);
    }
    nodecount--;
}

// Delete a node containing a specific data value
void deleteByValue() {
    if (start == NULL) {
        printf("List is empty. Cannot delete.\n");
        return;
    }

    int val;
    struct node *temp = start;

    printf("Enter data value to delete: ");
    scanf("%d", &val);

    // 1. Traverse to find the node
    while (temp != NULL && temp->data != val) {
        temp = temp->next;
    }

    // 2. Element not found
    if (temp == NULL) {
        printf("Element %d not found in the list.\n", val);
        return;
    }

    // 3. Handle Deletion
    
    // Case A: Deleting the Head Node
    if (temp == start) {
        start = start->next;
        if (start != NULL) {
            start->prev = NULL;
        }
    } 
    // Case B: Deleting a Middle or End Node
    else {
        // Link predecessor to successor (skip temp)
        temp->prev->next = temp->next;

        // If not the last node, link successor's prev to predecessor
        if (temp->next != NULL) {
            temp->next->prev = temp->prev;
        }
    }

    printf("Deleted element: %d\n", temp->data);
    free(temp);
    nodecount--;
    
    // Final check for an empty list after deletion
    if (nodecount == 0) {
        start = NULL;
    }
}

// Traverse from beginning
void traverseFromBeginning() {
    if (start == NULL) {
        printf("List is empty.\n");
        return;
    }

    struct node *temp = start;
    printf("List from beginning: ");
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

// Traverse from end
void traverseFromEnd() {
    if (start == NULL) {
        printf("List is empty.\n");
        return;
    }

    struct node *temp = start;

    while (temp->next != NULL) {
        temp = temp->next;
    }

    printf("List from end: ");
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->prev;
    }
    printf("\n");
}

// Display from both sides
void displayBoth() {
    printf("--- Forward ---\n");
    traverseFromBeginning();
    printf("--- Backward ---\n");
    traverseFromEnd();
}

// Count nodes
void countNodes() {
    printf("Total number of nodes: %d\n", nodecount);
}