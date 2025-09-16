package Casting;

public class Explicit_casting {

        public static void main(String[] args) {

            double doubleValue = 99.99;
            // double → 64 bits (8 bytes), IEEE 754 format
            // Stores 99.99 with high precision (about 15–16 decimal digits)

            float floatValue = (float) doubleValue;
            // float → 32 bits (4 bytes), IEEE 754 format
            // Precision reduces to ~6–7 decimal digits
            // Possible data loss: less precision, rounding error

            long longValue = (long) floatValue;
            // long → 64 bits (8 bytes), stores integers only
            // Decimal part (fraction) is TRUNCATED
            // 99.99 → 99
            //  Data loss: fractional part (0.99) is discarded

            int intValue = (int) longValue;
            // int → 32 bits (4 bytes)
            // long (64 bits) shrinks into int (32 bits)
            // If value > 2,147,483,647 or < -2,147,483,648, overflow happens
            //  No data loss here because 99 fits in int range

            short shortValue = (short) intValue;
            // short → 16 bits (2 bytes), range: -32,768 to 32,767
            // If int value exceeds short range, high-order bits are cut off
            // Example: int 40000 → short -25536
            //  Here 99 fits, so no data loss

            byte byteValue = (byte) intValue;
            // byte → 8 bits (1 byte), range: -128 to 127
            // If int value exceeds range, only lowest 8 bits kept
            // Example: int 130 (binary 10000010) → byte -126
            //  Here 99 fits, so no data loss

            char charValue = (char) intValue;
            // char → 16 bits (2 bytes), unsigned (0 to 65535)
            // int 99 is cast to Unicode character U+0063
            // which is 'c'
            // Possible "data interpretation loss" → numeric 99 becomes character 'c'

            // printing values
            System.out.println("Double (64-bit): " + doubleValue);
            System.out.println("Float  (32-bit): " + floatValue);
            System.out.println("Long   (64-bit): " + longValue);
            System.out.println("Int    (32-bit): " + intValue);
            System.out.println("Short  (16-bit): " + shortValue);
            System.out.println("Byte   (8-bit) : " + byteValue);
            System.out.println("Char   (16-bit): " + charValue);
        }
    }


