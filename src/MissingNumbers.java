import java.util.Scanner;

public class MissingNumbers {

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
        int rangeSum = 0 , numbersSum = 0;
        for(int i=0;i<nums.length;i++){
            rangeSum+=i;
            numbersSum+=nums[i];
        }

        return (rangeSum + nums.length) - numbersSum;

    }
}
