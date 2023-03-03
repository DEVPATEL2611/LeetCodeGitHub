import java.util.Arrays;
import java.util.Scanner;

public class MergeSortArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array 1 size : ");
        int m = sc.nextInt();
        System.out.println("Enter Array 2 size : ");
        int n = sc.nextInt();
        int[] arr1 = new int[m+n];
        int[] arr2 = new int[n];
        System.out.println("Enter Array 1 Elements");
        for(int i=0;i<m;i++){
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter Array 2 Elements");
        for(int i=0;i<n;i++){
            arr2[i]= sc.nextInt();
        }
        merge(arr1,m,arr2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=nums1.length-n;i<m+n;i++){
            nums1[i] = nums2[k];
            k++;
        }
        Arrays.sort(nums1);
        for (int j : nums1) {
            System.out.print(j + " ");
        }
    }
}
