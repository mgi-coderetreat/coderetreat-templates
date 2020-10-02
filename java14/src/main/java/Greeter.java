public class Greeter {

    public static record Greeting(String text) {
    }

    public Greeting greet() {
        return new Greeting("Hell0");
    }
}
