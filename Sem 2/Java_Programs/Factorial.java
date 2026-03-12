// Write a recursive function to find the factorial of a number using static method.
import java.util.Scanner;
class Factorial{
    public static int Factorial(int n){
        if (n==0 || n==1)
            return 1;
        return n*Factorial(n-1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int num=sc.nextInt();
        System.out.println("Factorial of "+num+" is: "+Factorial(num));
        sc.close();

    }
}