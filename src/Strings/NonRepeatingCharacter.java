package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbdbc";
        char[] strArray = str.toCharArray();
        System.out.println(NoCharacter(strArray));

    }

    private static Character NoCharacter(char[] strArray) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (char x : strArray){
            if (map.containsKey(x)){
                Integer temp = map.get(x);
                map.put(x,temp+1);
            }else {
                map.put(x,1);
            }
        }
        for (char x : map.keySet()){
            if (map.get(x)==1){
                return x;
            }
        }return null;
    }
}
