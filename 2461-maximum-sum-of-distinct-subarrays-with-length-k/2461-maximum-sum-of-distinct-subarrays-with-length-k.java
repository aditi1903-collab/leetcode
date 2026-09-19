class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        // Sum of current window
          HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;

        // Maximum valid sum found so far
        long maxSum = 0;

        // Starting point of window
        int left = 0;

        // right = ending point of window
        for (int right = 0; right < nums.length; right++) {

            // Add nums[right] to the map
            map.put(
                nums[right],
                map.getOrDefault(nums[right], 0) + 1
            );

            // Add nums[right] to current sum
            sum += nums[right];

            // If window becomes bigger than k
            if (right - left + 1 > k) {

                // Remove nums[left] from map
                map.put(
                    nums[left],
                    map.get(nums[left]) - 1
                );

                // If frequency becomes 0, remove it
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                // Remove nums[left] from sum
                sum -= nums[left];

                // Move left forward
                left++;
            }

            // Window has k elements
            // AND all k elements are distinct
            if (right - left + 1 == k && map.size() == k) {

                // Update maximum sum
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;  
    }
}