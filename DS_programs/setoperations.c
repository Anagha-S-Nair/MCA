#include <stdio.h>
#include <stdlib.h>

#define SIZE 10

// Function to read set elements and mark them in the array (Bit String)
void inputSet(int set[], const char *name) {
    int i, n, x;
    printf("\nEnter the number of elements in set %s: ", name);
    scanf("%d", &n);
    printf("Enter elements (0 - %d): ", SIZE - 1);
    
    // Initialize set array (clear set)
    for (i = 0; i < SIZE; i++) {
        set[i] = 0;
    }

    for (i = 0; i < n; i++) {
        scanf("%d", &x);
        if (x >= 0 && x < SIZE) {
            set[x] = 1; // Mark the presence of the element
        } else {
            printf("Invalid element %d. Skipped.\n", x);
        }
    }
}

// Function to check if the set is empty (as defined in the displaySet context)
int empty(int set[]) {
    int i;
    for (i = 0; i < SIZE; i++) {
        if (set[i] == 1) {
            return 0; // Not empty
        }
    }
    return 1; // Empty
}

// Function to display the set
void displaySet(const char *name, int set[]) {
    int i, empty_flag = 1; // Renamed to avoid conflict with the function name

    printf("%s = { ", name);
    for (i = 0; i < SIZE; i++) {
        if (set[i] == 1) {
            if (empty_flag == 0) { // Check if it's not the first element
                printf(", ");
            }
            printf("%d", i);
            empty_flag = 0;
        }
    }
    printf(" }\n");

    if (empty_flag) { // The notes have a specific print for an empty set
        printf("The set is empty.\n");
    }
}

// Function to perform Union (A OR B)
void unionSet(int a[], int b[], int result[]) {
    for (int i = 0; i < SIZE; i++) {
        result[i] = a[i] || b[i]; // Logical OR
    }
}

// Function to perform Intersection (A AND B)
void intersectionSet(int a[], int b[], int result[]) {
    for (int i = 0; i < SIZE; i++) {
        result[i] = a[i] && b[i]; // Logical AND
    }
}

// Function to perform Difference (A - B)
void differenceSet(int a[], int b[], int result[]) {
    for (int i = 0; i < SIZE; i++) {
        // A - B is equivalent to A AND (NOT B)
        result[i] = a[i] && !b[i];
    }
}

// Function to clear the result array
void clearSet(int set[]) {
    for (int i = 0; i < SIZE; i++) {
        set[i] = 0;
    }
}

// Main Function
int main() {
    // Array sizes are set by #define SIZE 10
    int A[SIZE], B[SIZE];
    int result[SIZE];
    int choice;

    printf("Input Set A:\n");
    inputSet(A, "A");

    printf("\nInput Set B:\n");
    inputSet(B, "B");

    do {
        printf("\n\n1. Union\n2. Intersection\n3. Difference (A-B)\n");
        printf("4. Difference (B-A)\n5. Display\n6. Exit\n");
        printf("Enter your choice: ");
        
        // The notes show scanf("%d", &choice);
        scanf("%d", &choice);
        
        // Clear the result array before each operation
        clearSet(result); 

        switch (choice) {
            case 1: // Union
                unionSet(A, B, result);
                displaySet("A U B", result);
                break;

            case 2: // Intersection
                intersectionSet(A, B, result);
                displaySet("A n B", result);
                break;

            case 3: // Difference (A - B)
                differenceSet(A, B, result);
                displaySet("A - B", result);
                break;

            case 4: // Difference (B - A)
                differenceSet(B, A, result);
                displaySet("B - A", result);
                break;

            case 5: // Display Sets
                displaySet("A", A);
                displaySet("B", B);
                break;

            case 6: // Exit
                printf("Exiting program.\n");
                break;

            default:
                printf("Invalid choice.\n");
                break;
        }
    } while (choice != 6);

    return 0;
}