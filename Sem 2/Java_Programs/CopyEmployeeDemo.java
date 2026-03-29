// PROGRAM - 28
// create a class Employee (id, name, department, salary).
// The program should write an employee object to a file,
// retrieve the stored information and display the details
// in a formatted output.

import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class CopyEmployeeDemo {
    public static void main(String[] args) {

        Employee emp = new Employee(123, "Ashley", "IT", 10000);

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("emp.ser"))) {

            out.writeObject(emp);
            System.out.println("Employee details written to a file");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("emp.ser"))) {

            Employee e = (Employee) in.readObject();

            System.out.println("ID: " + e.id +
                    "\nName: " + e.name +
                    "\nDepartment: " + e.department +
                    "\nSalary: " + e.salary);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}