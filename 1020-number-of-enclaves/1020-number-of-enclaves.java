class Solution {
    private int[] dx = {-1, 1, 0, 0};
    private int[] dy = {0, 0, -1, 1};
    private int move = 0;

    public int numEnclaves(int[][] grid) {
        var cnt = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                move = 0;
                if (grid[i][j] == 1 && DFS(i, j, grid)) {
                    cnt += move;
                }
            }
        }
        return cnt;
    }

    private boolean DFS(int y, int x, int[][] grid) {
        if (y < 0 || y >= grid.length || x < 0 || x >= grid[0].length)
            return false;
            
        if (grid[y][x] == 0)
            return true;

        grid[y][x] = 0;
        move++;

        var isWalkable = true;

        for(int i = 0; i < 4; i++) {
            int nY = y + dy[i];
            int nX = x + dx[i];

            isWalkable &= DFS(nY, nX, grid);
        }
        return isWalkable;
    }
}