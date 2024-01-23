
class exceptionhandeling{

    public void singleexception(){
        int i =2;
        int j= 7;

        try{
            j=18/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);

        System.out.println("Bye");
    }
    public void multipleexception(){
        int i =2;
        int j= 7;
        int nums[] = {2,4,6,54,33}; 
        String str = null;

        try{
            j=18/i;
           // System.out.println(str.length());
            System.out.println(nums[5]);
            System.out.println(nums[1]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot be deivided by zero");
        }
         catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit");
        }
         catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);

        System.out.println("Bye");
    }

}

public class learnexception {

    public static void main(String[] args) {

        exceptionhandeling obj = new exceptionhandeling();
        obj.singleexception();
        System.out.println("--------------");
        obj.multipleexception();
    }
}