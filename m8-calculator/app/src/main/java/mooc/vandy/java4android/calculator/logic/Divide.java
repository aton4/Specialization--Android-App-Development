package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    public static String divideOperation(int first, int second)
    {
        return Integer.toString(first / second) + " R: " + Integer.toString(first % second);
    }
}
