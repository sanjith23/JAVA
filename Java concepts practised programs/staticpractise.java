class mobile{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " " + price + " " +  name);
    }
}

public class staticpractise
{
    public static void main(String a[])
    {
        mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;

        mobile obj2 = new mobile();
        obj2.brand = "Samsung";
        obj2.price = 1300;

        mobile.name = "mobile series name1112";

        obj1.show();
        obj2.show();
    }
}