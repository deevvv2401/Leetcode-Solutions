

class Solution {

    public void bfs(int row, int col, boolean[][] vis, char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        vis[row][col] = true;
        q.offer(new int[]{row, col});

        while (!q.isEmpty()) {

            int[] arr = q.poll();
            int i = arr[0];
            int j = arr[1];

            if (i - 1 >= 0 && grid[i - 1][j] == '1' && !vis[i - 1][j]) {
                vis[i - 1][j] = true;
                q.add(new int[]{i - 1, j});
            }

            if (i + 1 < n && grid[i + 1][j] == '1' && !vis[i + 1][j]) {
                vis[i + 1][j] = true;
                q.add(new int[]{i + 1, j});
            }

            if (j - 1 >= 0 && grid[i][j - 1] == '1' && !vis[i][j - 1]) {
                vis[i][j - 1] = true;
                 q.add(new int[]{i, j - 1});
            }

            if (j + 1 < m && grid[i][j + 1] == '1' && !vis[i][j + 1]) {
                vis[i][j + 1] = true;
                q.add(new int[]{i, j + 1});
            }
        }
    }

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visit = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1' && !visit[i][j]) {
                    count++;
                    bfs(i, j, visit, grid);
                }
            }
        }

        return count;
    }
}