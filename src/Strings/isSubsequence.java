package Strings;

//Given a string s and a string t, check if s is subsequence of t.
//A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of
// the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).


public class isSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int i = 0, j = 0, count = 0;
        int n = a.length;
        int m = b.length;
        while (i != n && j != m) {
            if (a[i] == b[j]) {
                count++;
                i++;
                j++;
            } else
                j++;
        }
        if (count == n)
            return true;
        else
            return false;
    }
}   
