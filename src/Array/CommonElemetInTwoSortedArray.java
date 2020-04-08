package Array;

import java.util.HashMap;

public class CommonElemetInTwoSortedArray {
    public static void main(String[] args) {
//        int[] array1A = {1, 3, 4, 6, 7, 9};
//        int[] array2A = {1, 2, 4, 5, 9, 10};

        int[] array1A = {1, 2, 9, 10, 11, 12};
        int[] array2A = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};

        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer value1 : array1A)
            map.put(value1,1);

        for (Integer value : array2A){
            if (map.containsKey(value)){
                Integer temp = map.get(value)  + 1;
                map.put(value,temp);
            }else {
                map.put(value,1);
            }
        }

        for (Integer x : map.keySet()){
            if (map.get(x)>1)
                System.out.println(x);
        }
    }
}
