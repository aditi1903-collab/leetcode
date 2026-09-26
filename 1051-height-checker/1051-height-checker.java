class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int[] h=heights.clone();
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=h[i]){
                c++;
            }
        }
        return c;
    }
}