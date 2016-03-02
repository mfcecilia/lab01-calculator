package Introduction;
import student.TestCase;


/**
 *  CalculatorTest will test all of the methods in Calculator to make
 *  sure that they run and perform as expected
 *
 * @author  Mykayla Fernandes  mkaykay1
 * @version 2016.03.02
 */


public class CalculatorTest extends TestCase
{
    /**
     * creates calculator field
     */
    private Calculator calc;

    /**
     * sets up each test method before it runs
     */
    public void setUp()
    {
        calc = new Calculator(1, 2);
    }
    
    public void testCreateCalculator()
    {
        assertEquals(1, calc.getFirstInput(), 0.01);
    }
    
    public void testGetFirstInput()
    {
        assertEquals(1, calc.getFirstInput(), 0.01);
    }
    
    public void testGetSecondInput()
    {
        assertEquals(2, calc.getSecondInput(), 0.01);
    }
    
    public void testMultiply()
    {
        assertEquals(2, calc.multiply(), 0.01);
    }
    
    public void testDivide()
    {
        assertEquals(0.5, calc.divide(), 0.01);
        Calculator calc2 = new Calculator(1, 0);
        assertEquals(Double.NaN, calc2.divide(), 0.01);
    }
    
    public void testAdd()
    {
        assertEquals(3, calc.add(), 0.01);
    }
    
    public void testSubtract()
    {
        assertEquals(-1, calc.subtract(), 0.01);
    }
    
    public void testPower()
    {
        assertEquals(1, calc.power(), 0.01);
    }

}
