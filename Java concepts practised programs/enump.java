
  enum Status{
        Running, failed, pending, success;
    }
    
public class enump {

    public static void main(String[] args) {
        
            // Status s = Status.escape;
            // System.out.println(s.ordinal());

        // Status[] ss = Status.values();

        // for(Status s : ss)
        // {
        //     System.out.println(s + " : " + s.ordinal());
        // }

        Status s = Status.Running;

        if(s == Status.failed)
         System.out.println("Try again");
        else if(s == Status.pending)
         System.out.println("Please wait");
        else if(s == Status.Running)
         System.out.println("Done");
         else if(s == Status.success)
          System.out.println("All good");
         
    }
  
}