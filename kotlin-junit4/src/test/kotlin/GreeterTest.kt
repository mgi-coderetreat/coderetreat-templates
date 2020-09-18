import org.junit.Test
import kotlin.test.assertEquals

class GreeterTest {

    val greeter = Greeter()

    @Test
    fun `should greet properly`(){
        assertEquals("Hello", greeter.greet())
    }

}