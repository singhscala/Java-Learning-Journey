package arrays;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0'},
                {'1', '0', '0'},
                {'0', '0', '1'}
        };

        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        int[][] directions = {
                {-1, 0}, // Up
                {1, 0},  // Down
                {0, -1}, // Left
                {0, 1}   // Right
        };

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1') {
                    count++;

                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i, j});

                    // Mark as visited
                    grid[i][j] = '0';

                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();

                        int r = cell[0];
                        int c = cell[1];

                        for (int[] dir : directions) {
                            int nr = r + dir[0];
                            int nc = c + dir[1];

                            if (nr >= 0 && nr < rows &&
                                    nc >= 0 && nc < cols &&
                                    grid[nr][nc] == '1') {

                                queue.offer(new int[]{nr, nc});
                                grid[nr][nc] = '0';
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}