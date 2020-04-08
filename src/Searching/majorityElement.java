package Searching;

import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int[] x = {3,1,3,3,2};
        int n = x.length;
        int majorityElement = n/2;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<n;i++){
            if (hashMap.containsKey(x[i])) {
                int temp = hashMap.get(x[i]) + 1;
                hashMap.put(x[i], temp);
            }
            else
                hashMap.put(x[i],1);
        }
        for (Integer value:hashMap.keySet()) {
            if (majorityElement<=hashMap.get(value))
                System.out.println(value);
        }
    }
}
