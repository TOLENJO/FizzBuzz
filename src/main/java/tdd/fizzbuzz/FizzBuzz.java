package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOf(int order) {
        String orderMessage;

        if (order % 3 == 0 ) {
            orderMessage = "Fizz";
        } else if (order % 5 == 0) {
            orderMessage = "Buzz";
        } else if (order % 7 == 0) {
            orderMessage = "Whizz";
        } else {
            orderMessage = String.valueOf(order);
        }
        return orderMessage;
    }
}
