#include <stdio.h>
#include <stdlib.h>

// Structure of a node in a Singly Linked List
struct node {
    int data;
    struct node *next;
    // Note: No 'prev' pointer, making operations simpler but limiting backward traversal.
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
void deleteByValue();
void traverse();
void countNodes();


int main() {
    int choice;

    do {
        printf("\n=== SINGLY LINKED LIST MENU ===\n");
        printf("1. Create List\n");
        printf("2. Insert at Beginning\n");
        printf("3. Insert at End\n");
        printf("4. Insert at Position\n");
        printf("5. Delete from Beginning\n");
        printf("6. Delete from End\n");
        printf("7. Delete by Value\n");
        printf("8. Traverse (Display)\n");
        printf("9. Count Nodes\n");
        printf("10. Exit\n"); 
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: createList(); break;
            case 2: insertAtBeginning(); break;
            case 3: insertAtEnd(); break;
            case 4: insertAtPosition(); break;
            case 5: deleteFromBeginning(); break;
            case 6: deleteFromEnd(); break;
            case 7: deleteByValue(); break;
            case 8: traverse(); break;
            case 9: countNodes(); break;
            case 10: printf("Exiting...\n"); break;
            default: printf("Invalid choice! Try again.\n");
        }
    } while (choice != 10);

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
    newnode->next = NULL;

    start = newnode;
    nodecount = 1;

    printf("List created with first node.\n");
}

// Insert at beginning
void insertAtBeginning() {
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
    newnode->next = start;
    start = newnode;

    nodecount++;
    printf("Node inserted at beginning.\n");
}

// Insert at end
void insertAtEnd() {
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

    nodecount++;
    printf("Node inserted at end.\n");
}

// Insert at a specific position
void insertAtPosition() {
    if (start == NULL) {
        printf("List is empty. Using Create List to initialize the first node.\n");
        createList();
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

    // 2. Handle Position 1 (Beginning)
    if (pos == 1) {
        insertAtBeginning();
        return;
    }
    // 3. Handle Position N+1 (End)
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
        
        // Link the new node
        newnode->next = temp->next;
        temp->next = newnode;

        nodecount++;
        printf("Node with data %d inserted at position %d.\n", val, pos);
    }
}

// =================================================================
// DELETION FUNCTIONS
// =================================================================

// Delete from beginning
void deleteFromBeginning() {
    if (start == NULL) {
        printf("List is empty. Cannot delete.\n");
        return;
    }

    struct node *temp = start;
    start = start->next;

    printf("Deleted element: %d\n", temp->data);
    free(temp);
    nodecount--;
    if (nodecount == 0) start = NULL;
}

void deleteFromEnd() {
    if (start == NULL) {
        printf("List is empty. Cannot delete.\n");
        return;
    }

    struct node *temp = start;

    // If only one node
    if (start->next == NULL) {
        printf("Deleted element: %d\n", start->data);
        free(start);
        start = NULL;
    } else {
        // Find second last node
        while (temp->next->next != NULL) {
            temp = temp->next;
        }
        printf("Deleted element: %d\n", temp->next->data);
        free(temp->next);
        temp->next = NULL;
    }
    nodecount--;
}


// Delete from end
// void deleteFromEnd() {
//     if (start == NULL) {
//         printf("List is empty. Cannot delete.\n");
//         return;
//     }

//     struct node *temp = start;

//     // Case 1: Only one node
//     if (temp->next == NULL) {
//         printf("Deleted element: %d\n", temp->data);
//         free(temp);
//         start = NULL;
//         nodecount = 0;
//         return;
//     }

//     // Traverse to the second to last node (predecessor of the last node)
//     while (temp->next->next != NULL) {
//         temp = temp->next;
//     }

//     // temp now points to the node before the end
//     printf("Deleted element: %d\n", temp->next->data);
//     free(temp->next);
//     temp->next = NULL; // Make the second to last node the new end

//     nodecount--;
// }

// // Delete a node containing a specific data value
// void deleteByValue() {
//     if (start == NULL) {
//         printf("List is empty. Cannot delete.\n");
//         return;
//     }

//     int val;
//     struct node *current = start;
//     struct node *prev = NULL;

//     printf("Enter data value to delete: ");
//     scanf("%d", &val);

//     // 1. Traverse to find the node
//     while (current != NULL && current->data != val) {
//         prev = current;
//         current = current->next;
//     }

//     // 2. Element not found
//     if (current == NULL) {
//         printf("Element %d not found in the list.\n", val);
//         return;
//     }

//     // 3. Handle Deletion (current is the node to delete)
    
//     // Case A: Deleting the Head Node
//     if (current == start) {
//         start = start->next;
//     } 
//     // Case B: Deleting a Middle or End Node
//     else {
//         // Link predecessor to successor (skip current)
//         prev->next = current->next;
//     }

//     printf("Deleted element: %d\n", current->data);
//     free(current);
//     nodecount--;
// }

// =================================================================
// TRAVERSAL AND COUNT FUNCTIONS
// =================================================================


void deleteByValue() {
    if (start == NULL) {
        printf("List is empty. Cannot delete.\n");
        return;
    }

    int item;
    struct node *temp; // Declare temp here as it's used globally in the function
    struct node *head; // Declare head here as it's used globally in the function

    printf("Enter data value to delete: ");
    scanf("%d", &item);
    
    // Case 1: Deleting the Head Node (start)
    // Check start->data (using the correct member name 'data')
    if (start->data == item) {
        temp = start;
        start = start->next;
        printf("Deleted element: %d\n", temp->data); // Print deleted data
        free(temp);
        nodecount--;
        return;
    }

    // Case 2: Deleting a Middle or End Node
    temp = start;
    // Traverse until temp->next is NULL OR the next node's data matches 'item'
    while (temp->next != NULL) {
        // Check temp->next->data (using the correct member name 'data')
        if (temp->next->data == item) {
            head = temp->next;          // head points to the node to be deleted
            temp->next = head->next;    // temp (predecessor) bypasses head to point to head's successor
            printf("Deleted element: %d\n", head->data); // Print deleted data
            free(head);
            nodecount--;
            return;
        }
        temp = temp->next;
    }

    // If loop finishes without finding the item
    printf("Element %d not found in the list.\n", item);
}

// Traverse (Display)
void traverse() {
    if (start == NULL) {
        printf("List is empty.\n");
        return;
    }

    struct node *temp = start;
    printf("List elements: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Count nodes
void countNodes() {
    printf("Total number of nodes: %d\n", nodecount);
}