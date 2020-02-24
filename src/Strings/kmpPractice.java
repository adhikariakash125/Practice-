package Strings;

public class kmpPractice {
    public static void main(String[] args) {
        String str = "abceabcdabceabcd";
        String pattern = "gfgfg";
        kmpPractice kmpPractice = new kmpPractice();
        System.out.println(kmpPractice.checkPattern(str.toCharArray(), pattern.toCharArray()));
    }

    private boolean checkPattern(char[] str, char[] pattern) {
        int[] lps = generateLps(pattern);
        int i=0;
        int j=0;
        while (i<str.length &&  j<pattern.length){
            if (str[i]==pattern[j]){
                i++;
                j++;
            }else {
                if (j!=0)
                    j = lps[j-1];
                else
                    i++;
            }
        }
        if (j==pattern.length)
            return true;
        else
            return false;
    }

    private int[] generateLps(char[] pattern) {
        int[] lps = new int[pattern.length];
        int index = 0;
        for (int i = 1; i < pattern.length; ) {
            if (pattern[i] == pattern[index]) {
                lps[i] = index + 1;
                i++;
                index++;
            } else {
                if (index != 0)
                    index = lps[index - 1];
                else
                    i++;
            }
        }
        return lps;
    }
}

