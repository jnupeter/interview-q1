package cai.peter.interview.q1.simple;

import cai.peter.interview.q1.simple.Greeter;

/**
 * Created by peter on 9/02/17.
 */
public class Main {

    public static void main(String[] args) {
        final Greeter greeter = new Greeter();
        for (int i = 1; i < 101; i++) {
            System.out.println(greeter.greet(i));
        }
    }
}
