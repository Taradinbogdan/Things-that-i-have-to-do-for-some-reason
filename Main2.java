import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //subject 1, ну типа первое упражнение, мне на русском в программах не удобно писать
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int x = nums[0];
        int x2 = nums[0];
        int y = 0;
        while(y != nums.length){
            if(nums[y] == 1){
                nums[y] = 0;
            }else if(nums[y] == 0){
                nums[y] = 1;
            }
            y += 1;
        }
        System.out.println(Arrays.toString(nums));
        //subject 2
        Scanner scanner = new Scanner(System.in);
        int[] nums2 = new int[8];
        System.out.println("Insert {0, 3, 6, 9, 12, 15, 18, 21}");
        for (int q = 0; q < nums2.length; q++) {
            nums2[q] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums2));
        //subject 3
        int[] nums3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int w = 0; w < nums3.length; w++) {
            if (nums3[w] < 6){
                nums3[w] = nums3[w] * 2;
            }
        }
        System.out.println(Arrays.toString(nums3));
        //subject 4
        int[][] nums4 = new int[5][5];
        for (int e = 0; e < nums4.length; e++) {
            nums4[e][e] = 1;
        }
        for (int[] strings : nums4) {
            System.out.println(Arrays.toString(strings));
        }
        //subject 5
        int[] nums5 = {45, 1, 8, 2, 21, 4, 1, 18, 7, 3};
        int u = 0;
        int i = nums5[0];
        for (int t = 0; t < nums5.length; t++) {
            if (nums5[t] > u) {
                u = nums5[t];
            }
            if (nums5[t] < i) {
                i = nums5[t];
            }
        }
        System.out.println("min="+ i);
        System.out.println("max="+ u);
        //subject 6
        int[] nums6 = {1, 1, 1, 2, 1,};
        int d = 0;
        int f = 0;
        boolean ansver = false;
        for(int a = 0; a < nums6.length - 1; a++) {
            f = f + nums6[a];
            for (int s = a + 1; s < nums6.length; s++) {
                d += nums6[s];
            }
            if (d == f) {
                ansver = true;
            }
            d = 0;
        }
        System.out.println(ansver);
        // subject 7
        System.out.println("Insert length");
        int g = scanner.nextInt();
        int[] nums7 = new int[g];
        System.out.println("Insert numbers");
        for (int h = 0; h < g; h++) {
            nums7[h] = scanner.nextInt();
        }
        System.out.println("Insert the gap");
        int j = scanner.nextInt();
        int[] nums8 = new int[g + j];
        System.arraycopy (nums7, 0, nums8, j, g);
        System.out.println(Arrays.toString(nums8));
    }
}