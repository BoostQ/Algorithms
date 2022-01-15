
public class test {
    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]); Arrays.sort(whitelist);
        while (!StdIn.isEmpty())
        {
            int key = StdIn.readInt(); if (rank(key, whitelist) < 0)
            StdOut.println(key);
        }
    }
}