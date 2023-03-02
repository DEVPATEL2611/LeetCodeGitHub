//Given a string s, reverse only all the vowels in the string and return it.
//
//        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//
//        Example 1:
//
//        Input: s = "hello"
//        Output: "holle"
//        Example 2:
//
//        Input: s = "leetcode"
//        Output: "leotcede"
//
//
//        Constraints:
//
//        1 <= s.length <= 3 * 105
//        s consist of printable ASCII characters.
// link https://leetcode.com/problems/reverse-vowels-of-a-string/description/
import java.util.Scanner;

public class ReverseVowelString {

    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        String ans = reverseVowel(s);

        System.out.println(ans);
    }

    public static String reverseVowel(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] ch = s.toCharArray();
        while (i < j) {
            if ((ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
                    || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
                    &&
                    (ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u' || ch[j] == 'A'
                            || ch[j] == 'E' || ch[j] == 'I' || ch[j] == 'O' || ch[j] == 'U')) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            } else if (!(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
                    ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')) {
                i++;
            } else if (!(ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u' ||
                    ch[j] == 'A' || ch[j] == 'E' || ch[j] == 'I' || ch[j] == 'O' || ch[j] == 'U')) {
                j--;
            }
        }
        return new String(ch);
    }
}
