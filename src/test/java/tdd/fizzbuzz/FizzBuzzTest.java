package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_order_number_when_countOf_case_given_normal_case() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "1";

        //When
        String actual = fizzBuzz.countOf(1);

        //Then
        assertEquals(expected, actual);
    }
}
