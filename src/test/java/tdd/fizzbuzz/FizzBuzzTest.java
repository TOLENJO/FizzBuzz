package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//During counting off, if the number is the multiples of the first special number,
//        number three (3), then the student should say Fizz;
//        if the number is the multiples of the second special number, number five (5), say Buzz;
//        if the multiples of the third special number, number seven (7), say Whizz.

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

    @Test
    void should_return_Fizz_when_countOf_given_3() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";

        //When
        String actual = fizzBuzz.countOf(3);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_Buzz_when_countOf_given_5() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";

        //When
        String actual = fizzBuzz.countOf(5);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_Whizz_when_countOf_given_7() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Whizz";

        //When
        String actual = fizzBuzz.countOf(7);

        //Then
        assertEquals(expected, actual);
    }
}
