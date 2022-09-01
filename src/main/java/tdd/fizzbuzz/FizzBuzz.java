package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOf(int order) {
        String orderMessage = "";

        if (order % 3 == 0) orderMessage += "Fizz";
        if (order % 5 == 0) orderMessage += "Buzz";
        if (order % 7 == 0) orderMessage += "Whizz";
        if (orderMessage.isEmpty()) orderMessage = String.valueOf(order);

        return orderMessage;
    }
}
