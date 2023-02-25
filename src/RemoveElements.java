import java.util.Scanner;

public class RemoveElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Value : ");
        int val = sc.nextInt();
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        int index = removeElement(nums, val);
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + " ");
        }
    }
        public static int removeElement(int[] nums,int val) {
            int index=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[index++]=nums[i];
                }
            }
            return index;
        }

}
