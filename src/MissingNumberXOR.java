import java.util.Scanner;

public class MissingNumberXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter LEngth : ");
        int k = sc.nextInt();
        int[] arr = new int[k];
        System.out.println("Enter Elemenets : ");
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int res = 0;
        for(int i=1;i<=nums.length;i++){
            res = res ^ i;
        }
        for(int i=0;i<nums.length;i++){
            res = res ^ nums[i];
        }

        return res;

    }
}
