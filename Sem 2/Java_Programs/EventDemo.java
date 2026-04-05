//PROGRAM-20
//Store a list of attendees , where each attendee is represented by an Attendee class with name,email and registrationID(unique integer).
//Ensure that each attendee is registered only once(ie,no duplicate registrations based on registrationIDs).

import java.util.*;

class Attendee {
    String name;
    String email;
    int registrationID;

    Attendee(String n, String e, int r) {
        name = n;
        email = e;
        registrationID = r;
    }

    public String toString() {
        return registrationID + "-" + name + "-" + email;
    }
}

public class EventDemo {
    public static void main(String[] args) {
        HashMap<Integer, Attendee> attendees = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Register Attendee");
            System.out.println("2. Display Attendees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter registration ID: ");
                    int regID = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    if (attendees.containsKey(regID)) {
                        System.out.println("Attendee with this registration ID already exists.");
                    } else {
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter email: ");
                        String email = sc.nextLine();
                        attendees.put(regID, new Attendee(name, email, regID));
                        System.out.println("Attendee registered.");
                    }
                    break;
                case 2:
                    if (attendees.isEmpty()) {
                        System.out.println("No attendees registered.");
                    } else {
                        System.out.println("Attendees:");
                        for (Attendee a : attendees.values()) {
                            System.out.println(a);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        sc.close();
    }
}