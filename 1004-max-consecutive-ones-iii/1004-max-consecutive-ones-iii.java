class Solution {
    public int longestOnes(int[] nums, int k) {
       int maxl=0;int c=0;int l=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            c++;

        }
        while(c>k){
           if(nums[l]==0){
c--;
           } 
           l++;
        }
       
       maxl=Math.max(maxl,i-l+1);
       }
       return maxl;
    }
}