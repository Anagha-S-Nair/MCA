// PROGRAM - 22
// Create a class Product (productname, stockQuantity)
// implement a method purchase (int quantity).
// if requested quantity is less than or equal to zero,
// throw a built-in illegal Argument Exception with the
// message: "quantity must be positive"
// if requested quantity is greater than stockQuantity, throw
// a custom OutOfStockException.

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class Product {
    String productName;
    int stockQuantity;

    Product(String p, int s) {
        productName = p;
        stockQuantity = s;
    }

    public void purchase(int quantity) throws OutOfStockException {
        if (quantity <= 0) {
            throw new IllegalArgumentException("quantity must be positive");
        }

        if (quantity > stockQuantity) {
            throw new OutOfStockException("Exceeds available stock");
        }

        stockQuantity -= quantity;
        System.out.println(quantity + " " + productName + " purchased. Remaining stock: " + stockQuantity);
    }
}

public class DemoProduct {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 10);

        try {
            p.purchase(5);
            p.purchase(0);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}