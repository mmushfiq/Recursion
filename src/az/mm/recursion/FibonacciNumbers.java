
package az.mm.recursion;

import java.util.Scanner;

/**
 * @author MM <mushfiqazeri@gmail.com>
 */
public class FibonacciNumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
            System.out.print(fibonacci(i) + " ");
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
