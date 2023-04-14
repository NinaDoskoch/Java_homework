import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();

        // Create variables of each primitive type
        boolean b = random.nextBoolean();
        byte by = (byte) random.nextInt();
        char c = (char) random.nextInt(Character.MAX_VALUE + 1);
        double d = random.nextDouble();
        float f = random.nextFloat();
        int i = random.nextInt();
        long l = random.nextLong();
        short s = (short) random.nextInt();

        // Print out the values of the primitive variables
        System.out.println("Primitive type values:");
        System.out.println("- boolean: " + b);
        System.out.println("- byte: " + by);
        System.out.println("- char: " + c);
        System.out.println("- double: " + d);
        System.out.println("- float: " + f);
        System.out.println("- int: " + i);
        System.out.println("- long: " + l);
        System.out.println("- short: " + s);
    }
}
