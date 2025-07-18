import org.example.Calculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    static Calculator calculator;

    @BeforeAll
    static void setup(){
        calculator = new Calculator();
    }

    @Test
    void addIntNumbers(){
        int sumResult = calculator.sum(5, 6);
        assertEquals(11, sumResult);
    }

    @Test
    void addFloatNumbers(){
        float sumResult = calculator.sum(5.2f, 61.f);
        assertEquals(66.2, sumResult,0.0001);
    }

    @Test
    void addLongNumbers(){
        long sumResult = (long) calculator.sum(5.2, 61);
        assertEquals(66, sumResult);
    }
    @Test
    void addShortNumbers(){
        short sumResult = (short) calculator.sum(5.2, 61);
        assertEquals(66, sumResult);
    }
    @Test
    void addDoubleNumbers(){
        double sumResult = calculator.sum(5.2, 61.);
        assertEquals(66.2, sumResult,0.0001);
    }
}
