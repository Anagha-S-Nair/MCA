//Create a class abstract(Model,Company).Create a class Car(No of doors,fuel type) that inherits from Vehicle.
// Create a class Electric(Battery capacity) that inherits from Car. 
//Include the concepts of abstract base class,dynamic method dispatch,constructor as well as method overriding.

abstract class Vechile{
    String model;
    String Company;
    Vechile(String model,String Company){
        this.model=model;
        this.Company=Company;
    }
    abstract void display();

}

class Car extends Vechile{
    int noOfDoors;
    String fuleType;
    Car(String model,String Company,int noOfDoors,String fuleType){
        super(model,Company);
        this.noOfDoors=noOfDoors;
        this.fuleType=fuleType;
    }
    void display(){
        System.out.println("Car Model: "+model);
        System.out.println("Company: "+Company);
        System.out.println("Number of Doors: "+noOfDoors);
        System.out.println("Fuel Type: "+fuleType);
    }
}
class Electric extends Car{
    int batteryCapacity;
    Electric(String model,String Company,int noOfDoors,String fuleType,int batteryCapacity){
        super(model,Company,noOfDoors,"Electric");
        this.batteryCapacity=batteryCapacity;
    }
    void display(){
        super.display();
        System.out.println("Battery Capacity: "+batteryCapacity+" kWh");
    }
}
public class VehicleDemo {
    public static void main(String args[]){
        Vechile v = new Electric("Model S","Tesla",4,"Electric",100);
        v.display();
    }
}