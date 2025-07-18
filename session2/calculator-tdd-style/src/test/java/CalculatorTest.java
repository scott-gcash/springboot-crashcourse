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
    void shouldBeTurnedOff() {
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldTurnedOn() {
        calculator.turnOn();
        assertTrue(calculator.isOn());
    }

    @Test
    void shouldTurnedOff() {
        calculator.turnOn();
        assertTrue(calculator.isOn());
        calculator.turnOff();
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldBeOffAfterOn(){
        calculator.turnOn();
        assertFalse(calculator.isOff());

        calculator.turnOff();
        assertTrue(calculator.isOff());
    }

    @Test
    void addIntNumbers(){
        int sumResult = calculator.sum(5, 6);
        assertEquals(11, sumResult);
    }

    @Test
    void addFloatNumbers(){
        float sumResult = calculator.sum(5.2f, 61.f);
        assertEquals(11.3, sumResult);
    }
}
