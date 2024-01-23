import java.util.Scanner;

class methods{

    public String methodA(){
            Scanner sc = new Scanner(System.in);
          String str = sc.next();

          String rev = "";

        int len = str.length();

        for(int i=len-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);
        return rev;

    }

    
     public String methodB(){

        //Using character array
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
          String str = sc.next();

          char a[] = str.toCharArray();
          int len = a.length;

          String rev = "";

          for(int i = len -1; i>=0; i--)
          {
            rev = rev + a[i];
          }

          System.out.println(rev);
        return rev;


    }

    public String methodc(){
        //Using string buffer

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();

        String rev = "";

        StringBuffer sb = new StringBuffer(str);

        rev = sb.reverse();

        return rev;
    }

}
public class reversestring {

    public static void main(String[] args) {

        // methods reversestring =  new methods();

        // String a =reversestring.methodA();
        // String b = reversestring.methodB();
        // String c = reversestring.methodc();

        // System.out.println(c);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String");
        String str = "name";

        String rev = "";

        StringBuffer sb = new StringBuffer(str);

        System.out.println(sb.reverse());

       // return rev;

       
        
       

        //Using character array

    }
}