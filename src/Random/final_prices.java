package Random;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class final_prices {
    private static int[] x;
    public static void main(String[] args) {
        int[] prices = {8,7,4,2,8,1,7,7,10,1};
//        finalPrices(prices);
        test(prices);
        print();
    }

    private static void print() {
        System.out.println(x[0]);
    }

    private static void test(int[] prices) {
        x = prices;
        x[0] = 456;
    }

    public static int[] finalPrices(int[] prices) {
        int n = prices.length;
        int i=0,j=1;
        while(j!=n) {
            j = i + 1;
            if (prices[i] >= prices[j] && j > i) {
                prices[i] = prices[i] - prices[j];
                i++;
            } else {
                j++;
            }
        }
        return prices;

    }
}
