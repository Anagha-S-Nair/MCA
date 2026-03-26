//Create a class Person with data members- name,gender,address,age. Create a class Employee that inherits from Person with data members- empid,companyName,qualification,salary.
//Derive a class Teacher that inherits from Employee with data members- teacherid,subject,department.
//Demonstrate using N Teachers
class Person{
    String name,gender,address;
    int age;
    Person(String name,String gender,String address,int age){
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
}
class Employee extends Person{
    int empid;
    String companyName,qualification;
    double salary;
    Employee(String name,String gender,String address,int age,int empid,String companyName,String qualification,double salary){
        super(name,gender,address,age);
        this.empid=empid;
        this.companyName=companyName;
        this.qualification=qualification;
        this.salary=salary;
    }
}

class Teacher extends Employee{
    int teacherid;
    String subject,department;
    Teacher(String name,String gender,String address,int age,int empid,String companyName,String qualification,double salary,int teacherid,String subject,String department){
        super(name,gender,address,age,empid,companyName,qualification,salary);
        this.teacherid=teacherid;
        this.subject=subject;
        this.department=department;
    }
    void display(){
        System.out.println("\n TeacherID: "+teacherid);
        System.out.println("\n Name: "+name);
        System.out.println("\n Gender: "+gender);
        System.out.println("\n Age: "+age);
        System.out.println("\n Address: "+address);
        System.out.println("\n EmployeeID: "+empid);
        System.out.println("\n Company Name: "+companyName);
        System.out.println("\n Qualification: "+qualification);
        System.out.println("\n Salary: "+salary);
        System.out.println("\n Subject: "+subject);
        System.out.println("\n Department: "+department);
    }
}
public class PersonDemo{
    public static void main(String args[]){
        Teacher[] teachers = new Teacher[2];
        teachers[0] = new Teacher("John", "Male", "123 Main St", 45, 101, "ABC Corp", "MSc", 50000.0, 1, "Mathematics", "Science");
        teachers[1] = new Teacher("Jane", "Female", "456 Oak Ave", 42, 102, "XYZ Corp", "PhD", 60000.0, 2, "Physics", "Science");
        // teachers[0].display();
        // teachers[1].display();
        for(Teacher t:teachers){
            t.display();
        }
    }
}