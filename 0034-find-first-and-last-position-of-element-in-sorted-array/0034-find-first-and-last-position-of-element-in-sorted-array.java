class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] ans = {-1,-1};

       int start = search(nums,target,true);
       int end = search(nums,target,false);
       ans[0] = start;
       ans[1] = end;

       return ans;
    }

    public int search(int[] nums , int target, boolean FindFirstIndex){
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;
        
        while(s<= e){
            int mid = s + (e - s)/2;
            if(nums[mid] == target){
                ans = mid;
                if(FindFirstIndex){
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
            else if(nums[mid] < target){
                s = mid + 1;
            }
            else if(nums[mid] > target){
                e = mid - 1;
            }
        }

        return ans;
    }
}