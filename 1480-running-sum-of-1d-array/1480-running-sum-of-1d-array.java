class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] arr1=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            arr1[i]=sum;

        }
        return arr1;
    }
}