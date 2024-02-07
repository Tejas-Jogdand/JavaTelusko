class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class UpcastingDowncasting
{
    public static void main(String[] args)
    {
        // double num =3.5;
        // int i = (int)num;

        A obj = new B(); //upcasting
        obj.show1();;

        ((B) obj).show2(); //downcasting
    }
}

