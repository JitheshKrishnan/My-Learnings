//! Toics: Array, Math, Geometry

//* My Solution: 9ms

class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0;
        int n = points.length;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    int x1 = points[i][0];
                    int x2 = points[j][0];
                    int x3 = points[k][0];
                    int y1 = points[i][1];
                    int y2 = points[j][1];
                    int y3 = points[k][1];
                    double area = 0.5 * (double) Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
                    maxArea = Math.max(area, maxArea);
                }
            }
        }
        return maxArea;
    }
}

public class LargestTriangleArea {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(sol.largestTriangleArea(points));
    }
}