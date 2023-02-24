import java.util.Scanner;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// https://leetcode.com/problems/two-sum/   link
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

        int[] ans = new int[2];
        if(nums.length==2){
            ans[0]=0;
            ans[1]=1;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
                if(nums[i] + nums[j] == target)
                {
                    ans[0]=i;
                    ans[1]=j;
                }
        }
        System.out.println("Index Position: ");
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
