package Array;

public class OneAwayStrings {
    public static void main(String[] args) {
        String strA = "abde";
        String strB = "abcde";
        System.out.println(compareBothString(strA.toCharArray(), strB.toCharArray()));
    }

    private static boolean compareBothString(char[] stringA, char[] stringB) {
        if (stringA.length - stringB.length >= 2 || stringB.length - stringA.length >= 2)
            return false;
        else if (stringA.length == stringB.length)
            return OneAway(stringA, stringB);
        else if (stringA.length > stringB.length)
            return OneAway(stringA, stringB);
        else
            return OneAway(stringB, stringA);
    }

    private static boolean OneAway(char[] stringA, char[] stringB) {
        int countDifference = 0;
        for (int i=0;i<stringB.length;i++){
            if (stringA[i]!=stringB[i]){
                countDifference++;
            }if (countDifference>1)
                return false;
        }return true;
    }
}
