import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testAddition(){
        int input1 = 6;
        int input2 = 8;
        int expectedResult = 14;

        assertEquals(expectedResult, Calculator.add(input1,input2));
    }
    @Test
    public void testTipCalculator(){
        double bill = 22.56;
        double tipPercent = 15;
        double tip = 3.38;

        assertEquals(tip, Calculator.calculateTip(bill,tipPercent), 0.01);
    }

    @Test
    public void testCodeup(){
        String str1 = "Codeup";
        String str2 = "CodeUp";

        assertNotEquals(str1,str2);
    }

    @Test
    public void arrayListNotSame(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);

    }

    @Test
    public void arrayNotSame(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);

    }
    @Test
    public void letsGoTrueFalse(){
        String language = "PHP";

        assertTrue(language, language.contains("H"));
        assertFalse(language, language.contains("J"));
    }

    @Test
    public void nulls(){
        String language = null;
        assertNull(language);

        language = "Java";
        assertNotNull(language);
    }

}
