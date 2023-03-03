import java.util.Scanner;

public class PlusOne {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter LEngth : ");
        int k = sc.nextInt();
        int[] arr = new int[k];
        System.out.println("Enter Elemenets : ");
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = plusOne(arr);
        for (int an : ans) {
            System.out.print(an + " ");
        }

    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[len+1];
        ans[0] = 1;
        return ans;
    }
}