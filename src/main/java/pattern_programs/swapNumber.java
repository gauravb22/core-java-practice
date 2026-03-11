/*This program to swap two numbers without using a temporary variable.*/
        package pattern_programs;
public class swapNumber {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}

