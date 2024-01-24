public class Array {
    public static void main(String[] args) {
        // int nums[] = {1,2,3,4,5};
        // int nums[] = new int[5];
        
        // nums[0]=1;
        // nums[1]=2;
        // nums[2]=3;
        // nums[3]=4;
        // nums[4]=5;

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.print(nums[i]+" ");
        // }

        int nums[][] = new int[2][3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println("");
        }

    }
}
