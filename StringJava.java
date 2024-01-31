public class StringJava {
    public static void main(String[] args) {
        String name = new String("Navin");
        // String name = "Navin";

        System.out.println("Hello "+name);

        name = name + " Reddy"; 
        //will create new object, referece will be changed of name. Since, Strings are immutable.
        System.out.println("Hello "+name);

        String s1 = "navin";
        String s2 = "navin";

        System.out.println(s1==s2);

    }
}
