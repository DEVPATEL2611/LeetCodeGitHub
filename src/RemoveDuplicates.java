import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();

        }
        int index = removeDuplicates(nums);
        for(int i=0;i<index;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[index++]=nums[i+1];
            }
        }

        return index;
    }
}
