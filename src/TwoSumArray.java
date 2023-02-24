import java.util.Scanner;

public class TwoSumArray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Target : ");
        int target = sc.nextInt();
        System.out.println("size of array");
        int n = sc.nextInt();
        System.out.println("Enter Array : ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        twoSum(nums,target);

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        if(nums.length==2){
            ans[0]=0;
            ans[1]=1;
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
                if(nums[i] + nums[j] == target)
                {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
        }

        return ans;
    }
}