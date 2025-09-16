package Casting;

public class ImplicitCasting {
    public static void main(String[] args) {
        // byte to int
        byte byteValue = 100;
        int intValue = byteValue; // byte automatically cast to int

        // int to long
        long longValue = intValue; // int automatically cast to long

        // long to float
        float floatValue = longValue; // long automatically cast to float

        // float to double
        double doubleValue = floatValue; // float automatically cast to double

        // printing the values
        System.out.println("Byte value   : " + byteValue);
        System.out.println("Int value    : " + intValue);
        System.out.println("Long value   : " + longValue);
        System.out.println("Float value  : " + floatValue);
        System.out.println("Double value : " + doubleValue);
    }
}
//byte → int: The compiler automatically converts byteValue (8 bits) into an int (32 bits).
//
//int → long: int (32 bits) widens into long (64 bits).
//
//long → float: Even though float is 32-bit, it has a larger range than long, so widening happens.
//
//float → double: float (32-bit, decimal) widens into double (64-bit, decimal).
//
//⚡ Key Point: No explicit casting ((type)) is required, the compiler does it automatically