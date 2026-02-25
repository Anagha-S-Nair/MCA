package arithmetic;
public class Division implements Operation {
    public double calculate(double a,double b){
        if(b!=0){
            return a/b;
        }
        else{
            System.out.println("Division by zero is not allowed.");
            return 0; // or you could throw an exception
        }
    }
}