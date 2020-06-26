package Array;
//Queue Reconstruction by Height
//
//        Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.
//
//        Note:
//        The number of people is less than 1,100.

import java.util.*;

public class QueueReconstructionByHeight {
    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}})));
        test();
    }
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                if (ints[0]!=t1[0])
                    return t1[0] - ints[0];
                else
                    return ints[1] - t1[1];
            }
        });
        List<int[]> list = new ArrayList<>();
        for (int[] x : people){
            list.add(x[1],x);
        }
        return list.toArray(new int[people.length][2]);
    }

    public static void test(){
        List<int[]> list = new ArrayList<>();
        list.add(0,new int[]{1,2});
        list.add(1,new int[]{2,3});
        list.add(0,new int[]{8,9});
//        System.out.println(Arrays.deepToString(list.toArray(new int[3][2])));

//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        System.out.println(set.toArray(new int[3][3]));
    }
}
