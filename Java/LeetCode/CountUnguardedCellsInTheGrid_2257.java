//! Topics: Array, Matrix, Simulation

//? Medium Difficulty

//* My Solution: 30ms

class Solution {
    int[][] dir = {{0,-1}, {-1,0}, {0,1}, {1,0}};
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int result = m*n - (guards.length + walls.length);
        int[][] visited = new int[m][n];
        for(int i = 0; i < guards.length; i++){
            int a = guards[i][0];
            int b = guards[i][1];
            visited[a][b] = 2;
        }
        for(int i = 0; i < walls.length; i++){
            int a = walls[i][0];
            int b = walls[i][1];
            visited[a][b] = 2;
        }
        for(int i = 0; i < guards.length; i++){
            for(int j = 0; j < 4; j++){
                result -= traverse(0, guards[i][0], guards[i][1], m, n, j, visited);
            }
        }
        return result;
    }
    public int traverse(int count, int a, int b, int m, int n, int x, int[][] visited){
        a += dir[x][0];
        b += dir[x][1];
        if(a >= m || a < 0 || b >= n || b < 0 || visited[a][b] == 2) return count;
        if(visited[a][b] == 1) return traverse(count, a, b, m, n, x, visited);
        visited[a][b] = 1;
        count++;
        return traverse(count, a, b, m, n, x, visited);
    }
}

public class CountUnguardedCellsInTheGrid_2257 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int m = 4, n = 6;
        int[][] guards = {{0,0},{1,1},{2,3}};
        int[][] walls = {{0,1},{2,2},{1,4}};
        System.out.println(sol.countUnguarded(m, n, guards, walls));
    }
}
