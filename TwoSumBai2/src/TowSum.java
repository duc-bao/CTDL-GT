//Given an array of integers nums and an integer target,return indices of the two numbers such that they add up to target.
//
//  You may assume that each input would have exactly one solution,and you may not use the same element twice.
//
// You can return the answer in any order.

import java.util.HashMap;
import java.util.Map;

public class TowSum {
    public static void main(String[] args) {
        int nums[] = {1,7,5,6,8,9};
        int target = 10;
        int sum[] = towSum(nums, target);
        if (sum.length == 2) {
            System.out.println("[" + sum[0] + ", " + sum[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }

    private static int[] towSum(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(sum.containsKey(target - nums[i])){
                return new int[]{sum.get(target-nums[i]), i};
            }
            sum.put(nums[i], i);
        }
        return new int[]{};
    }
}
