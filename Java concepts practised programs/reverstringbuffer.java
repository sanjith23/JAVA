import java.util.Scanner;

/**
 * reverstringbuffer
 */
public class reverstringbuffer {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String; ");

        str b = sc.next();

        StringBuffer a = new StringBuffer(b);
        System.out.println("The reverse sting is" + a.reverse());
    }
}