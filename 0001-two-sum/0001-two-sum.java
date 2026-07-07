class Solution {
    public int[] twoSum(int[] nums, int target) {
    for(int s = 0; s< nums.length ; s++){
        for(int e = s + 1; e< nums.length; e++){
            if( nums[e]+nums[s] == target ){
                return new int[] {s,e};
            }
        }
    }
    return new int[]{};
    }
}