package cai.peter.interview.q1.simple;

import cai.peter.interview.q1.simple.Greeter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by peter on 9/02/17.
 */
public class GreeterTest {

    @Test
    public void shouldGreetCorrectly() {
        Greeter greeter = new Greeter();
        Assert.assertEquals("should return Hello for 16", "Hello", greeter.greet(16));
        Assert.assertEquals("should return World for 30", "World", greeter.greet(30));
        Assert.assertEquals("should return Helloworld for 40", "Helloworld", greeter.greet(40));
        Assert.assertEquals("should return helloworld for 60", "Helloworld", greeter.greet(60));
    }
}
