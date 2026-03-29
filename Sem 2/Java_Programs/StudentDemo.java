import java.util.*;

public class StudentDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Get Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    studentMap.put(id, name);
                    System.out.println("Student added.");
                    break;

                case 2:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();
                    if (studentMap.containsKey(searchId)) {
                        System.out.println("Student Name: " + studentMap.get(searchId));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    if (studentMap.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        for (Map.Entry<Integer, String> s : studentMap.entrySet()) {
                            System.out.println("ID: " + s.getKey() + ", Name: " + s.getValue());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}