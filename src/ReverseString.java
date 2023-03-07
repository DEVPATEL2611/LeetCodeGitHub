
//You are given a string s. You need to reverse the string.
//
//        Example 1:
//
//        Input:
//        s = Geeks
//        Output: skeeG
//        Example 2:
//
//        Input:
//        s = for
//        Output: rof
//        Your Task:
//
//        You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.
//
//        Expected Time Complexity: O(|S|).
//        Expected Auxiliary Space: O(1).
//
//        Constraints:
//        1 <= |s| <= 10000
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.next();
        System.out.println(reverseWord(s));
    }
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char[] ch = str.toCharArray();
        int i=0;
        int j = str.length()-1;
        while(i<=j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}
