import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

/**
 * Created by cuongdd2@gmail.com on 24-Mar-17.
 */
public class PercolationStats {

    private double[] t;
    private int test;
    private double mean = -1;
    private double sd = -1;


    /**
     * perform trials independent experiments on an n-by-n g
     */
    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) throw new IllegalArgumentException("invalid input n: " + n + ", trails: " + trials);
        this.test = trials;
        t = new double[trials];
        for (int i = 0; i < trials; i++) {
            Percolation p = new Percolation(n);
            boolean updated = false;
            while (!updated || !p.percolates()) {
                int open = p.numberOfOpenSites();
                p.open(StdRandom.uniform(n) + 1, StdRandom.uniform(n) + 1);
                updated = open != p.numberOfOpenSites();
            }
            t[i] = (double) p.numberOfOpenSites() / (n * n);
        }
    }

    /**
     * sample mean of percolation threshold
     */
    public double mean() {
        if (mean == -1) mean = StdStats.mean(t);
        return mean;
    }

    /**
     * sample standard deviation of percolation threshold
     */
    public double stddev() {
        if (sd == -1) sd = StdStats.stddev(t);
        return sd;
    }

    /**
     * low  endpoint of 95% confidence interval
     */
    public double confidenceLo() {
        return mean - 1.96 * stddev() / Math.sqrt(test);
    }

    /**
     * high endpoint of 95% confidence interval
     */
    public double confidenceHi() {
        return mean + 1.96 * stddev() / Math.sqrt(test);
    }

    /**
     * test client (described below)
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]), tt = Integer.parseInt(args[1]);
        PercolationStats ps = new PercolationStats(n, tt);
        StdOut.printf("%-23s = " + ps.mean() + "%n", "mean");
        StdOut.printf("%-23s = " + ps.stddev() + "%n", "stddev", ps.stddev());
        StdOut.printf("%-23s = [" + ps.confidenceLo() + ", " + ps.confidenceHi() + "]%n", "95% confidence interval");
    }
}
