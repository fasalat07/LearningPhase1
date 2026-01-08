package String;

public class Starts {
    public static void main(String[] args) {

        String s = "Java";


        System.out.println(s.startsWith("J")); //true
        System.out.println(s.startsWith("j")); //false case sensitive

        System.out.println(s.endsWith("a")); //true
        System.out.println(s.endsWith("z")); //false

    }
}
