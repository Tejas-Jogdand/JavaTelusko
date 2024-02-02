class A extends Object
{
    A()
    {
        super(); // even if u dont mention it is thier used to call constructor of parent class
        System.out.println("In A");
    }
    A(int n)
    {
        super(); // even if u dont mention it is thier
        System.out.println("In Big A");
    }
}

class B extends A
{
    B()
    {
        super(); // even if u dont mention it is thier
        System.out.println("In B");
    }
    B(int n)
    {
        // this(); // calls the constructor of own class
        super(n); // call the parametric counstructor of supper class
        System.out.println("In Big B");
    }
}

public class ThisSup {
    public static void main(String[] args) {
        B obj = new B(5);

    }
}
