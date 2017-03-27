import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/**
 * Created by cuongdd2@gmail.com on 24-Mar-17.
 */
public class Percolation {

    private int n;
    private int[][] g;
    private WeightedQuickUnionUF uf;
    private int totalOpen = 0;

    /**
     * create n-by-n g, with all sites blocked
     */
    public Percolation(int n) {
        if (n <= 0) throw new IllegalArgumentException(n + " is not positive");
        this.n = n;
        g = new int[n + 2][n + 1];
        uf = new WeightedQuickUnionUF((n + 2) * (n + 1));
        for (int i = 0; i <= n + 1; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 0 || i == n + 1) {
                    g[i][j] = 0;
                    uf.union(idx(i, 1), idx(i, j));
                } else g[i][j] = 1;
            }
        }
    }

    /**
     * open site (row, col) if it is not open already
     */
    public void open(int r, int c) {
        if (!isValid(r, c)) throw new IndexOutOfBoundsException("row: " + r + ", col: " + c + " is invalid");
        if (g[r][c] == 1) {
            g[r][c] = 0;
            totalOpen++;
            int idx = idx(r, c);
            connect(r - 1, c, idx);
            connect(r + 1, c, idx);
            connect(r, c - 1, idx);
            connect(r, c + 1, idx);
        }
    }

    private void connect(int r, int c, int idx) {
        if (r >= 0 && r <= n + 1 && c > 0 && c <= n && g[r][c] == 0) uf.union(idx(r, c), idx);
    }

    /**
     * is site (row, col) open?
     */
    public boolean isOpen(int row, int col) {
        if (!isValid(row, col)) throw new IndexOutOfBoundsException("row: " + row + ", col: " + col + " is invalid");
        return g[row][col] == 0;
    }

    /**
     * is site (row, col) full?
     */
    public boolean isFull(int row, int col) {
        if (!isValid(row, col)) throw new IndexOutOfBoundsException("row: " + row + ", col: " + col + " is invalid");
        if (g[row][col] == 1) return false;
        return uf.connected(idx(row, col), idx(0, 1));
    }

    /**
     * number of open sites
     */
    public int numberOfOpenSites() {
        return totalOpen;
    }

    /**
     * does the system percolate?
     */
    public boolean percolates() {
        if (n == 1 && totalOpen == 1) return true;
        if (totalOpen < n) return false;

        return uf.connected(idx(0, 1), idx(n + 1, 1));
    }

    /**
     * Helper methods
     */
    private boolean isValid(int r, int c) {
        return r > 0 && c > 0 && r <= n && c <= n;
    }

    private int idx(int r, int c) {
        return r * n + c;
    }

}
