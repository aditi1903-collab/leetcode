class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int c=1;
        for(int i=1; i<nums.length;i++){
            if(nums[i]!=nums[j]){
                nums[j+1]=nums[i];
                j++;
                c++;
            }
        }
        return c;
    }
}