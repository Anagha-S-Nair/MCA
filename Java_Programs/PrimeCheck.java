// Write a function that checks whether a given number is prime or not using non-static method.

import java.util.Scanner;
class PrimeCheck{
    void checkPrime(int n){
        if(n<=1){
            System.out.println("Not a prime number");
            return;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Not a Prime number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        PrimeCheck obj = new PrimeCheck();
        obj.checkPrime(n);
        sc.close();
    }
}