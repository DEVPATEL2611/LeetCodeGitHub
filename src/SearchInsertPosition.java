//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//        You must write an algorithm with O(log n) runtime complexity.
//
//
//
//        Example 1:
//
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2
//        Example 2:
//
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1
//        Example 3:
//
//        Input: nums = [1,3,5,6], target = 7
//        Output: 4
//
//
//        Constraints:
//
//        1 <= nums.length <= 104
//        -104 <= nums[i] <= 104
//        nums contains distinct values sorted in ascending order.
// https://leetcode.com/problems/search-insert-position/description/
import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Target : ");
        int target = sc.nextInt();
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        int index = searchInsert(nums, target);
        System.out.println(index);
    }
    public static int searchInsert(int[] nums, int target) {
        int ans=nums.length;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>target){
                return i;
            }
        }

        return ans;
    }
}
