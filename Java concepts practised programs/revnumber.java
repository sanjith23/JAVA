/**
 * revnumber
 */
public class revnumber {

    public static void main(String[] args) {
        
        int n = 1234;
        System.out.println("The number is :" + n);
        int rev = 0;
        int rem;

        while(n > 0){
            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }

        for ( ; n > 0  ; n = n/10) {
            rem = n%10;
            rev = (rev*10) + rem;
        }
         System.out.println("The reverse number is :" + rev);


    }
}