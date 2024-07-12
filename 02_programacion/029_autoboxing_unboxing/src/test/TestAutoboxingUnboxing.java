package test;

/*
 * Clases envolventes de tipos primitivos:
 * 
 * int - Integer
 * long - Long
 * float - Float
 * double - Double
 * boolean - Boolean
 * byte - Byte
 * char - Character
 * short - Short
 */

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {

        // AUTOBOXING
        int numInt = 10;
        System.out.println("int: " + numInt);

        Integer ObjInteger = numInt;
        System.out.println("Integer: " + ObjInteger);

        System.out.println("Integer to String: " + ObjInteger.toString());
        System.out.println("Integer to float: " + ObjInteger.floatValue());

        // UNBOXING
        Double ObjDouble = 15.58;
        System.out.println("Double: " + ObjDouble);

        double numDouble = ObjDouble;
        System.out.println("double: " + numDouble);
    }
}
