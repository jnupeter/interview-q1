package cai.peter.interview.q1.lambda;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by peter on 12/02/17.
 */
public class GreeterTest {

    @Test
    public void shouldGreetCorrectly() {
        final Greeter g16 = new Greeter(Integer.valueOf(16));
        Assert.assertEquals("should return Hello for 16", "Hello", g16.greet());

        final Greeter g30 = new Greeter(Integer.valueOf(30));
        Assert.assertEquals("should return World for 30", "World", g30.greet());

        final Greeter g40 = new Greeter(Integer.valueOf(40));
        Assert.assertEquals("should return Helloworld for 40", "Helloworld", g40.greet());

        final Greeter g60 = new Greeter(Integer.valueOf(60));
        Assert.assertEquals("should return helloworld for 60", "Helloworld", g60.greet());

    }
}
