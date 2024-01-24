class cal
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
    public double add(double n1, double n2)
    {
        return n1+n2;
    }
}

public class MethodOverloading {

    public static void main(String[] args)
    {
        cal obj = new cal();

        int r = obj.add(3,4, 4);
        System.out.println(r);
    }
}
