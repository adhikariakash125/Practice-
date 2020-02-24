package Strings;

public class positionOfSubstring {
    public static void main(String[] args) {
        String text = "GeeksForGeeks";
        String pattern = "For";
        positionOfSubstring position = new positionOfSubstring();
        System.out.println(position.getPosition(text.toCharArray(), pattern.toCharArray()));
    }

    private int getPosition(char[] text, char[] pattern) {
        int[] lps = getTemporarayArray(pattern);
        int i = 0;
        int j = 0;
        while (i < text.length && j < pattern.length) {
            if (text[i] == pattern[j]) {
                i++;
                j++;
            } else {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
        if (j == pattern.length)
            return i-pattern.length;
        else
            return -1;
    }

    private int[] getTemporarayArray(char[] pattern) {
        int index = 0;
        int[] lps = new int[pattern.length];
        for (int i = 1; i < pattern.length; ) {
            if (pattern[i] == pattern[index]) {
                lps[index] = index + 1;
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
