package algorithms;
import edu.princeton.cs.algs4.*;
import java.util.Scanner;
//max 函数返回值为 counter 类型
public class FlipsMax {
    public static counter max(counter x, counter y)
    {
        if (x.tally() > y.tally()) return x;
        else                       return y;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Times: ");
        int T = Integer.parseInt(scanner.nextLine());
        counter heads = new counter("heads");
        counter tails = new counter("tails");
        for (int t = 0; t < T; t++)
            if (StdRandom.bernoulli(0.5)) heads.increment();
            else tails.increment();
        if (heads.tally() == tails.tally())
            StdOut.println("Tie");
        else StdOut.println(max(heads, tails) + " wins");
    }

}
