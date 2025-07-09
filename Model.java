
/**
 * Write a description of class Model here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Model
{
    View view;
    Controller controller;
    Calculator calculator = null;
    
    public Model(Calculator c){
        calculator = c;    
    }
    public void doAdd(){
        String resultStr = null;
        try{
            double num1 = Double.parseDouble(view.textNum1.getText()); //Store in double because it can habdle both whole numbers and decimals
            double num2 = Double.parseDouble(view.textNum2.getText());
            double result = calculator.add(num1,num2);
            // Check if the result is a whole number (no decimal part)
        if (result == (int) result) {
            resultStr = String.format("%d", (int) result);  // Show as an integer
        } else {
            resultStr = String.format("%.1f", result);  // Show with one decimal place
        }
        
        }
        catch(Exception e){
            resultStr = "must be a valid number";
            view.update("","", resultStr);
        }
        String operatorIcon = "+";
        String equation = "= ";
        view.update(operatorIcon,equation, resultStr);
    }
    
        public void doSubtract(){
        String resultStr = null;
        try{
            double num1 = Double.parseDouble(view.textNum1.getText());
            double num2 = Double.parseDouble(view.textNum2.getText());
            double result = calculator.sub(num1,num2);
        if (result == (int) result) {
            resultStr = String.format("%d", (int) result);  // Show as an integer
        } else {
            resultStr = String.format("%.1f", result);  // Show with one decimal place
        }
        
        }
        catch(Exception e){
            resultStr = "must be a valid number";
            view.update("","", resultStr);
        }
        String operatorIcon = "-";
        String equation = "= ";
        view.update(operatorIcon,equation, resultStr);
    }
    
    public void doMultiply() {
    String resultStr = null;
    try {
        double num1 = Double.parseDouble(view.textNum1.getText());
        double num2 = Double.parseDouble(view.textNum2.getText());
        double result = calculator.mul(num1, num2);
    if (result == (int) result) {
            resultStr = String.format("%d", (int) result);  // Show as an integer
        } else {
            resultStr = String.format("%.1f", result);  // Show with one decimal place
        }
        
        }
        catch(Exception e){
            resultStr = "must be a valid number";
            view.update("","", resultStr);
        }
    String operatorIcon = "*";
    String equation = "= ";
    view.update(operatorIcon, equation, resultStr);
}


public void doDivide() {
    String resultStr = null;
    try {
        double num1 = Double.parseDouble(view.textNum1.getText());
        double num2 = Double.parseDouble(view.textNum2.getText());

        // Handle division by zero
        if (num2 == 0) {
            resultStr = "Cannot divide by zero";
        } else {
            // Perform the division
            double result = calculator.div(num1, num2);

            // Check if the result is a whole number (no decimal part)
            if (result == (int) result) {
                resultStr = String.format("%d", (int) result);  // Show as an integer
            } else {
                resultStr = String.format("%.1f", result);  // Show with one decimal place
            }
        }
    } catch (Exception e) {
        resultStr = "must be a valid number";
        view.update("", "", resultStr);
        return;
    }
    String operatorIcon = "/";
    String equation = "= ";
    view.update(operatorIcon, equation, resultStr);
}


public void doPower() {
    String resultStr = null;
    try {
        double num1 = Double.parseDouble(view.textNum1.getText());
        double num2 = Double.parseDouble(view.textNum2.getText());
        double result = Math.pow(num1,num2); // Square the number
     if (result == (int) result) {
            // If the result is a whole number, format it as an integer
            resultStr = String.format("%d", (int) result);  
        } else {
            // If the result has a decimal part, format it to 2 decimal places
            resultStr = String.format("%.2f", result);  
        }
        
    } catch (Exception e) {
        resultStr = "must be a valid number";
        view.update("", "", resultStr);
    }
    String operatorIcon = "x²";
    String equation = "= ";
    view.update(operatorIcon, equation, resultStr);
}

public void doSquare() {
    String resultStr = null;
    try {
        double num1 = Double.parseDouble(view.textNum1.getText()); //Get the number from the input field as a string, then parse it to an intege
        double result = Math.sqrt(num1);
    if (result == (int) result) {
            // If the result is a whole number, format it as an integer
            resultStr = String.format("%d", (int) result);  
        } else {
            // If the result has a decimal part, format it to 2 decimal places
            resultStr = String.format("%.2f", result);  
        }
        
    } catch (Exception e) {
        resultStr = "must be a valid number";
        view.update("", "", resultStr);
    }
    String operatorIcon = "√";
    String equation = "= ";
    view.update(operatorIcon, equation, resultStr);
}

public void doClear () {
    view.textNum1.setText("");    // Clears the first input field
    view.textNum2.setText("");    // Clears the second input field
    view.textResult.setText("");  
    view.operator.setText("Operator:...."); //Operator field changes to x text
    view.equal.setText("=  I am waiting for calculated result.... ");
    
}
}
