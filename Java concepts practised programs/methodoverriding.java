class a 
{
	public void show()
	{
		System.out.print("Show A");
	}

}
class b extends a
{
	public void show()
	{
		System.out.print("Show B");
	}

}
public class methodoverriding {

    public static void main(String a[])
    {
        b obj = new b();
        obj.show();
    }

}
