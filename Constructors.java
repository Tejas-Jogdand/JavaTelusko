class Human{
    private int age;
    private String name;

    Human()
    {
        age = 10;
        name = "Tejas";
    }

    Human(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    
}

public class Constructors {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj2 = new Human(20, "Raj");
        System.out.println(obj.getName()+" : "+obj.getAge());
        System.out.println(obj2.getName()+" : "+obj2.getAge());
    }
}

