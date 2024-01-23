class A{
    public void show(){
        System.out.println("Show A");
    }
}
class B extends A{
    public void show(){
        System.out.println("Show B");
    }
}

class C extends B{
    public void show(){
        System.out.println("Show C");
    }
}
public class polymorphisim {

    public static void main(String a[])
    {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}