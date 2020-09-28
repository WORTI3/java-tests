import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void shouldReturnSingleNumberOnInput() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void shouldReturnSumOfTwoNumbersDelimitedByAComma(){
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void shouldReturnSumOfMultipleNumbers() {
        assertEquals(6, StringCalculator.add("1,2,3"));
    }

    @Test
    public void shouldReturnSumOfTwoNumbersDelimitedByANewLine(){
        assertEquals(3, StringCalculator.add("1\n2"));
    }

    @Test
    public void shouldThrowRuntimeErrorWhenNegativePresent(){
        RuntimeException e = assertThrows(RuntimeException.class, () -> StringCalculator.add("-1,2,-3"));
        assertEquals("Negatives are not allowed.", e.getMessage());
    }

}