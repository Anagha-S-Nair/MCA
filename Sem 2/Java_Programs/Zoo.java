//Create class Zoo with the name and region (string array, sample data example area 1, area 2, etc). 
// Create an inner class Enclosure with the name (string, sample data example grassland, fly zone, aqatic, etc), type (string sample data outdoor, indoor, etc), and animals (string array with animals found in the given enclosure.
// Create a static nested class Contact with address and phone number. Display details of zoo including its contact info and detailed information of different enclosures.

import java.util.Scanner;
class Zoo{
    String name;
    String[] regions;
    Zoo(String name,String[] regions){
        this.name=name;
        this.regions=regions;
    }
    class Enclosure{
        String name;
        String type;
        String[] animals;
        Enclosure(String name,String type,String[] animals){
            this.name=name;
            this.type=type;
            this.animals=animals;
        }
        void show(){
            System.out.println("Enclosure Name: "+name);
            System.out.println("Type: "+type);
            System.out.print("Animals: ");
            for(String a:animals){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    static class Contact{
        String address;
        String phone;
        Contact(String address,String phone){
            this.address=address;
            this.phone=phone;
        }
        void show(){
            System.out.println("Contact Information:");
            System.out.println("Address: "+address);
            System.out.println("Phone: "+phone);
        }
    }
    void showZoo(){
        System.out.println("Zoo Name: "+name);
        System.out.print("Regions: ");
        for(String r:regions){
            System.out.print(r+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Zoo Name: ");
        String zooName = sc.nextLine();
        System.out.print("Enter number of regions: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] regions = new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter region "+(i+1)+": ");
            regions[i] = sc.nextLine();
        }
        Zoo zoo = new Zoo(zooName,regions);
        System.out.println("Address: ");
        String address = sc.nextLine();
        System.out.println("Phone: ");
        String phone = sc.nextLine();
        Contact contact = new Contact(address,phone);
        String[] animals1 = {"Lion","elephant"};
        String[] animals2 = {"Parrot","Eagle"};
        String[] animals3 = {"Fish","Turtle"};
        Enclosure enclosure1 = zoo.new Enclosure("Grassland","Outdoor",animals1);
        Enclosure enclosure2 = zoo.new Enclosure("Fly Zone","Outdoor",animals2);
        Enclosure enclosure3 = zoo.new Enclosure("Aquatic","Indoor",animals3);
        zoo.showZoo();
        contact.show();
        enclosure1.show();
        enclosure2.show();
        enclosure3.show();
        sc.close();
    }
}
