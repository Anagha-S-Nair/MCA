//Create an interface Shape with function area() and perimeter(). 
// Create two classes Circle and Rectangle which implements the above interface.
//Create a menu driven program to find area and perimeter of various shapes.

import java.util.Scanner;
interface Shape{
    double area();
    double perimeter();
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}
class Rectangle implements Shape{
    double length,breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
class ShapeDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.Circle");
            System.out.println("2.Rectangle");
            System.out.println("3.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Radius: ");
                    double radius = sc.nextDouble();
                    Circle c = new Circle(radius);
                    System.out.println("Area: "+c.area());
                    System.out.println("Perimeter: "+c.perimeter());
                    break;
                case 2:
                    System.out.print("Enter Length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter Breadth: ");
                    double breadth = sc.nextDouble();
                    Rectangle r = new Rectangle(length,breadth);
                    System.out.println("Area: "+r.area());
                    System.out.println("Perimeter: "+r.perimeter());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
        }
    }
        while(choice!=3);
        sc.close();
    }
}