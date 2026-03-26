//Create a class Rectangle with data members length and width.
//Define interfaces Measurable with a method declaration to find volume of objects and Printable with a method declaration to display particulars of the object. 
//Create a class Cuboid(height) that inherits from Rectangle and implements interfaces.
interface Measurable{
    double volume();
}
interface Printable{
    void display();
}
class Rectangle{
    protected double length,width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
}
class Cuboid extends Rectangle implements Measurable,Printable{
    private double height;
    Cuboid(double length,double width,double height){
        super(length,width);
        this.height=height;
    }
    public double volume(){
        return length*width*height;
    }
    public void display(){
        System.out.println("Cuboid Dimensions:");
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
        System.out.println("Volume: "+volume());
    }
}
public class CuboidDemo {
    public static void main(String args[]){
        Cuboid c1=new Cuboid(5,3,2);
        c1.display();
    }
}