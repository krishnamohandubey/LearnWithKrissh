package test.loop.forLoop;

import main.loop.forLoop.SumOfDigits;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {
    @Test

    @ParameterizedTest
    @CsvSource({
            "45, 9",
            "123, 6",
            "987, 24"
            // Add more test cases as needed
    })
    void testSum(int input, int expected) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        int result = sumOfDigits.sum(input);
        assertEquals(expected, result);
    }
}