package Random;

import java.util.*;

class Test {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;
        Set<Integer> set = new HashSet<>();
        set.add(1);
        List<Integer> list = new ArrayList<>();
        for (Integer x : nums)
            list.add(x);
        for (Integer x : nums)
            if (!list.contains(x))
                nums[j++] = x;
        return j;
    }

    public static boolean exist(char[][] board, String word) {
        int n = board.length;
        char[] wordarr = word.toCharArray();
        int[] arr = new int[26];
        int[] arrw = new int[26];
        for (char[] x : board) {
            for (char y : x) {
                arr[y - 'A']+=1;
            }
        }

        for (int i = 0; i < wordarr.length; i++)
            arrw[wordarr[i] - 'A']+=1;

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arrw));

        for (int i = 0; i < 26; i++)
            if (!(arr[i] >= arrw[i]))
                return false;
        return true;
    }


    public static void main(String[] args) {
//        System.out.println(exist(new char[][]{
//                {'A', 'B', 'C', 'E'},
//                {'S', 'F', 'C', 'S'},
//                {'A', 'D', 'E', 'E'}
//        }, "SEE"));

//        System.out.println(test("ABC", "BCA"));
        System.out.println(charAt(0));
    }

    private static char charAt(int i) {
        Map<Integer,Integer> map = new HashMap<>();
        return (char) (i+97);
    }

    private static boolean test(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.toString(a).equals(Arrays.toString(b)))
            return true;
        return false;    }
}