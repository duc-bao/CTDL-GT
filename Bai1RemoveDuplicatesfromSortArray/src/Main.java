import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int nums[] = {0,2,2,5,5,6,6};
        int length = removeDuplicate(nums);
        System.out.println(length);
    }

//    private static int removeDuplicate(int[] nums) {
//        Set<Integer> uniqueSet = new HashSet<>();
//        for (int num : nums){
//            uniqueSet.add(num);
//        }
//        int i = 0;
//        for(int num : uniqueSet){
//            nums[i++] = num;
//        }
//
//        return uniqueSet.size();
//    }
    private static int removeDuplicate(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[i] = nums[j];
                j++;
            }
        }
        return  j;
    }
}
