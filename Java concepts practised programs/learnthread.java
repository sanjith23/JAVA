import java.util.Scanner;

class a extends Thread
{
    public void run(){
        for (int i = 0; i < 10; i++) {
             System.out.println("class aaaaaa");
             try{
                Thread.sleep(100);
             }catch(InterruptedException e){e.printStackTrace();}
        }
       
    }
}

class b extends Thread
{
    public void run(){
         for (int i = 0; i < 10; i++) {
             System.out.println("class bbbbb");
              try{
                Thread.sleep(100);
             }catch(InterruptedException e){e.printStackTrace();}
        }
    }
}
public class learnthread {

    public static void main(String[] args) {

        a obj1 = new a();
        b obj2 = new b();

        Scanner sc = new Scanner(System.in);
Boolean a = sc.nextBoolean();
        System.out.println(a+ " ---------this is num");

       // System.out.println(obj2.getPriority());

        // obj1.start();
        // obj2.start();
        
    }
}