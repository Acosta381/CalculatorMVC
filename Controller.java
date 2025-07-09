
/**
 * Write a description of class Controller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controller
{
    Model model;
    View view;
    
    public void doCalculating(String action){
        
        switch(action){
            case "+":
                model.doAdd();
                break;
            case "-":
                model.doSubtract();
                break;
            case "*":
                model.doMultiply();
                break;
            case "/":
                model.doDivide();
                break;
            case "√":
                model.doSquare();
                break;
            case "x²":
                model.doPower();
                break;
            case "C":
                model.doClear();
                break;
            default: view.textResult.setText("Sorry, I cannot do this calcualting");
        }
    }
}
