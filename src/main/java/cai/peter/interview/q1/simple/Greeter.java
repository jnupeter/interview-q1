package cai.peter.interview.q1.simple;

/**
 * Created by peter on 9/02/17.
 */
public class Greeter {
    public Greeter(){
        //empty default constructor
    }

    /**
     * implementation
     * @param i
     * @return
     */
    public String greet(final int i) {
        if (i % 20 == 0) { //divible by both 4 and 5
            return "Helloworld";
        } else if (i % 4 == 0) {
            return "Hello";
        } else if (i % 5 == 0) {
            return "World";
        } else {
            return String.valueOf(i);
        }
    }
}
