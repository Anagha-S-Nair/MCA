//Create a class Person with data members- name,gender,phoneno.create an interface showable with void show(). 
//Create a class Student that inherits from Person with data members- course,score.
//Derive a class PGStudent that inherits from Student with data members- researchArea,guide. 
//Create N PGstudent and
//(i)rank them based on scores.
//(ii)sort them based on research area.
//Display the details using show().
import java.util.*;
interface showable{
    void show();
}
class Person{
    String name;
    String gender;
    String phonenumber;
    Person(String name,String gender,String phonenumber){
        this.name=name;
        this.gender=gender;
        this.phonenumber=phonenumber;
    }
}
class Student extends Person{
    String course;
    double score;
    Student(String name ,String gender,String phonenumber,String course,double score){
        super(name,gender,phonenumber);
        this.course=course; 
        this.score=score;
    }
}
class PGStudent extends Student implements showable{
    String researchArea;
    String guide;
    PGStudent(String name,String gender,String phonenumber,String course,double score,String researchArea,String guide){
        super(name,gender,phonenumber,course,score);
        this.researchArea=researchArea;
        this.guide=guide;
    }
    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone Number: "+phonenumber);
        System.out.println("Course: "+course);
        System.out.println("Score: "+score);
        System.out.println("Research Area: "+researchArea);
        System.out.println("Guide: "+guide);
    }
}
public class PGStudentDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: of PG Students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        PGStudent[] students = new PGStudent[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details for student "+(i+1)+":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Phone Number: ");
            String phonenumber = sc.nextLine();
            System.out.print("Course: ");
            String course = sc.nextLine();
            System.out.print("Score: ");
            double score = sc.nextDouble();
            sc.nextLine(); // consume newline
            System.out.print("Research Area: ");
            String researchArea = sc.nextLine();
            System.out.print("Guide: ");
            String guide = sc.nextLine();
            students[i] = new PGStudent(name,gender,phonenumber,course,score,researchArea,guide);
        }
        Arrays.sort(students,(a,b) -> Double.compare(b.score,a.score)); // sort by score in descending order
        System.out.println("\nRanking based on scores:");
        for(int i=0;i<n;i++){
            System.out.println("\nRank "+(i+1)+":");
            students[i].show();
        }
        Arrays.sort(students,(a,b) -> a.researchArea.compareToIgnoreCase(b.researchArea)); // sort by research area in alphabetical order
        System.out.println("\nSorted by research area:");
        for(PGStudent s:students){
            s.show();
        }
        sc.close();
    }
}