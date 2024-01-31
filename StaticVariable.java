class Mobile {
    String brand;
    int price;
    static String name; //shares memory commonly, it belongs to class not object

    public void show()
    {
        System.out.println(brand+" : "+price+" : "+name );
    }
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand+" : "+obj.price+" : "+" : "+name); 
        // can not access non static variales in static methods directly.
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();

        obj1.brand = "apple";
        obj1.price = 120000;
        Mobile.name = "SmartPhone"; // Static variable shd be called with class name.

        Mobile obj2 = new Mobile();

        obj2.brand = "samsung";
        obj2.price = 100000;
        Mobile.name = "Phone"; // it will be changed everywhere since memory is shared commonly.

        obj1.show();
        // obj2.show();

        Mobile.show1(obj2);
    }
}
