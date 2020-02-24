package Random;

import java.util.HashMap;
import java.util.HashSet;

public class SumOFMaxFreq {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] x = {3, 3, 3, 4, 1, 1, 6, 1};
        int k = 2;
        for (int i = 0; i < x.length; i++) {
            if (!hashMap.containsKey(x[i])) {
                hashMap.put(x[i], 1);
            } else {
                int n = hashMap.get(x[i]);
                hashMap.put(x[i], hashMap.get(x[i]) + 1);
            }
        }
        int result = 0;
        int counter = 0;
        for (Integer i : hashMap.keySet()) {
            if (counter != k && hashMap.get(i) > 1) {
                result = result + hashMap.get(i);
                counter++;
            }
        }
        System.out.println(result);
    }
}
