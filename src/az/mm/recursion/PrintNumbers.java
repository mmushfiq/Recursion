
package az.mm.recursion;

/**
 * @author MM <mushfiqazeri@gmail.com>
 */
public class PrintNumbers {
    
    public static void main(String[] args) {
        printDesc(10);
        System.out.println();
        printAsc(10);
    }

    private static void printDesc(int a) {
        System.out.print(a + " ");
        if (a > 1) printDesc(a-1);
    }

    private static void printAsc(int a) {
        if (a > 1) printAsc(a-1);
        System.out.print(a + " ");
    }
}
