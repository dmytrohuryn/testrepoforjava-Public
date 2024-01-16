public class PrimitiveTypesInfo {
    public static void main(String[] args) {
        // byte
        System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        // short
        System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        // int
        System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        // long
        System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        // float
        System.out.println("float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        // double
        System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        // char
        System.out.println("char: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

        // boolean
        System.out.println("boolean: No defined range (only true or false)");
    }
}
