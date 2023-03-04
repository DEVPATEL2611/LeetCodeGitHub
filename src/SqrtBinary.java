import java.util.Scanner;

public class SqrtBinary {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number : ");
            int x = sc.nextInt();
            System.out.println(mySqrt(x));
        }
        public static int mySqrt(int x) {
            if(x==0) return 0;
            int low = 1,high = x,ans =0;
            while(low<=high){
                int mid =low + (high-low)/2;
                if(x/mid==mid)  return mid;
                else if(x/mid<mid)   high=mid-1;
                else {low = mid+1; ans = mid;}
            }
            return ans;
        }

}
