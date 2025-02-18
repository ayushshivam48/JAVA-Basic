public class mazeToMovefromStratingtoGivenEnd {

    public static int countPaths(int i, int j, int n, int m) {
        // If we reach the bottom-right corner
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // If out of bounds, return 0
        if (i >= n || j >= m) {
            return 0;
        }

        // Move down
        int downPaths = countPaths(i + 1, j, n, m);
        // Move right
        int rightPaths = countPaths(i, j + 1, n, m);

        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n = 3, m = 3; // Grid size
        System.out.println(countPaths(0, 0, n, m));
    }
}
