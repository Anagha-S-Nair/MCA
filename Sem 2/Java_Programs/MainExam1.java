import java.util.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int roll, marks;

    Student(String name, int roll, int marks) {
        super(name);
        this.roll = roll;
        this.marks = marks;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }

    void printFactors(int num) {
        System.out.print("Factors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class DetailThread extends Thread {
    Student s;

    DetailThread(Student s) {
        this.s = s;
    }

    public void run() {
        s.printDetails();
    }
}

class FactorThread extends Thread {
    Student s;
    int num;

    FactorThread(Student s, int num) {
        this.s = s;
        this.num = num;
    }

    public void run() {
        s.printFactors(num);
    }
}


public class MainExam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Roll: ");
            int roll = sc.nextInt();

            System.out.print("Marks: ");
            int marks = sc.nextInt();

            System.out.print("Enter number to find factors: ");
            int num = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, roll, marks);

            // Threads for each student
            DetailThread t1 = new DetailThread(students[i]);
            FactorThread t2 = new FactorThread(students[i], num);

            t1.start();
            try {
                t1.join(); 
            } catch (Exception e) {}

            t2.start();
            try {
                t2.join();
            } catch (Exception e) {}
        }
    }
}