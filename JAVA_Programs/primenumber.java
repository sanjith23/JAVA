package programs;

public class primenumber {
    public static void main(String[] args) {
        int n=5;
        if (n <= 1) 
            System.out.println("Not prime");
  
        
        for (int i = 2; i < n; i++) 
            {
                if (n % i == 0) 
               System.out.println("not Prime"); 
             

            }
  
    }
}
