
class exceptionhandeling{

    public void learnthrow(){
        int i =20;
        int j= 0;
     

        try{
            j=18/i;
           if(j == 0)
            throw new ArithmeticException();
        }
        catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("Cannot be deivided by zero");
        }
         
         catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);

        System.out.println("Bye");
    }

}

public class learnthrow {

    public static void main(String[] args) {

        exceptionhandeling obj = new exceptionhandeling();
        obj.learnthrow();
        System.out.println("--------------");
     
    }
}