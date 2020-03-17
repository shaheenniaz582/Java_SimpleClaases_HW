import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator cal;

    @Before

    public void before(){

        cal = new Calculator();

    }

    @Test

    public void add() {
        assertEquals(9, cal.add(4,5));
    }

    @Test

    public void subtract(){
        assertEquals(-1, cal.subtract(4,5));
    }

    @Test

    public void multiply(){
        assertEquals(20, cal.multiply(4,5));
    }

    @Test

    public void divide(){
        assertEquals(0.8,cal.divide(4.0,5.0));
    }
}
