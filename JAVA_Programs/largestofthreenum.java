package programs;

public class largestofthreenum {

    public static void main(String[] args) {

    int a=10,b=33,c=99;

    System.out.println("The three numbers are: " + a + " " + b + " " + c );

    if(a>b)
    {
        if(a>c)
       { 
        System.out.println("The largest number is: " + a);
        } 
        else
        {
        System.out.println("The largest number is: "+c);
        } 
    }
    else
    if(b>c)
    {
        System.out.println("The largest number is: "+b);
    }
    else
    {
         System.out.println("The largest number is: "+c);
    }
    
}
    
}
