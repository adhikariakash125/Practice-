package Random;
//Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
//
//        Example:
//
//        Input: s = 7, nums = [2,3,1,2,4,3]
//        Output: 2
//        Explanation: the subarray [4,3] has the minimal length under the problem constraint.
public class minimumSizeSubarray {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }

    public static int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        int min = 100;
        if(n==0)
            return 0;
        for(int i=0;i<n-1;i++){
            int j = i + 1;
            if(nums[j]==s || nums[i]==s)
                return 1;
            int sum = nums[i];
            while(j<n && sum<s){
                sum += nums[j++];
            }
            if(sum>=s)
                min = Math.min(min,j-i);
        }
        return min;
    }
}
