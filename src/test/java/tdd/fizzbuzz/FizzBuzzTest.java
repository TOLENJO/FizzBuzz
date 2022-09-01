package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//During counting off, if the number is the multiples of two special numbers, eg.
//        the first and second numbers, then a student should say FizzBuzz instead of this number,
//        so on and so forth. If the number is the multiples of three special numbers, say FizzBuzzWhizz.
// FizzBuzz, FizzWhizz, FizzBuzzWhizz,
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

    @Test
    void should_return_FizzBuzz_when_countOf_given_15() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzz";

        //When
        String actual = fizzBuzz.countOf(15);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_BuzzWhizz_when_countOf_given_21() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzWhizz";

        //When
        String actual = fizzBuzz.countOf(21);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_BuzzWhizz_when_countOf_given_35() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "BuzzWhizz";

        //When
        String actual = fizzBuzz.countOf(35);

        //Then
        assertEquals(expected, actual);
    }
    @Test
    void should_return_FizzBuzzWhizz_when_countOf_given_105() {
        //Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzzWhizz";

        //When
        String actual = fizzBuzz.countOf(105);

        //Then
        assertEquals(expected, actual);
    }
}
