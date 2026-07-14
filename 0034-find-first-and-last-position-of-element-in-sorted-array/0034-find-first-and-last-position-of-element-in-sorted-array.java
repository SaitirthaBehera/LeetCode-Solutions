class Solution {
    public int[] searchRange(int[] nums, int target) {
        int last=-1;
        int first=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                last=i;
                if(first==-1){
                    first=i;
                }
            }
        }
        int[] ans={first,last};
        return ans;
        
        
    }
}