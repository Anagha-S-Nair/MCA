// Write a function that generates the multiplication table using non-static method.

import java.util.Scanner;
class MultiplicationTable{
    void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + "x" + i + "=" + (n*i));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        MultiplicationTable obj = new MultiplicationTable();
        obj.table(n);
        sc.close();
    }
}