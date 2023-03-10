//169. Majority Element
//        Easy
//        13.9K
//        432
//        Companies
//        Given an array nums of size n, return the majority element.
//
//        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//
//
//        Example 1:
//
//        Input: nums = [3,2,3]
//        Output: 3
//        Example 2:
//
//        Input: nums = [2,2,1,1,1,2,2]
//        Output: 2
//
//
//        Constraints:
//
//        n == nums.length
//        1 <= n <= 5 * 104
//        -109 <= nums[i] <= 109
//
//
//        Follow-up: Could you solve the problem in linear time and in O(1) space?
// link  https://leetcode.com/problems/majority-element/description/
import java.util.Arrays;
import java.util.Scanner;

public class MajorityElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter LEngth : ");
        int k = sc.nextInt();
        int[] arr = new int[k];
        System.out.println("Enter Elemenets : ");
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}
