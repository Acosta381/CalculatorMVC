

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CalculatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalculatorTest
{
    
   /**
     * constructor for objects of class CalculatorTest
     */
    public CalculatorTest()
    {}
    
    @Test
   public void testAdd(){
       Calculator calculator = new Calculator();
       assertEquals(5.0, calculator.add(2, 3), "2 + 3 should equal 5");
    }
    
     @Test
   public void testSub(){
       Calculator calculator = new Calculator();
       assertEquals(8.0, calculator.sub(10, 2), "10 - 2 should equal 8");
    }
    
     @Test
   public void testDiv(){
       Calculator calculator = new Calculator();
       assertEquals(2.0, calculator.div(8, 4), "8 / 4 should equal 2");
    }
    
     @Test
   public void testMul(){
       Calculator calculator = new Calculator();
       assertEquals(25.0, calculator.mul(5, 5), "5 * 5 should equal 25");
    }
    
     @Test
   public void testPower(){
       Calculator calculator = new Calculator();
       assertEquals(4.0, calculator.power(2, 2), "2 ^ 2 should equal 4");
    }

         @Test
   public void testSquare(){
       Calculator calculator = new Calculator();
       assertEquals(16.0, calculator.sqr(4), "sqaure root of 4 should equal 16");
    }

}
