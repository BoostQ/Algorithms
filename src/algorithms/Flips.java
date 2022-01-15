package algorithms;
import edu.princeton.cs.algs4.*;
import java.util.Scanner;

public class Flips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Times: ");
        int T = Integer.parseInt(scanner.nextLine());
        counter heads = new counter("heads");
        counter tails = new counter("tails");
        for (int t = 0; t < T; t++)
            if (StdRandom.bernoulli(0.5))
                heads.increment();
            else tails.increment();
        StdOut.println(heads);
        StdOut.println(tails);
        int d = heads.tally() - tails.tally();
        StdOut.println("delta: " + Math.abs(d));
    }
}
