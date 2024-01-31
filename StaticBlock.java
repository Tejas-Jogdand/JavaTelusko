class Mobile {
    String brand;
    int price;
    static String name; //shares memory commonly, it belongs to class not object

    Mobile()
    {
        brand = "";
        price = 90000;
    }

    static
    {
    name = "Phone";  // static block is called only once and static variables are initiallized here
    // static block is only called when class is loaded to classloader
    System.out.println("In static block");
    }

    public void show()
    {
        System.out.println(brand+" : "+price+" : "+name );
    }
}

public class StaticBlock {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile");
        
        // Mobile obj1 = new Mobile();

        // obj1.brand = "apple";
        // obj1.price = 120000;

        // obj1.show();

        // Mobile obj2 = new Mobile();

        // obj2.brand = "apple";
        // obj2.price = 120000;
        // Mobile.name = "SmartPhone"; 

        // obj2.show();
        
    }
    
}
