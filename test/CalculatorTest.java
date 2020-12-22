import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void sumTest(){
        CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

        assertEquals(20,calculatorServiceImpl.sum(10, 10));
        assertEquals(16,calculatorServiceImpl.prod(4, 4));
    }
}