public class StringBufferJava {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        //String buffer provides mutable strings along with inbuilt methods.

        sb.append(" Reddy");
        System.out.println(sb);

        sb.insert(6, "Java");
        sb.substring(4,8);
        sb.capacity(); // +16 bit always in StringBuffer.

        String str = sb.toString(); //converts StringBuffer to String
    }
}
