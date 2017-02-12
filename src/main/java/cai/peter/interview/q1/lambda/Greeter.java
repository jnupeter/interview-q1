package cai.peter.interview.q1.lambda;

/**
 * Created by peter on 12/02/17.
 */
public class Greeter {

    private Integer number;

    public Greeter() {
        this.number = Integer.valueOf(0);
    }

    public Greeter(final Integer number) {
        this.number = number;
    }

    // greet method
    public String greet() {
        final int num = this.number.intValue();
        if (num % 20 == 0) {
            return "Helloworld";
        } else if (num % 4 == 0) {
            return "Hello";
        } else if (num % 5 == 0) {
            return "World";
        } else {
            return this.number.toString();
        }
    }
}