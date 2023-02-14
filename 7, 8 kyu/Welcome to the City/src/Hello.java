import java.util.StringJoiner;

public class Hello {
    public String sayHello(String[] name, String city, String state){
        StringJoiner joiner = new StringJoiner(" ");
        for (String str :
                name) {
            joiner.add(str);
        }
        return String.format("Hello, %s! Welcome to %s, %s!", joiner, city, state);
    }
    public String sayHello2(String[] name, String city, String state){
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name), city, state);
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.sayHello2(new String[]{"John", "Smith"}, "Phoenix", "Arizona"));
    }
}
