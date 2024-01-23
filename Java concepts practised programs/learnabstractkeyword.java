abstract class car{
    public abstract void drive();

    public void playmusic(){
    System.out.println("Play music");
    }
}
class wagonr extends car{
    public void drive()
    {
        System.out.println("Drive my car");
    }
}
public class learnabstractkeyword{
public static void main(String a[])
{
    car obj = new car();
    obj.drive();
}
}
