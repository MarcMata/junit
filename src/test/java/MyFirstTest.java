import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void testAddition(){
        int input1 = 6;
        int input2 = 8;
        int expectedResult = 14;

        assertEquals(expectedResult, Calculator.add(input1,input2));


    }

}
