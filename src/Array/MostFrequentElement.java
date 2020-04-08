package Array;

import java.util.HashMap;

class MostFrequentElement {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 1, 2, 2};
        HashMap<Integer,Integer> map = new HashMap<>();
        Integer majority = 0 ,majorityElement = 0;
        for (int i = 0; i < x.length; i++) {
            if (map.containsKey(x[i])) {
                Integer temp = map.get(x[i])+1;
                map.put(x[i],temp);
            }else {
                map.put(x[i],1);
            }
            if (map.get(x[i])>majority)
                majority = map.get(x[i]);
                majorityElement = x[i];
        }
        System.out.println(majorityElement);
    }
}
