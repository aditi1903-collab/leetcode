class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int maxh=0;
        while(l<=r){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            int area=h*w;
            maxh=Math.max(maxh,area);
            if(height[l]<=height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxh;
    }
}