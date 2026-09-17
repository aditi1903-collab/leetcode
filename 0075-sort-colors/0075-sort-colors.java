class Solution {
    public void sortColors(int[] nums) {
        
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
         for (int num =0;num<nums.length;num++) {
            if (nums[num] == 0)
                count0++;
            else if (nums[num] == 1)
                count1++;
            else
                count2++;
        }
          int i = 0;

        while (count0 > 0) {
            nums[i++] = 0;
            count0--;
        }

        while (count1 > 0) {
            nums[i++] = 1;
            count1--;
        }

        while (count2 > 0) {
            nums[i++] = 2;
            count2--;
        }
    }
}