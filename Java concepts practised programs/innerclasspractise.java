class A{
   int age;
   
   public void show()
   {
    static int i=10;
    System.out.println("in show");
   }
   static class B
   {
    public void config()
    {
        System.out.println("in config");
    }
   }
}

public class innerclasspractise {
public static void main(String args[]){
    A obj = new A();
    obj.show();

    A.B obj1 = new A.B();
    obj1.config();

}
    
}
