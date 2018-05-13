
package az.mm.recursion;

/**
 * @author MM <mushfiqazeri@gmail.com>
 */
public class StringReverse {

    public static void main(String[] args) {
        System.out.printf("programmer --> %s%n", reverse("programmer"));
    //  reverseExplain("programmer");
    }

    private static String reverse(String str) {
        if (str.length() == 0) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    
    private static String reverseExplain(String str) {
        if (str.length() == 0) {
            System.out.println("Recursion ends, reverse starts!");
            return str;
        }
        String s = reverseExplain(getSubstring(str)) + getFirstChar(str);
        return s;
    }

    private static char getFirstChar(String str) {
        System.out.println(str + " --> " + str.charAt(0));
        return str.charAt(0);
    }

    private static String getSubstring(String str) {
        System.out.println(str.substring(1));
        return str.substring(1);
    }
}
