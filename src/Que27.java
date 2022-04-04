package src;

// Flood fill (Maze with obstacles)

public class Que27 {
    public static void main(String[] args) {
        int[][] maze = { { 0, 0, 0, 0 }, { 0, 1, 0, 1 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 } };
        boolean[][] visited = new boolean[4][4];
        floodFill("", maze, 0, 0, visited);
    }
    
    public static void floodFill(String path, int[][] maze, int row, int col, boolean[][] visited) {
        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1
                || visited[row][col] == true) {
            return;
        }
        
        if (row == maze.length - 1 || col == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        visited[row][col] = true;
    
        floodFill(path + 'T', maze, row - 1, col, visited);
        floodFill(path + 'L', maze, row, col - 1, visited);
        floodFill(path + 'D', maze, row + 1, col, visited);
        floodFill(path + 'R', maze, row, col + 1, visited);
        
        visited[row][col] = false;
    }
}
