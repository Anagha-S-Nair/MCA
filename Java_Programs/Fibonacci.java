// Write a function to find nth Fibonacci number.
import java.util.Scanner;
class Fibonacci{
    public static int Fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Fibonacci number="+ Fibonacci(num));
        sc.close();

    }
}