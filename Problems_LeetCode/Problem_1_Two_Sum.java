package Problems_LeetCode;

public class Problem_1_Two_Sums {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int soma = nums[i]+nums[j];
                if(soma==target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
}
