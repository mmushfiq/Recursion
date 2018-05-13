package az.mm.recursion;

/**
 * @author MM <mushfiqazeri@gmail.com>
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));  //120
    }

    private static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
