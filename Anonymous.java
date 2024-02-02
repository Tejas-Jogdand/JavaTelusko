class A
{
    public A()
    {
        System.out.println("obj created");
    }
    public void show()
    {
        System.out.println("in A Show");
    }
}


public class Anonymous
{   
    public static void main(String[] args)
    {
        // int mark; // just like this 
        // mark = 9;

        new A(); // this is called anonymous object, can be used only once
        new A().show(); // this will agian create new object

    }
}
