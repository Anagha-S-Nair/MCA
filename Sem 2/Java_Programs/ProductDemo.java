//Create a class Product(name,price).Write a menu driven program to
//(a) Add products
//(b) Sort products by name
//(c) Display products

import java.util.*;
class Product{
    String name;
    double price;
    Product(String n,double p){
        name=n;
        price=p;
    }
    public String toString(){
        return name + "-Rs" + price;
    }
}
public class ProductDemo {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Sort Products by Name");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter product price: ");
                    double price = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    products.add(new Product(name, price));
                    System.out.println("Product added.");
                    break;
                case 2:
                    // Collections.sort(products, Comparator.comparing(p -> p.name));
                    // System.out.println("Products sorted by name.");
                    // break;
                    products.sort(Comparator.comparing(a -> a.name));
                    break;
                case 3:
                    if(products.isEmpty()){
                        System.out.println("No products to display.");
                    } else {
                        System.out.println("Products:");
                        for (Product p : products) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
    
}
