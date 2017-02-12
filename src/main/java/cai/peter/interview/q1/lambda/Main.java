package cai.peter.interview.q1.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 12/02/17.
 */
public class Main {
    public static void main(String[] args) {
        List<Greeter> greeters = new ArrayList<>();
        for (int i = 1; i < 101; i ++) {
            greeters.add(new Greeter(Integer.valueOf(i)));
        }

        greeters.forEach( g -> System.out.println(g.greet()));
    }
}
