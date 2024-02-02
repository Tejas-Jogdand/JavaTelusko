class Human 
{
    private int age = 11;
    private String name ="Tejas";
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // private variables are accessible by methods


}

public class Encapsulation {
    public static void main(String[] args) {

        Human obj = new Human();
        // obj.age = 11;
        // obj.name = "Navin";

        obj.setAge(19);
        obj.setName("Raj");

        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}

