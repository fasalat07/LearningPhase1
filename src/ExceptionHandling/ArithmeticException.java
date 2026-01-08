package ExceptionHandling;

public class ArithmeticException extends Throwable {
    public static void main(String[] args) {
        int num = 0;
        try {
            System.out.println("statement1");
            System.out.println("statement2");
            System.out.println("statement3");
            System.out.println("statement4");
            System.out.println(10 / num); // execute and throw an exception

        } catch (Exception e) {
            System.out.println("This line will be executed whenever exception is occured and caught");
            System.out.println(e.getMessage()); //handling ---> i want to see the message
        }finally {
            System.out.println("statement5");
            System.out.println("statement6");
            System.out.println("statement7");
            System.out.println("statement8");
        }
    }
}
