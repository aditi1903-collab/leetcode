class Solution {
    public int maxScore(int[] cardPoints, int k) {
      
        int n = cardPoints.length;

        int total = 0;

        // Calculate total sum
        for (int num : cardPoints) {
            total += num;
        }

        int windowSize = n - k;

        int windowSum = 0;

        // First window
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        // Sliding window
        for (int right = windowSize; right < n; right++) {

            windowSum += cardPoints[right];

            windowSum -= cardPoints[right - windowSize];

            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return total - minWindowSum;
      
    }
}