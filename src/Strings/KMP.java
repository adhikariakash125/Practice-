package Strings;

public class KMP {
    public static void main(String[] args) {
        String str = "abcxabcdabcdabcy";
        String pattern = "abcdabcy";
        KMP kmp = new KMP();
        int[] patternArray = kmp.computeTemporaryArray(pattern);
        findPattern(str.toCharArray(),patternArray,pattern.toCharArray());
    }

    private static void findPattern(char[] toCharArray, int[] patternArray, char[] chars) {
            int i = 0;
            int j = 0;
            while (i<toCharArray.length && j<chars.length){
                if (toCharArray[i]==chars[j]){
                    i++;
                    j++;
                }else {
                    if (j!=0){
                        j = patternArray[j-1];
                    }else {
                        i++;
                    }
                }
            }
            if (j == patternArray.length){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
    }

    private int[] computeTemporaryArray(String pattern) {
        char[] patternArray = pattern.toCharArray();
        int[] lps = new int[pattern.length()];
        int index = 0;
        for (int i = 1; i < patternArray.length; ) {
            if (patternArray[i] == patternArray[index]) {
                lps[i] = index + 1;
                index++;
                i++;
            } else {
                if (index != 0)
                    index = lps[index - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
