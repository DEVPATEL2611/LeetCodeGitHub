import java.util.Scanner;
//Given a string, remove spaces from it.
//
//        Example 1:
//
//        Input:
//        S = "geeks  for geeks"
//        Output: geeksforgeeks
//        Explanation: All the spaces have been
//        removed.
public class RemoveSpaceString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.next();
        System.out.println(toLower(s));
    }

    public static String toLower(String S) {
        return S.replaceAll("\\s","");
    }

}
