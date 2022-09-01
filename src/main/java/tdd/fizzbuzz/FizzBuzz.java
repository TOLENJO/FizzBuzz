package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOf(int order) {
        String orderMessage = "";

        if (order % 3 == 0) orderMessage += FIZZ;
        if (order % 5 == 0) orderMessage += BUZZ;
        if (order % 7 == 0) orderMessage += WHIZZ;
        if (orderMessage.isEmpty()) orderMessage = String.valueOf(order);

        return orderMessage;
    }
}
