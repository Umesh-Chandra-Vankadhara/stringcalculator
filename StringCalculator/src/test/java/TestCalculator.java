import com.umesh.Calculator;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


@Test
public class TestCalculator {
    public void emptyStringReturnsZero(){
        Calculator calculator=new Calculator();
        assertEquals(calculator.calculate(""),0);
    }



}