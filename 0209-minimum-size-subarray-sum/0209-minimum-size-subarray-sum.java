class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minl= Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                minl=Math.min(minl,i-left+1);
                sum-=nums[left];
                left++;
            }
           
            }
             if(minl== Integer.MAX_VALUE){
            return 0;
        }
        return minl;
    }
}