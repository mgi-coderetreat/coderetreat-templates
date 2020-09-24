public class Main {

    public static void main(String... args) {
        System.out.println("Hello World!" + new Person("foo", "bar"));
    }

    public static record Person(String name, String partner) {
    }

}
