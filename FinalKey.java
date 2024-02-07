class MyClass
{
    final public void credit()
    {
        System.out.println("Made by Tejas");
    }

    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}

class OtherClass extends MyClass
{
    // public void credit()
    // {
    //     System.out.println("Made by Vishal");
    // }
    // will thorw error, cant override final method

}


public class FinalKey {
    public static void main(String[] args) {
        final double pi = 3;

        // pi = 3.24; // cant change

        OtherClass obj = new OtherClass();

        System.out.println("Addition of 3,5 : "+obj.add(3,5));
        obj.credit();
    }
}
