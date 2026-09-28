class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int count=0;
        for(int j=0;j<nums.length;j++){
           
          if(nums[j]!=val){
            count+=1;
            nums[i]=nums[j];
            i++;

          }
        }
        return count;
    }
}