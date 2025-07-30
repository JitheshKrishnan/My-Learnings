
public class Array_2D {
    
    public static void main(String a[]){
        int nums[][] = new int[3][4]; // Normal 2D Array

        int j_nums[][] = new int[3][]; // Jagged Array
        j_nums[0] = new int[3];
        j_nums[1] = new int[4];
        j_nums[2] = new int[2];

        int nums_3D[][][] = new int[3][4][5]; // #D Array

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int n[]: nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Jagged Array:");

        System.out.println();

        for(int i=0;i<j_nums.length;i++){
            for(int j=0;j<j_nums[i].length;j++){
                j_nums[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0;i<j_nums.length;i++){
            for(int j=0;j<j_nums[i].length;j++){
                System.out.print(j_nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int n[]: j_nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
