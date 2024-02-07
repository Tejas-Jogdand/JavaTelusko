class A
{
    int age;

    public void show()
    {
        System.out.println("in A show out");
    }

    class B
    {
        public void config()
        {
            System.out.println("In config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        
        A obj = new A();

        obj.show();

        // A.B obj1 = new A.B(); // this can be used for static inner class
        A.B obj1 = obj.new B();
        obj1.config();

    }

}
