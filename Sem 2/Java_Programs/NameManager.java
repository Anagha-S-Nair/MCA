//Create a list of names.Write a menu driven program to 
//(a) Add names
//(b) Remove names
//(c) Search for a name
//(d) Sort names
//(e) Display names

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class NameManager {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Name");
            System.out.println("2. Remove Name");
            System.out.println("3. Search Name");
            System.out.println("4. Sort Names");
            System.out.println("5. Display Names");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name to add: ");
                    String nameToAdd = sc.nextLine();
                    names.add(nameToAdd);
                    System.out.println("Name added.");
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    String nameToRemove = sc.nextLine();
                    if (names.remove(nameToRemove)) {
                        System.out.println("Name removed.");
                    } else {
                        System.out.println("Name not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String nameToSearch = sc.nextLine();
                    if (names.contains(nameToSearch)) {
                        System.out.println(nameToSearch+ " found in the list.");
                    } else {
                        System.out.println("Name not found.");
                    }
                    break;
                case 4:
                    Collections.sort(names);
                    System.out.println("Names sorted.");
                    break;
                case 5:
                    System.out.println("Names:");
                    for (String name : names) {
                        System.out.println(name);
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
        
    }
}