class cal
{
    int num=4;
    
    public int sum(){
        return num+5;
    }

}

public class demo
{
    public static void main(String arg[])
    {
        cal obj = new cal();
        int r = obj.sum();
        System.out.println(r);
        System.out.println(obj.num);

        // cal obj1 = new cal();
        // obj1.num = 5;
        // r = obj1.sum();
        // System.out.println(r);

        // int arr[] = new int[5];

        // System.out.println(arr.length);
    }
}   