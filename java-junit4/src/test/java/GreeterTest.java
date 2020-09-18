import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ThingTest {

    @Test
    public void it_should_greet() {
        Greeter thing = new Greeter();
        String greeting = thing.greet();
        Assertions.assertThat(greeting).isEqualTo("Hello");
    }

    @Test
    public void it_should_fail() {
        fail();
    }
}
