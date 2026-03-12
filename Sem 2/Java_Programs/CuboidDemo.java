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