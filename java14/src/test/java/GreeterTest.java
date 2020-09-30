import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class GreeterTest {

    @Test
    public void greeter_should_say_hello() {
        Greeter greeter = new Greeter();
        assertThat(greeter.greet()).isEqualTo(new Greeting("Hello"));
    }

}
