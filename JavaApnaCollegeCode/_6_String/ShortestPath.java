import java.util.*;

public class ShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        getShortestPath(path);
    }

    public static void getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // West
            if (dir == 'N') {
                y++;
                // East
            } else if (dir == 'E') { 
                x++;
                //South
            } else if (dir == 'S') {
                y--;
                // West
            } else if (dir == 'W') {
                x--;
            }
        }

        // Calculate shortest path (Euclidean distance) from the origin (0, 0)
        double shortestPath = Math.sqrt(x * x + y * y);
        System.out.println("x: " + x + ", y: " + y);
        System.out.println("Shortest path: " + shortestPath);
    }
}
