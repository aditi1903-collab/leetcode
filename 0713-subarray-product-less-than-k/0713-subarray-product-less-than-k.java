class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
       int p=1;
       int l=0;
       int c=0;
       for(int i=0;i<nums.length;i++){
        p=p*nums[i];
        while(p>=k){
            p=p/nums[l];
            l++;
        }
c+=i-l+1;
       }
return c;
    }
}