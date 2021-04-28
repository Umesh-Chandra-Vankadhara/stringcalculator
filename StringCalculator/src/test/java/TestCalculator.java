import com.umesh.Calculator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


@Test
public class TestCalculator {
    private Calculator calculator;

    @BeforeTest
    public void init() {
        calculator = new Calculator();
    }

    public void emptyStringReturnsZero() throws Exception {
        assertEquals(calculator.calculate(""), 0);
    }

    public void singleValueIsReplied() throws Exception {
        assertEquals(calculator.calculate("1"), 1);
    }

}
