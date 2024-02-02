class A{
    public void show()
    {
        System.out.println("in show A");
    }
    public void confg()
    {
        System.out.println("in congif A");
    }
}

class B extends A{
    public void show()
    {
        System.out.println("in show B");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); // B Object will call show() of it self by overridding the A
    }
}
