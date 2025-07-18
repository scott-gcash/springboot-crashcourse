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

    @Test
    void subtractIntNumbers(){
        int diffResult = calculator.difference(5, 6);
        assertEquals(-1, diffResult);
    }

    @Test
    void subtractFloatNumbers(){
        float diffResult = calculator.difference(5.2f, 61.f);
        assertEquals(-55.8, diffResult,0.0001);
    }

    @Test
    void subtractLongNumbers(){
        long diffResult = (long) calculator.difference(5.2, 61);
        assertEquals(-55, diffResult);
    }
    @Test
    void subtractShortNumbers(){
        short diffResult = (short) calculator.difference(5.2, 61);
        assertEquals(-55, diffResult);
    }
    @Test
    void subtractDoubleNumbers(){
        double diffResult = calculator.difference(5.2, 61.);
        assertEquals(-55.8, diffResult,0.0001);
    }


    @Test
    void multiplyIntNumbers(){
        int multiplyResult = calculator.multiply(5, 6);
        assertEquals(30, multiplyResult);
    }

    @Test
    void multiplyFloatNumbers(){
        float multiplyResult = calculator.multiply(5.2f, 61.f);
        assertEquals(317.2, multiplyResult,0.0001);
    }

    @Test
    void multiplyLongNumbers(){
        long multiplyResult = (long) calculator.multiply(5.2, 61);
        assertEquals(317, multiplyResult);
    }
    @Test
    void multiplyShortNumbers(){
        short multiplyResult = (short) calculator.multiply(5.2, 61);
        assertEquals(317, multiplyResult);
    }
    @Test
    void multiplyDoubleNumbers(){
        double multiplyResult = calculator.multiply(5.2, 61.);
        assertEquals(317.2, multiplyResult,0.0001);
    }
}
