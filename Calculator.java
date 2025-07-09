import java.lang.Math;

public class Calculator {
    public double add(double a, double b) {
        return a + b;  //will sum the parameters a and b
    }
    
    public double sub(double a, double b) {
    return a - b;   //will subtract the parameters a and b
    }

    public double mul(double a, double b) {
    return a * b;  //will multiply the parameters a and b
    }
    
    public double div(double a, double b) {
        if (b == 0 ) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        
        return a / b;  //will dvide the parameters a and b and if the a is divided by zero an error message will appear
    }
    
    public double sqr(double a) {
        return a*a;  //Returns the square root of a
    }
    
    public double power(double a, double b) {
        return (double) Math.pow(a, b);  // Will return a to the power of b
    }
}