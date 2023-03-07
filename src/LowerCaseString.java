import java.util.Scanner;

//Given a string S. The task is to convert characters of string to lowercase.
//
//        Example 1:
//
//        Input: S = "ABCddE"
//        Output: "abcdde"
//        Explanation: A, B, C and E are converted to
//        a, b, c and E thus all uppercase characters
//        of the string converted to lowercase letter.
public class LowerCaseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.next();
        System.out.println(toLower(s));
    }

    public static String toLower(String S) {
        return S.toLowerCase();
    }

}
