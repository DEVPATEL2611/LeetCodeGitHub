//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//        You must implement a solution with a linear runtime complexity and use only constant extra space.
//        Example 1:
//        Input: nums = [2,2,1]
//        Output: 1
//        Example 2:
//        Input: nums = [4,1,2,1,2]
//        Output: 4
//        Example 3:
//        Input: nums = [1]
//        Output: 1
//        Constraints:
//
//        1 <= nums.length <= 3 * 104
//        -3 * 104 <= nums[i] <= 3 * 104
//        Each element in the array appears twice except for one element which appears only once.
// lik https://leetcode.com/problems/single-number/description/
import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        int index = singleNumber(nums);
        System.out.println(index);

    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        //int ans = nums[0];
        for(int i=0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i+1])
            {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
