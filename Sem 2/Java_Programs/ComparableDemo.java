interface Comparable{
    double volume();
    int compare(Comparable other);
}
class Cuboid implements Comparable{
   double length,width,height;
   Cuboid(double length,double width,double height){
       this.length=length;
       this.width=width;
       this.height=height;
   }
    public double volume(){
         return length*width*height;
    }
    public int compare(Comparable other){
        if(this.volume() > other.volume()){
            return 1;
        }
        else if(this.volume() < other.volume()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
class Cylinder implements Comparable{
    double radius,height;
    Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
    public int compare(Comparable other){
        if(this.volume() > other.volume()){
            return 1;
        }
        else if(this.volume() < other.volume()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
public class ComparableDemo{
    public static void main(String args[]){
        Cuboid c1=new Cuboid(4,5,6);
        Cylinder c2=new Cylinder(3,7);
        System.out.println("Cuboid volume: " + c1.volume());
        System.out.println("Cylinder volume: " + c2.volume());
        int result=c1.compare(c2);
        if (result > 0 ){
            System.out.println("Cuboid has larger volume");
        }
        else if (result < 0){
            System.out.println("Cylinder has larger volume");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}