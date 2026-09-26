class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        // Frequency of characters required from t
        int[] freq = new int[128];

        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0;
        int right = 0;

        // Total number of characters still required
        int required = t.length();

        // Length of minimum window found so far
        int minLen = Integer.MAX_VALUE;

        // Starting index of minimum window
        int start = 0;

        while (right < s.length()) {

            char r = s.charAt(right);

            // If this character is still required
            if (freq[r] > 0) {
                required--;
            }

            // Add current character to the window
            freq[r]--;

            right++;

            // Window contains all characters of t
            while (required == 0) {

                // Update minimum window
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                // Remove leftmost character
                char l = s.charAt(left);

                freq[l]++;

                // If freq becomes positive,
                // we have removed a required character
                if (freq[l] > 0) {
                    required++;
                }

                left++;
            }
        }

        // No valid window found
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);  
    }
}