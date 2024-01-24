public class loops {
    public static void main(String[] args) {
        int i = 0;

        // while(true)
        // {
        //     System.out.println("hello world");
        //     if(i>9)
        //         break;
        //     i++;
        // }

        // do
        // {
        //     System.out.println("Hi");
        //     i++;
        // }while(i<5);

        // for ( i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }

        for ( i = 0; i < 5; i++) {
            System.out.println("Day "+(i+1));
            for (int j = 0; j < 9; j++) {
                System.out.println("  "+(j+9)+"-"+(j+10));
            }
        }


    }
}
