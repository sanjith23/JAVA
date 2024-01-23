class a{
    int i;

     a(){
        System.out.println("Print constructor");
    }

    public void c(){
        a obj = new a();
        obj.i = 10;
        System.out.println(obj.i);
    }

    public void show(){
        System.out.println("Show this");
    }
}

public class constructor {

    public static void main(String a[])
    {
        a obj = new a();
        obj.show();
        obj.c();
        
    }
}