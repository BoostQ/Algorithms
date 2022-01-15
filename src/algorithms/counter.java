package algorithms;
import static edu.princeton.cs.algs4.StdOut.printf;

public  class counter {
    private final String name;
    private int count = 0;
    public counter(String id){
        this.name=id;
    }
    public void increment(){
        this.count++;
    }
    public int tally(){
        return count;
    }
    public String get_id(){
        return this.name;
    }
public String toString(){
        return ""+count+name;
}
//测试模块
    public static void main(String[] args) {
    counter n =new counter("tes");
    printf("%d\n",n.tally());
    n.increment();
    printf("%d\n",n.tally());
    printf(n.get_id()+"\n");
    printf(n.toString());
    }
}

