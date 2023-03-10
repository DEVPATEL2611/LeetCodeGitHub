import java.util.ArrayList;
import java.util.Scanner;

//349. Intersection of Two Arrays
//        Easy
//        4.4K
//        2.1K
//        Companies
//        Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
//
//
//
//        Example 1:
//
//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//        Output: [2]
//        Example 2:
//
//        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        Output: [9,4]
//        Explanation: [4,9] is also accepted.
//
//
//        Constraints:
//
//        1 <= nums1.length, nums2.length <= 1000
//        0 <= nums1[i], nums2[i] <= 1000
// link    https://leetcode.com/problems/intersection-of-two-arrays/description/
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter LEngth : ");
        int k = sc.nextInt();
        int[] arr = new int[k];
        System.out.println("Enter Elemenets : ");
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter LEngth : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter Elemenets : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
       int[] ans = intersection(arr,arr1);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for(int i=0;i<nums1.length;i++){
            if(!list1.contains(nums1[i])){
                list1.add(nums1[i]);
            }
        }
        for(int j=0;j<nums2.length;j++){
            if(!list2.contains(nums2[j])){
                list2.add(nums2[j]);
            }

            if(list1.contains(nums2[j]) && !list.contains(nums2[j]))
            {
                list.add(nums2[j]);
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}
